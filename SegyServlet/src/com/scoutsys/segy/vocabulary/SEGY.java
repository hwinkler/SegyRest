/*
 * Created on May 11, 2003
 *
 * To change the template for this generated file go to
 * Window>Preferences>Java>Code Generation>Code and Comments
 */
package com.scoutsys.segy.vocabulary;

import com.hp.hpl.jena.rdf.model.Property;
import com.hp.hpl.jena.rdf.model.RDFException;
import com.hp.hpl.jena.rdf.model.impl.PropertyImpl;




/**
 * @author Hugh
 *
 * To change the template for this generated type comment go to
 * Window>Preferences>Java>Code Generation>Code and Comments
 */
public class SEGY {

	// next free error code = 2
    
	protected static final String uri =
		"http://scoutsys.com/segy/elements/1.0/";
    
/** returns the URI for this schema
 * @return the URI for this schema
 */    
	public static String getURI()
	{
		return uri;
	}
    

	static final String   nlatitude = "latitude";
	public static       Property latitude;  
	static final String   nlongitude = "longitude";
	public static       Property longitude;  


    
	static {
		try {
			latitude   = new PropertyImpl(uri, nlatitude);
			longitude   = new PropertyImpl(uri, nlongitude);
		} catch (RDFException e) {
			//TODO ErrorHelper.logInternalError("RDF", 20 /*was 1 for DC*/, e);
		}
	}
}
