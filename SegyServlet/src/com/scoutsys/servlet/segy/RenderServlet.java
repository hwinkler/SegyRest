/*
 * Created on May 11, 2003
 *
 * To change the template for this generated file go to
 * Window>Preferences>Java>Code Generation>Code and Comments
 */
package com.scoutsys.servlet.segy;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.awt.image.RenderedImage;
import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Calendar;
import java.util.Iterator;

import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.scoutsys.render.LabelRenderer;
import com.scoutsys.render.RenderException;
import com.scoutsys.render.TraceRenderOptions;
import com.scoutsys.render.TraceRenderer;
import com.scoutsys.segy.SegyLineHeader;
import com.scoutsys.segy.SegyTrace;
import com.scoutsys.servlet.segy.config.Config;
import com.scoutsys.servlet.segy.content.Content;
import com.scoutsys.servlet.segy.content.ContentFactory;
import com.scoutsys.servlet.segy.content.NotFoundException;
import com.scoutsys.servlet.segy.content.PathParser;
import com.scoutsys.servlet.segy.content.SegyLineContentBase;
import com.scoutsys.trace.IHeader;
import com.scoutsys.trace.InvalidHeaderValueException;

/**
 * @author Hugh
 *
 * To change the template for this generated type comment go to
 * Window>Preferences>Java>Code Generation>Code and Comments
 */
public class RenderServlet extends HttpServlet {
    Config config;
    /**
     * 
     */
    public RenderServlet() {
        super();
    }

    /* (non-Javadoc)
     * @see javax.servlet.http.HttpServlet#doGet(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    protected void doGet(
        HttpServletRequest request,
        HttpServletResponse response)
        throws ServletException, IOException {

        // uri = /segy/render
        // contextPath = /segy
        // url = "http://localhost:8080/segy/render"

        //		accept  image/gif, image/x-xbitmap, image/jpeg, image/pjpeg, application/vnd.ms-excel, application/msword, */*  
        //		referer  http://localhost:8080/examples/servlets/index.html  
        //		accept-language  en-us  
        //		accept-encoding  gzip, deflate  
        //		user-agent  Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1; .NET CLR 1.0.3705)  
        //		host  localhost:8080  
        //		connection  Keep-Alive  
        //		cookie  JSESSIONID=694E699E22E6CBDD0EC2722487CFAD64  

        //parameters:
        // data:	uri identifies the data 
        // tpcm: traces per cm
        // cmps: cm per s
        // w:  width
        // h:  height
        // p: uri identifies palette

        //Returns any extra path information associated with the URL the client sent when it made this request. The extra path information follows the servlet path but precedes the query string. 
        //This method returns null if there was no extra path information.         
        String pathInfo = request.getPathInfo();
        PathParser parsedPathInfo = new PathParser(pathInfo);

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
//                        if (content.getContentLength() >= 0) {
//                            //in case the file is > 2GB insert the Content-Length header manually here
//                            response.setHeader(
//                                "Content-length",
//                                Long.toString(content.getContentLength()));
//                        }

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

                            // begin code different from SegyServlet
                            if (!(content instanceof SegyLineContentBase)) {
                                throw new NotFoundException();
                            }
                            RenderedImage image;
                            try {
                                image =
                                    createRenderedImage(
                                        (SegyLineContentBase) content);
                            } catch (RenderException e) {
                                throw new ServletException(e);
                            }
                            response.setContentType("image/png");

