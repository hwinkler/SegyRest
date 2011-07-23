/*
 * Created on Jun 1, 2003
 *
 * To change the template for this generated file go to
 * Window>Preferences>Java>Code Generation>Code and Comments
 */
package com.scoutsys.servlet.segy.content;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

import junit.framework.TestCase;

/**
 * @author Hugh
 *
 * To change the template for this generated type comment go to
 * Window>Preferences>Java>Code Generation>Code and Comments
 */
public class ContentFactoryTest extends TestCase {
    private File tempFile;

    /**
     * Constructor for ContentFactoryTest.
     * @param arg0
     */
    public ContentFactoryTest(String arg0) {
        super(arg0);
    }

    public void testCreateContentRequest()
        throws IOException, URISyntaxException {
        File directory = tempFile.getParentFile();
        assertTrue(
            "Checking to make sure our test is valid: can we use the temp directory?",
            directory.isDirectory());

        boolean didCatch = false;
        try {
            ContentFactory.createContentRequest(
                new URI("http://foo.com:8080/agamemnon/"),
                directory,
                "help/us");
        } catch (NotFoundException e) {
            didCatch = true;
        }
        assertTrue("Should throw NotFoundException on bad request", didCatch);

        try {
            ContentFactory.createContentRequest(
                new URI("http://foo.com:8080/agamemnon/"),
                directory,
                tempFile.getName());
        } catch (NotFoundException e) {
            fail("Did not find the temp file " + tempFile.toString());
        }
    }

    public static void main(String[] args) {
        junit.textui.TestRunner.run(ContentFactoryTest.class);
    }

    /**
     * @see junit.framework.TestCase#setUp()
     */
    protected void setUp() throws Exception {
        super.setUp();
        tempFile = File.createTempFile("A48D", null);
        tempFile.deleteOnExit();
    }

    /**
     * @see junit.framework.TestCase#tearDown()
     */
    protected void tearDown() throws Exception {

        super.tearDown();
    }

}
