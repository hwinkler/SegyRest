/*
 * Created on May 27, 2003
 *
 * To change the template for this generated file go to
 * Window>Preferences>Java>Code Generation>Code and Comments
 */
package com.scoutsys.xml;
import java.io.ByteArrayInputStream;
import java.io.InputStream;

import junit.framework.TestCase;

/**
 * @author Hugh
 *
 * To change the template for this generated type comment go to
 * Window>Preferences>Java>Code Generation>Code and Comments
 */
public class XMLObjectBaseTest extends TestCase {
    public String xp1 = "/foo/bar";
    public String xp2 = "/foo/baz";
    public String xp3 = "/foo/boo";
    public String xp4 = "/foo/boo[0]/@a";
    public String xp5 = "/foo/boo[1]/@a";
    public String xp6 = "/foo/boo[2]/@a";
    public String xml =
        "<?xml version=\"1.0\"?>"
            + "<foo><bar>the rain in spain</bar><baz>7</baz><boo a=\"A\"/><boo a=\"B\"/></foo>";
    class Derived extends XMLObjectBase {

        void testXPath() {
            InputStream in = new ByteArrayInputStream(xml.getBytes());
            try {
                unmarshal(in);
            } catch (UnmarshalException e) {
                fail("unmarshaling");
            }

            try {
                String s1 = stringValue(xp1);
                assertEquals("the rain in spain", s1);
            } catch (XPathException e1) {
                fail("stringValue");
            }

            try {
                double d = doubleValue(xp2);
                assertEquals(7.0, d, 0.0);
            } catch (XPathException e2) {
                fail("doubleValue");
            }

            try {
                int count = count(xp3);
                assertEquals(2, count);
            } catch (XPathException e3) {
                fail("count");
            }

            try {
                String a = stringValue(xp4);
                assertEquals("", a);
            } catch (XPathException e4) {
                fail("index 0");
            }

            try {
                String a = stringValue(xp5);
                assertEquals("A", a);
            } catch (XPathException e4) {
                fail("index 0");
            }

            try {
                String b = stringValue(xp6);
                assertEquals("B", b);
            } catch (XPathException e5) {
                fail("index 1");
            }

        }
    }
    public void testXPath() {

        Derived d = new Derived();
        d.testXPath();

    }
    /**
     * Constructor for XMLObjectBaseTest.
     * @param arg0
     */
    public XMLObjectBaseTest(String arg0) {
        super(arg0);
    }

    public static void main(String[] args) {
        junit.textui.TestRunner.run(XMLObjectBaseTest.class);
    }

}
