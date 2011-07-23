/*
 * Created on Jun 1, 2003
 *
 * To change the template for this generated file go to
 * Window>Preferences>Java>Code Generation>Code and Comments
 */
package com.scoutsys.servlet.segy.content;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.URI;
import java.nio.charset.Charset;

/**
 * @author Hugh
 *
 * To change the template for this generated type comment go to
 * Window>Preferences>Java>Code Generation>Code and Comments
 */
public class SegyTraceListingContent implements Content {
    private URI fileURI;
    private long[] traceIDs;

    private byte[] bytes;
    private long lastModified;

    /**
     * 
     */
    public SegyTraceListingContent(URI fileURI, File file, long[] traceIDs) {
        this.fileURI = fileURI;
        this.traceIDs = traceIDs;
        this.lastModified = file.lastModified();

    }
    private void buildXML() throws IOException {

        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        OutputStreamWriter writer =
            new OutputStreamWriter(baos, Charset.forName("UTF-8"));
        writer.write("<?xml version=\"1.0\" encoding=\"UTF-8\"?>\n");
        writer.write(
            "<traces xml:base=\""
                + fileURI.toASCIIString()
                + "/trace/\" "
                + " xmlns:xlink=\"http://www.w3.org/1999/xlink\">\n");
        for (int i = 0; i < traceIDs.length; i++) {
            writer.write(
                "  <trace xlink:type=\"simple\" xlink:href=\""
                    + traceIDs[i]
                    + "\"/>\n");
        }
        writer.write("</traces>\n");

        writer.flush();
        baos.flush();
        bytes = baos.toByteArray();
    }

    /**
     * @see com.scoutsys.servlet.segy.content.Content#getContentLength()
     */
    public long getContentLength() throws IOException {
        if (bytes == null) {
            buildXML();
        }
        return bytes.length;
    }

    /* (non-Javadoc)
     * @see com.scoutsys.servlet.segy.content.Content#writeContent(java.lang.String, java.io.OutputStream)
     */
    public void writeContent(String contentType, OutputStream out)
        throws UnsupportedContentTypeException, IOException {
        if (!contentType.equals(ContentType.XML)) {
            throw new UnsupportedContentTypeException(contentType);
        }
        if (bytes == null) {
            buildXML();
        }
        out.write(bytes);
    }

    /* (non-Javadoc)
     * @see com.scoutsys.servlet.segy.content.Content#availableContentTypes()
     */
    public String[] availableContentTypes() {
        return new String[] { ContentType.XML };
    }
    /* (non-Javadoc)
     * @see com.scoutsys.servlet.segy.content.Content#getLastModified()
     */
    public long getLastModified() {
        return lastModified;
    }

}
