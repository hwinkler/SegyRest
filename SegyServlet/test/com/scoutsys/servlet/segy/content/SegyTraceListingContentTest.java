/*
 * Created on Jun 3, 2003
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
 * 
 * @author Hugh
 *
 */
public class SegyTraceListingContentTest extends ContentTestBase {

    /**
     * @param arg0
     */
    public SegyTraceListingContentTest(String arg0) {
        super(arg0);
    }

    /* (non-Javadoc)
     * @see com.scoutsys.servlet.segy.content.ContentTestBase#doCreateContent()
     */
    protected Collection doCreateContent() throws Exception {
        ArrayList list = new ArrayList();
        long [] traceIDs = new long[testData.getNumTraces()];
        for(int i=0; i<traceIDs.length; i++){
            traceIDs[i] = i+1;
        }
        SegyTraceListingContent c =
               new SegyTraceListingContent( new URI("http://foo.com:7654/"),  testData.getFile(), traceIDs);
        list.add(c);
        
        return list;
    }

    /* (non-Javadoc)
     * @see com.scoutsys.servlet.segy.content.ContentTestBase#doGetExpectedContentLength(com.scoutsys.servlet.segy.content.Content)
     */
    protected long doGetExpectedContentLength(Content c) throws Exception {
        // not much we can do. just return the reported length.
        // the test will still check that the actual content length equlas that.
        return c.getContentLength();
    }

    /* (non-Javadoc)
     * @see com.scoutsys.servlet.segy.content.ContentTestBase#doGetExpectedContentTypes()
     */
    protected Set doGetExpectedContentTypes() throws Exception {
        HashSet set = new HashSet();
        set.add( ContentType.XML);
        return set;
    }

    /* (non-Javadoc)
     * @see com.scoutsys.servlet.segy.content.ContentTestBase#doGetKeyValuePairs()
     */
    protected Collection doGetKeyValuePairs() throws Exception {
        ArrayList keyValuePairs = new ArrayList();

        //From this context no subkeys are allowed period.
        KeyValuePair kvp1 = new KeyValuePair ("trace", "1", false);
        KeyValuePair kvp2 = new KeyValuePair ("inline", "1", false);
        KeyValuePair kvp3 = new KeyValuePair ("crossline", "1", false);
        keyValuePairs.add(kvp1);
        keyValuePairs.add(kvp2);
        keyValuePairs.add(kvp3);

        return keyValuePairs;
    }
    /* (non-Javadoc)
     * @see com.scoutsys.servlet.segy.content.ContentTestBase#doGetIsComposable(com.scoutsys.servlet.segy.content.Content)
     */
    protected boolean doGetIsComposable() throws Exception {

        return false;
    }
    public static void main(String[] args) {
        junit.textui.TestRunner.run(SegyTraceListingContentTest.class);
    }
}
