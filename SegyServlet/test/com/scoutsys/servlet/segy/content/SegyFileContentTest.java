/*
 * Created on Jun 1, 2003
 *
 * To change the template for this generated file go to
 * Window>Preferences>Java>Code Generation>Code and Comments
 */
package com.scoutsys.servlet.segy.content;

import java.net.URI;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

/**
 * @author Hugh
 *
 * Tests for the SegyFileContent class.
 */
public class SegyFileContentTest extends ContentTestBase {
    
    public SegyFileContentTest(String arg0) {
        super(arg0);
    }

    public static void main(String[] args) {
        junit.textui.TestRunner.run(SegyFileContentTest.class);
    }




    /* (non-Javadoc)
     * @see com.scoutsys.servlet.segy.content.ContentTestBase#doCreateContent()
     */
    protected Collection doCreateContent() throws Exception {
        SegyFileContent c =
            new SegyFileContent(new URI("http://foo.com:7654/"), testData.getFile());
        ArrayList list  = new ArrayList();
        list.add (c);
        return list;
         
    }

    /**
     * should return all the traces
     * @see com.scoutsys.servlet.segy.content.ContentTestBase#doGetExpectedContentLength(com.scoutsys.servlet.segy.content.Content)
     */
    protected long doGetExpectedContentLength(Content c) {
        // 
        return testData.getExpectedLength(testData.getNumTraces());
    }

    /**
     * Only application/seg-y
     * @see com.scoutsys.servlet.segy.content.ContentTestBase#doGetExpectedContentTypes()
     */
    protected Set doGetExpectedContentTypes() {
        HashSet set = new HashSet ();
        set.add( ContentType.SEGY);
        return set;
    }

    /* (non-Javadoc)
     * @see com.scoutsys.servlet.segy.content.ContentTestBase#doGetKeyValuePairs()
     */
    protected Collection doGetKeyValuePairs() {
        ArrayList keyValuePairs = new ArrayList();
        for (int i=0; i<testData.getNumInlines(); i++) {
            KeyValuePair kvp = new KeyValuePair ("inline", Integer.toString(i+1), true);
            keyValuePairs.add(kvp);
        }
        for (int i=0; i<testData.getNumCrosslines(); i++) {
            KeyValuePair kvp = new KeyValuePair ("crossline", Integer.toString(i+1), true);
            keyValuePairs.add(kvp);
        }
        
        for (int i=0; i<testData.getNumTraces(); i++) {
            KeyValuePair kvp = new KeyValuePair ("trace", Integer.toString(i+1), true);
            keyValuePairs.add(kvp);
        }
        keyValuePairs.add(new KeyValuePair ("inline", "0", false));
        keyValuePairs.add(new KeyValuePair ("inline", "99999999", false));
        keyValuePairs.add(new KeyValuePair ("inline", "xyz", false));
        keyValuePairs.add(new KeyValuePair ("crossline", "0", false));
        keyValuePairs.add(new KeyValuePair ("crossline", "99999999", false));
        keyValuePairs.add(new KeyValuePair ("crossline", "xyz", false));
        keyValuePairs.add(new KeyValuePair ("trace", "0", false));
        keyValuePairs.add(new KeyValuePair ("trace", "99999999", false));
        keyValuePairs.add(new KeyValuePair ("trace", "xyz", false));
        keyValuePairs.add(new KeyValuePair ("xyz", "1", false));
        return keyValuePairs;
    }
    /* (non-Javadoc)
     * @see com.scoutsys.servlet.segy.content.ContentTestBase#doGetIsComposable(com.scoutsys.servlet.segy.content.Content)
     */
    protected boolean doGetIsComposable() throws Exception {

        return true;
    }
}
