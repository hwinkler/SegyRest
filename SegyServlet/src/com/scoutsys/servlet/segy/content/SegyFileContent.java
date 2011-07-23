/*
 * Created on May 29, 2003
 *
 * To change the template for this generated file go to
 * Window>Preferences>Java>Code Generation>Code and Comments
 */
package com.scoutsys.servlet.segy.content;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.URI;

/**
 * @author Hugh
 *
 * To change the template for this generated type comment go to
 * Window>Preferences>Java>Code Generation>Code and Comments
 */
public class SegyFileContent implements Content, ContentComposer {
    File file;
    URI baseURI;

    public SegyFileContent(URI baseURI, File file) {
        super();
        this.file = file;
        this.baseURI = baseURI.resolve(file.getName());
    }

    /**
     * @see com.scoutsys.servlet.segy.content.Content#writeContent(java.lang.String, java.io.OutputStream)
     */
    public void writeContent(String contentType, OutputStream out)
        throws UnsupportedContentTypeException, IOException {
        if (!contentType.equals(ContentType.SEGY)) {
            throw new UnsupportedContentTypeException(contentType);
        }
        FileInputStream in = new FileInputStream(file);
        byte[] buffer = new byte[1024 * 10];
        int count;
        while ((count = in.read(buffer)) > 0) {
            out.write(buffer, 0, count);
        }
    }

    /**
     * @see com.scoutsys.servlet.segy.content.Content#availableContentTypes()
     */
    public String[] availableContentTypes() {
        return new String[] { ContentType.SEGY };
    }

    /**
     * @see com.scoutsys.servlet.segy.content.Content#getContentLength()
     */
    public long getContentLength() {
        return file.length();
    }

    /** 
     * @see com.scoutsys.servlet.segy.content.ContentComposer#composeWith(java.lang.String, java.lang.String)
     */
    public ContentComposer composeWith(String keyName, String keyValue)
        throws NotFoundException {
        ContentComposer composer;
        try {
            if (keyName.equals("inline")) {
                int lineNumber = Integer.parseInt(keyValue);
                composer = new SegyInlineContent(baseURI, file, lineNumber);
            } else if (keyName.equals("crossline")) {
                int lineNumber = Integer.parseInt(keyValue);
                composer = new SegyCrosslineContent(baseURI, file, lineNumber);
            } else if (keyName.equals("trace")) {
                int traceNumber = Integer.parseInt(keyValue);
                composer = new SegyTraceContent(baseURI, file, traceNumber);
            } else {
                throw new NotFoundException();
            }
        } catch (NumberFormatException x) {
            throw new NotFoundException();
        } catch (IOException x) {
            throw new NotFoundException();
        }
        return composer;
    }

    /**
     * @see com.scoutsys.servlet.segy.content.ContentComposer#getContent(boolean)
     */
    public Content getContent(boolean listing) {
        return this;
    }

    /* (non-Javadoc)
     * @see com.scoutsys.servlet.segy.content.Content#getLastModified()
     */
    public long getLastModified() {

        return file.lastModified();
    }

}
