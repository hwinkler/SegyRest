/*
 * Created on May 27, 2003
 *
 * To change the template for this generated file go to
 * Window>Preferences>Java>Code Generation>Code and Comments
 */
package com.scoutsys.xml;

import java.io.IOException;
import java.io.InputStream;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.FactoryConfigurationError;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;

import org.apache.xpath.XPathAPI;
import org.apache.xpath.objects.XObject;
import org.w3c.dom.Document;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

/**
 * @author Hugh
 *
 * To change the template for this generated type comment go to
 * Window>Preferences>Java>Code Generation>Code and Comments
 */
public abstract class XMLObjectBase implements Unmarshalable {

    private Document document;

    public XMLObjectBase() {
        super();
    }

    private void unmarshal(InputSource inputSource) throws UnmarshalException {
        try {
            document =
                DocumentBuilderFactory
                    .newInstance()
                    .newDocumentBuilder()
                    .parse(
                    inputSource);
        } catch (SAXException e) {
            throw new UnmarshalException(e);
        } catch (IOException e) {
            throw new UnmarshalException(e);
        } catch (ParserConfigurationException e) {
            throw new UnmarshalException(e);
        } catch (FactoryConfigurationError e) {
            throw new UnmarshalException(e);
        }
    }

    public void unmarshal(InputStream in) throws UnmarshalException {
        InputSource inputSource = new InputSource(in);
        unmarshal(inputSource);
    }

    public void unmarshal(InputStream in, String encoding)
        throws UnmarshalException {
        InputSource inputSource = new InputSource(in);
        inputSource.setEncoding(encoding);
        unmarshal(inputSource);
    }

    protected double doubleValue(String xpath) throws XPathException {
        String result = null;
        XObject xObject;
        try {
            xObject = XPathAPI.eval(document, xpath);
            return xObject.num();
        } catch (TransformerException e) {
            throw new XPathException(xpath, e);
        }
    }

    protected String stringValue(String xpath) throws XPathException {
        String result = null;
        XObject xObject;
        try {
            xObject = XPathAPI.eval(document, xpath);
            return xObject.str();
        } catch (TransformerException e) {
            throw new XPathException(xpath, e);
        }
    }

    protected int count(String xpath) throws XPathException {
        XObject xObject;
        try {
            xObject = XPathAPI.eval(document, xpath);
            return xObject.nodelist().getLength();
        } catch (TransformerException e) {
            throw new XPathException(xpath, e);
        }

    }

}
