/*
 * Created on May 28, 2003
 *
 * To change the template for this generated file go to
 * Window>Preferences>Java>Code Generation>Code and Comments
 */
package com.scoutsys.xml;

import java.io.InputStream;

/**
 * @author Hugh
 *
 * To change the template for this generated type comment go to
 * Window>Preferences>Java>Code Generation>Code and Comments
 */
public interface Unmarshalable {
    public abstract void unmarshal(InputStream in) throws UnmarshalException;
    public abstract void unmarshal(InputStream in, String encoding)
        throws UnmarshalException;
}