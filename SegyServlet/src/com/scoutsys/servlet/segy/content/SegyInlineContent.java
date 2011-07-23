/*
 * Created on May 29, 2003
 *
 * To change the template for this generated file go to
 * Window>Preferences>Java>Code Generation>Code and Comments
 */
package com.scoutsys.servlet.segy.content;

import java.io.File;
import java.io.IOException;
import java.net.URI;

/**
 * @author Hugh
 *
 * To change the template for this generated type comment go to
 * Window>Preferences>Java>Code Generation>Code and Comments
 */
public class SegyInlineContent extends SegyLineContentBase {

    private int inlineNumber;

    private File file;

    /**
     * 
     */
    public SegyInlineContent(URI fileURI, File file, int inlineNumber)
        throws IOException, NotFoundException {
        super(fileURI, file);

        long tracesPerLine = super.determineLineLength();
        long firstTrace = 1 + (tracesPerLine * (inlineNumber - 1));
        long stride = 1;
        long numTraces = tracesPerLine;

        loadTraces(firstTrace, stride, numTraces);
    }

}
