/*
 * Created on Jun 2, 2003
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
 * Test for SegyCrosslineContent
 * @author Hugh
 */
public class SegyCrosslineContentTest extends ContentTestBase {
    TestData testData;

    public SegyCrosslineContentTest(String arg0) {
        super(arg0);
    }

    public static void main(String[] args) {
        junit.textui.TestRunner.run(SegyCrosslineContentTest.class);
    }

    protected void setUp() throws Exception {
        super.setUp();
        final int NUMTRACES = 10;
        final int NUMSAMPLES = 100;
        final int LINELENGTH = 5;
        testData = new TestData(NUMTRACES, LINELENGTH, NUMSAMPLES);
        testData.setUp();
    }

    protected void tearDown() throws Exception {
        super.tearDown();
    }

    /**
     * @see com.scoutsys.servlet.segy.content.ContentTestBase#doCreateContent()
     */
    protected Collection doCreateContent() throws Exception {
        ArrayList list = new ArrayList();
        for (int iLine = 0; iLine < testData.getNumCrosslines(); iLine++) {
            SegyCrosslineContent c =
                new SegyCrosslineContent(
                    new URI("http://foo.com:7654/"),
                    testData.getFile(),
                    iLine + 1);
            list.add(c);
        }
        return list;
    }

    /**
     * @see com.scoutsys.servlet.segy.content.ContentTestBase#doGetExpectedContentLength(com.scoutsys.servlet.segy.content.Content)
     */
    protected long doGetExpectedContentLength(Content c) throws Exception {
        return testData.getExpectedLength(testData.getNumInlines());
    }

    /**
     * @see com.scoutsys.servlet.segy.content.ContentTestBase#doGetExpectedContentTypes()
     */
    protected Set doGetExpectedContentTypes() throws Exception {
        HashSet set = new HashSet();
        set.add(ContentType.SEGY);
        return set;
    }

    /**
     * @see com.scoutsys.servlet.segy.content.ContentTestBase#doGetKeyValuePairs()
     */
    protected Collection doGetKeyValuePairs() throws Exception {

        ArrayList keyValuePairs = new ArrayList();

        //we don't yet support getting a trace from the context of a line Content
        KeyValuePair kvp = new KeyValuePair("trace", "1", false);
        keyValuePairs.add(kvp);

        return keyValuePairs;
    }

    /* (non-Javadoc)
     * @see com.scoutsys.servlet.segy.content.ContentTestBase#doGetIsComposable(com.scoutsys.servlet.segy.content.Content)
     */
    protected boolean doGetIsComposable() throws Exception {

        return true;
    }

}
