/*
 * Created on Jun 3, 2003
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
public class SegyTraceContent extends SegyLineContentBase {

    /**
     * @param fileURI
     * @param file
     * @throws IOException
     */
    public SegyTraceContent(URI fileURI, File file, long traceNumber)
        throws IOException, NotFoundException {
        super(fileURI, file);

        long firstTrace =traceNumber;
        long stride = 1;
        long numTraces = 1;

        loadTraces(firstTrace, stride, numTraces);
    }

}
