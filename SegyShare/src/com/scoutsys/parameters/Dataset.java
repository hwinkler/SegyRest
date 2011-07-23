/*
 * Created on May 28, 2003
 *
 * To change the template for this generated file go to
 * Window>Preferences>Java>Code Generation>Code and Comments
 */
package com.scoutsys.parameters;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;

import com.scoutsys.xml.XMLObjectBase;
import com.scoutsys.xml.XPathException;

/**
 * @author Hugh
 *
 * To change the template for this generated type comment go to
 * Window>Preferences>Java>Code Generation>Code and Comments
 */
public class Dataset extends XMLObjectBase {
    private ArrayList lineURIs = new ArrayList();

    public Dataset() {
        super();
    }

    public int getNumLines() throws XPathException {
        return count("/Dataset/Lines/Line");
    }
    public URI getLineURI(int i) throws URISyntaxException, XPathException {
        return new URI(stringValue("/Dataset/Lines/Line[" + i + "]/@uri"));
    }

}
