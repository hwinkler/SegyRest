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
public class SegyCrosslineContent extends SegyLineContentBase{


    private int crosslineNumber;

    private File file;

    /**
     * 
     */
    public SegyCrosslineContent(URI fileURI, File file, int crosslineNumber)
        throws IOException, NotFoundException {
        super(fileURI, file);

        long tracesPerInline = super.determineLineLength();
        long totalNumTraces = super.determineTotalNumTraces();
        
        long firstTrace = crosslineNumber;
        long stride = tracesPerInline;
        long numTraces = totalNumTraces/tracesPerInline;

        loadTraces(firstTrace, stride, numTraces);
    }

}
