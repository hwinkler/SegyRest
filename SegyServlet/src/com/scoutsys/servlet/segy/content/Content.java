/*
 * Created on May 29, 2003
 *
 * To change the template for this generated file go to
 * Window>Preferences>Java>Code Generation>Code and Comments
 */
package com.scoutsys.servlet.segy.content;

import java.io.IOException;
import java.io.OutputStream;

/**
 * @author Hugh
 *
 * To change the template for this generated type comment go to
 * Window>Preferences>Java>Code Generation>Code and Comments
 */
public interface Content {
    long getContentLength() throws IOException;
    long getLastModified();
    void writeContent(String contentType, OutputStream out)
        throws UnsupportedContentTypeException, IOException;
    String[] availableContentTypes();
}
