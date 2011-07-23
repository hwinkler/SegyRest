/*
 * Created on May 31, 2003
 *
 * To change the template for this generated file go to
 * Window>Preferences>Java>Code Generation>Code and Comments
 */
package com.scoutsys.segy;

import junit.framework.TestCase;

/**
 * @author Hugh
 *
 * To change the template for this generated type comment go to
 * Window>Preferences>Java>Code Generation>Code and Comments
 */
public class IEEEFloatTest extends TestCase {
	private static final float [] f = new float []{7.8924e-30f, 3.234e-10f,6.184e-5f, .19327f, 9.0613e5f, 3.101e10f, 2.194e30f};

	private float eps = 1e-6f;

	/**
	 * Constructor for IEEEFloatTest.
	 * @param arg0
	 */
	public IEEEFloatTest(String arg0) {
		super(arg0);
	}

	
	public void testFromToFloat(){
		for (int i=0; i< f.length; i++){
			IEEEFloat ibm = new IEEEFloat (f[i]);
			assertEquals ("toFloat", f[i], ibm.toFloat(), eps*f[i]);
		}
		for (int i=0; i< f.length; i++){
			IEEEFloat ibm = new IEEEFloat (-f[i]);
			assertEquals ("toFloat", -f[i], ibm.toFloat(), eps*f[i]);
		}
	}


	
	public void testRoundTrip() {
			
		IEEEFloat ieee= new IEEEFloat();
		ieee.sign = 1;
		ieee.exponent = 129;
		ieee.mantissa= 0x0198EE;
		float f1 = ieee.toFloat(); // -4.049918
		

		IEEEFloat ieee2 = new IEEEFloat(f1);
	
		float f2 = ieee2.toFloat();
		
		assertEquals(ieee.sign, ieee2.sign);
		assertEquals(ieee.exponent, ieee2.exponent);
		assertEquals(ieee.mantissa, ieee2.mantissa);
	}
	


	

	public static void main(String[] args) {
		junit.textui.TestRunner.run(IEEEFloatTest.class);
	}
}
