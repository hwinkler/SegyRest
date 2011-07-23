/*
 * Created on Jun 2, 2003
 *
 * To change the template for this generated file go to
 * Window>Preferences>Java>Code Generation>Code and Comments
 */
package com.scoutsys.servlet.segy.content;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

import junit.framework.TestCase;

/**
 * @author Hugh
 *
 * To change the template for this generated type comment go to
 * Window>Preferences>Java>Code Generation>Code and Comments
 */
public abstract class ContentTestBase extends TestCase {
    protected TestData testData;
    private static final int NUMTRACES = 10;
    private static final int NUMSAMPLES = 100;
    private static final int LINELENGTH = 5;

    public ContentTestBase(String arg0) {
        super(arg0);
    }

    public static void main(String[] args) {
        junit.textui.TestRunner.run(ContentTestBase.class);
    }

    /**
     * Subclass should create a collection of its Content implementation.
     * Create as many as are neccessary to perform a good test. For example,
     * you could create one for every record in a test data set.
     * @return the test Contet implementations
     */

    protected abstract Collection doCreateContent() throws Exception;

    protected abstract long doGetExpectedContentLength(Content c)
        throws Exception;

    protected abstract boolean doGetIsComposable()
        throws Exception;

    protected abstract Set doGetExpectedContentTypes() throws Exception;

    protected abstract Collection doGetKeyValuePairs() throws Exception;

    public void testGetContentLength() throws Exception {
        for (Iterator it = doCreateContent().iterator(); it.hasNext();) {
            Content c = (Content) it.next();
            long expectedLength = doGetExpectedContentLength(c);
            assertEquals(
                "expected length of content must match reported length",
                expectedLength,
                c.getContentLength());

            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            c.writeContent(c.availableContentTypes()[0], baos);
            baos.flush();
            assertEquals(
                "actual length of content must match reported length",
                expectedLength,
                baos.size());

        }
    }

    public void testWriteContent() throws Exception {
        for (Iterator it = doCreateContent().iterator(); it.hasNext();) {

            Content c = (Content) it.next();
            ByteArrayOutputStream baos = new ByteArrayOutputStream();

            try {
                c.writeContent(c.availableContentTypes()[0], baos);
            } catch (UnsupportedContentTypeException e) {
                fail("got UnsupportedContentTypeException " + e);
            }
            ByteArrayInputStream bais =
                new ByteArrayInputStream(baos.toByteArray());
            InputStreamReader reader = new InputStreamReader(bais);

            long expectedLength = doGetExpectedContentLength(c);
            for (long i = 0; i < expectedLength; i++) {
                try {
                    reader.read();
                } catch (IOException x) {
                    fail("only read " + i + " bytes");
                }
            }

            boolean didCatch = false;
            baos = new ByteArrayOutputStream();
            try {
                c.writeContent("foo/bar", baos);
            } catch (UnsupportedContentTypeException e) {
                didCatch = true;
            }
            assertTrue(
                "Expecting an UnsupportedContentTypeException ",
                didCatch);
        }

    }

    public void testAvailableContentTypes() throws Exception {
        for (Iterator it = doCreateContent().iterator(); it.hasNext();) {

            Content c = (Content) it.next();

            String[] types = c.availableContentTypes();
            Set expectedTypes = doGetExpectedContentTypes();

            assertEquals(
                "Number of avaialble types",
                expectedTypes.size(),
                types.length);
            for (int i = 0; i < types.length; i++) {
                assertTrue(
                    "Available type " + types[i],
                    expectedTypes.contains(types[i]));
            }
        }

    }

    public void testComposeWith() throws Exception {
        for (Iterator it = doCreateContent().iterator(); it.hasNext();) {

            //folowing statement assumes a lot...we will fix it later.
            ContentComposer c;
            try {
                c = (ContentComposer) it.next();
            } catch(ClassCastException x){
                if (doGetIsComposable()) {
                    fail("Content class should be composable");
                }
                return;
            }

            ContentComposer composer;

            Collection keyValuePairs = doGetKeyValuePairs();

            for (Iterator it2 = keyValuePairs.iterator(); it2.hasNext();) {
                KeyValuePair keyValuePair = (KeyValuePair) it2.next();
                try {
                    composer =
                        c.composeWith(
                            keyValuePair.getKey(),
                            keyValuePair.getValue());

                    if (!keyValuePair.isValid()) {
                        fail(
                            "Should throw NotFoundException for "
                                + keyValuePair.getKey()
                                + "/"
                                + keyValuePair.getValue());
                    }
                    assertNotNull(
                        "composer must not be null for "
                            + keyValuePair.getKey()
                            + "/"
                            + keyValuePair.getValue(),
                        composer);
                } catch (NotFoundException x) {
                    if (keyValuePair.isValid()) {
                        fail(
                            "could not compose "
                                + keyValuePair.getKey()
                                + "/"
                                + keyValuePair.getValue());
                    }
                }

            }
        }
    }

    protected void setUp() throws Exception {
        super.setUp();
        testData = new TestData(NUMTRACES, LINELENGTH, NUMSAMPLES);
        testData.setUp();
    }

    protected void tearDown() throws Exception {
        super.tearDown();
    }
}
