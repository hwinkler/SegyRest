/*
 * Created on May 11, 2003
 *
 * To change the template for this generated file go to
 * Window>Preferences>Java>Code Generation>Code and Comments
 */
package com.scoutsys.servlet.segy;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Calendar;
import java.util.Iterator;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.scoutsys.servlet.segy.config.Config;
import com.scoutsys.servlet.segy.content.Content;
import com.scoutsys.servlet.segy.content.ContentFactory;
import com.scoutsys.servlet.segy.content.NotFoundException;
import com.scoutsys.servlet.segy.content.PathParser;
import com.scoutsys.servlet.segy.content.UnsupportedContentTypeException;

/**
 * @author Hugh
 *
 * To change the template for this generated type comment go to
 * Window>Preferences>Java>Code Generation>Code and Comments
 */
public class SegyServlet extends HttpServlet {
    Config config;
    /**
     * 
     */
    public SegyServlet() {
        super();
    }

    /* (non-Javadoc)
     * @see javax.servlet.http.HttpServlet#doDelete(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    protected void doDelete(
        HttpServletRequest request,
        HttpServletResponse response)
        throws ServletException, IOException {
        super.doDelete(request, response);
    }

    /* (non-Javadoc)
     * @see javax.servlet.http.HttpServlet#doGet(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    protected void doGet(
        HttpServletRequest request,
        HttpServletResponse response)
        throws ServletException, IOException {

        //Returns any extra path information associated with the URL the client sent when it made this request. The extra path information follows the servlet path but precedes the query string. 
        //This method returns null if there was no extra path information. 		
        String pathInfo = request.getPathInfo();
        PathParser parsedPathInfo = new PathParser(pathInfo);
        initConfig();
        try {
            boolean matchedARelativeUri = false;
            
            for (Iterator it = config.enumerateUris(); it.hasNext();) {
                String relativeUri = (String) it.next();
                if (parsedPathInfo.startsWith(relativeUri)) {
                    matchedARelativeUri = true;

                    // the path begins with the uri of a local directory
                    // look it up in the configuration
                    File directory =
                        config.directoryForRelativeUri(relativeUri);

                    if (directory != null
                        && directory.exists()
                        && directory.isDirectory()
                        && directory.isAbsolute()) {

                        URI fullURI =
                            URI.create(request.getRequestURL().toString());

                        URI relativeURIBase =
                            new URI(
                                fullURI.getScheme(),
                                fullURI.getAuthority(),
                                request.getContextPath()
                                    + request.getServletPath()
                                    + "/"
                                    + relativeUri
                                    + "/",
                                null,
                                null);

                        // Determine what resource exactly the user wants in here
                        Content content =
                            ContentFactory.createContentRequest(
                                relativeURIBase,
                                directory,
                                pathInfo.substring(relativeUri.length() + 1));

                        // Content-Type
                        String contentType = content.availableContentTypes()[0];
                        response.setContentType(contentType);

                        // Content-Length
                        if (content.getContentLength() >= 0) {
                            //in case the file is > 2GB insert the Content-Length header manually here
                            response.setHeader(
                                "Content-length",
                                Long.toString(content.getContentLength()));
                        }

                        // Expires: a year from now (meaning, "never" says RFC 2616)
                        Calendar calendar = Calendar.getInstance();
                        calendar.add(Calendar.YEAR, 1);
                        response.setDateHeader(
                            "Expires",
                            calendar.getTimeInMillis());

                        //Last-Modified:
                        response.setDateHeader(
                            "Last-Modified",
                            content.getLastModified());

                        boolean deliverContent = true;
                        if (-1L
                            != request.getDateHeader("If-Modified-Since")) {
                             long since =
                                request.getDateHeader("If-Modified-Since");

                            if (since > content.getLastModified()) {
                                deliverContent = false;
                            }
                        }

                        if (deliverContent) {

                            content.writeContent(
                                contentType,
                                response.getOutputStream());

                        } else {
                            response.setStatus(
                                HttpServletResponse.SC_NOT_MODIFIED);
//                            response.getWriter().write(
//                                "<html><head><title>304 not modified</title></head><body><h1>not modified</h1></body></html>");
                        }

                        break;
                    } else {
                        // it's a misconfiguration, but we still can't find the resource...
                        throw new NotFoundException();
                    }
                }
            }
            if (!matchedARelativeUri) {
                throw new NotFoundException(pathInfo);
            }

        } catch (NotFoundException x) {
            response.sendError(HttpServletResponse.SC_NOT_FOUND);

        } catch (URISyntaxException x) {
            response.sendError(HttpServletResponse.SC_NOT_FOUND);

        } catch (UnsupportedContentTypeException x) {
            response.sendError(HttpServletResponse.SC_UNSUPPORTED_MEDIA_TYPE);
        }

    }

    /**
     * 
     */
    private void initConfig() {
        if(config == null){
            config = new Config();
        }
        
    }

    /**
     * @param string
     * @return
     */
    private Content determineContentRequest(String path) {
        return null;
    }

    /* (non-Javadoc)
     * @see javax.servlet.http.HttpServlet#doPut(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    protected void doPut(
        HttpServletRequest request,
        HttpServletResponse response)
        throws ServletException, IOException {
        super.doPut(request, response);
    }

    /* (non-Javadoc)
     * @see javax.servlet.http.HttpServlet#getLastModified(javax.servlet.http.HttpServletRequest)
     */
    protected long getLastModified(HttpServletRequest request) {
        return super.getLastModified(request);
    }

    /* (non-Javadoc)
     * @see javax.servlet.Servlet#init()
     */
    public void init() throws ServletException {
        super.init();
        log("initialized");
    }

}
