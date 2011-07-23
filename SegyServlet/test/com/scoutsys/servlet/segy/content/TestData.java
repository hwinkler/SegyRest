/*
 * Created on Jun 2, 2003
 *
 * To change the template for this generated file go to
 * Window>Preferences>Java>Code Generation>Code and Comments
 */
package com.scoutsys.servlet.segy.content;

import java.io.File;
import java.io.FileOutputStream;

import com.scoutsys.segy.SegyLineHeader;
import com.scoutsys.segy.SegyTrace;

/**
 * @author Hugh
 *
 * To change the template for this generated type comment go to
 * Window>Preferences>Java>Code Generation>Code and Comments
 */
class TestData {
    int numTraces; 
    int lineLength; 
    int numSamples;
    File tempFile;
    
    int getExpectedLength(int numTraces) {
        return 3600 + numTraces * (240 + 4 * numSamples);
    }

    /**
     * 
     */
    public TestData(int numTraces, int lineLength, int numSamples ) {
        super();
        this.numTraces = numTraces;
        this.numSamples = numSamples;
        this.lineLength = lineLength;
        
    }
    
     File getFile(){
        return tempFile;
    }
    
    int getNumInlines(){
        return numTraces / lineLength;
    }
    int getNumCrosslines(){
        return lineLength;
    }
    
    int getNumTraces(){
        return numTraces;
    }
    
    
    /**
     * @see junit.framework.TestCase#tearDown()
     */
    void tearDown() throws Exception {
    
        
    }

    /**
     * @see junit.framework.TestCase#setUp()
     */
    void setUp() throws Exception {

        tempFile = File.createTempFile("A49Q", null);
        tempFile.deleteOnExit();
    
        byte[] reelHeader = new byte[3200];
        SegyLineHeader lh = new SegyLineHeader();
        lh.numSamples = (short) numSamples;
        byte[] lineHeader = lh.save(false);
    
        FileOutputStream out = new FileOutputStream(tempFile);
        out.write(reelHeader);
        out.write(lineHeader);
        for (int i = 0; i < numTraces; i++) {
            SegyTrace tr = new SegyTrace();
            tr.fieldFileNum = 1 + i / lineLength;
            tr.seqNumFieldFile = 1 + i % lineLength;
            tr.setSamples(new float[numSamples]);
            out.write(tr.toBytes(false));
        }
    
        out.close();
    
    }

}