                            ImageIO.write(
                                image,
                                "png",
                                response.getOutputStream());

                        } else {
                            response.setStatus(
                                HttpServletResponse.SC_NOT_MODIFIED);
                            //                             response.getWriter().write(
                            //                                 "<html><head><title>304 not modified</title></head><body><h1>not modified</h1></body></html>");
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

        }

    }

    /**
     * @param base
     * @return
     */
    private RenderedImage createRenderedImage(SegyLineContentBase content)
        throws RenderException {
        SegyTrace[] traces = content.getTraces();
        SegyLineHeader lineHeader = content.getLineHeader();

        TraceRenderOptions options = new TraceRenderOptions();

        TraceRenderer traceRenderer = new TraceRenderer();
        float[][] samples = new float[traces.length][];

        IHeader[] headers = new Header[traces.length];

        for (int i = 0; i < traces.length; i++) {
            samples[i] = traces[i].getSamples();
            headers[i] = new Header(traces[i]);
        }

        RenderedImage tracesImage =
            traceRenderer.render(samples, 0, lineHeader.sampleIntervalUS, null);

        RenderedImage timeLabelImage =
            LabelRenderer.renderTimeLabel(
                null,
                null,
                0,
                lineHeader.numSamples * lineHeader.sampleIntervalUS / 1000);

        RenderedImage topLabelImage =
            LabelRenderer.renderTopLabel(null, null, headers);

        BufferedImage image =
            new BufferedImage(
                tracesImage.getWidth() + timeLabelImage.getWidth(),
                tracesImage.getHeight() + topLabelImage.getHeight(),
                BufferedImage.TYPE_INT_RGB);

        AffineTransform tracesTransform =
            AffineTransform.getTranslateInstance(
                timeLabelImage.getWidth(),
                topLabelImage.getHeight());

        AffineTransform topLabelTransform =
            AffineTransform.getTranslateInstance(timeLabelImage.getWidth(), 0);

        AffineTransform timeLabelTransform =
            AffineTransform.getTranslateInstance(0, topLabelImage.getHeight());
            
            
        Graphics2D g= image.createGraphics();
        g.setBackground(Color.WHITE);
        g.clearRect(0, 0, image.getWidth(), image.getHeight());
        g.drawRenderedImage(timeLabelImage, timeLabelTransform);
        g.drawRenderedImage(topLabelImage, topLabelTransform);
        g.drawRenderedImage(tracesImage, tracesTransform);
        g.dispose();
        
        return image;

    }

    /* (non-Javadoc)
     * @see javax.servlet.http.HttpServlet#doPost(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse)
     */
    protected void doPost(
        HttpServletRequest request,
        HttpServletResponse response)
        throws ServletException, IOException {

    }

    /* (non-Javadoc)
     * @see javax.servlet.GenericServlet#init()
     */
    public void init() throws ServletException {
        super.init();
        config = new Config();
        log("initialized");

    }

    private float[][] makeSampleTraces() {
        int numTraces = 60;
        double dt = .004;
        int nt = 1000;
        double intercept = .7;
        double slope = -.01;

        float[] sampleValues =
            { .1f, .4f, .5f, .4f, .1f, -.1f, -.4f, -.5f, -.4f, -.1f };
        float[][] traces = new float[numTraces][];

        for (int i = 0; i < numTraces; i++) {
            float[] trace = new float[nt];
            double tFirst = intercept + slope * i;
            int iFirst = (int) Math.round(tFirst / dt);
            for (int j = 0; j < sampleValues.length; j++) {

                trace[iFirst + j] = sampleValues[j];
            }
            traces[i] = trace;
        }
        return traces;
    }
    static class Header implements IHeader {
        SegyTrace trace;
        Header(SegyTrace trace) {
            this.trace = trace;
        }

        /* (non-Javadoc)
         * @see com.scoutsys.trace.IHeader#getAllNames()
         */
        public String[] getAllNames() {
            // TODO Auto-generated method stub
            return null;
        }
        /* (non-Javadoc)
         * @see com.scoutsys.trace.IHeader#getAllValues()
         */
        public Object[] getAllValues() {
            // TODO Auto-generated method stub
            return null;
        }
        /* (non-Javadoc)
         * @see com.scoutsys.trace.IHeader#getValue(java.lang.String)
         */
        public Object getValue(String name) {
            // TODO Auto-generated method stub
            return null;
        }
        /* (non-Javadoc)
         * @see com.scoutsys.trace.IHeader#setValue(java.lang.String, java.lang.Object)
         */
        public void setValue(String name, Object value)
            throws InvalidHeaderValueException {
            // TODO Auto-generated method stub

        }
    }

}
