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
public class IBMFloatTest extends TestCase {
	//2^x = e^(x ln 2)
	
	private static final float [] f = new float []{7.8924e-30f, 3.234e-10f,6.184e-5f, .19327f, 9.0613e5f, 3.101e10f, 2.194e30f};

	private float eps = 1e-6f;
	/**
	 * Constructor for IBMFloatTest.
	 * @param arg0
	 */
	public IBMFloatTest(String s) {
		super(s);
		
			
	}
	
	public void testFromToFloat(){
		for (int i=0; i< f.length; i++){
			IBMFloat ibm = new IBMFloat (f[i]);
			assertEquals ("toFloat", f[i], ibm.toFloat(), eps*f[i]);
		}
		for (int i=0; i< f.length; i++){
			IBMFloat ibm = new IBMFloat (-f[i]);
			assertEquals ("toFloat", -f[i], ibm.toFloat(), eps*f[i]);
		}
	}

	public void testRoundTrip(){
		IEEEFloat ieee= new IEEEFloat();
		ieee.sign = 1;
		ieee.exponent = 129;
		ieee.mantissa= 0x0198EE;
		float f1 = ieee.toFloat();
		
		IBMFloat ibm = new IBMFloat(f1);
		float f2 = ibm.toFloat();
		
		assertEquals( "Roundtrip from/to float", f1, f2, 0.f);
	}
	
	public void testFromToBytes(){
		byte [] b = new byte[4];
		for (int i=0; i< f.length; i++){
			
			IBMFloat ibm = new IBMFloat (f[i]);
			ibm.toBytes(b, 0);
			ibm = new IBMFloat();
			ibm.fromBytes(b, 0);
			assertEquals ("toFloat", f[i], ibm.toFloat(), eps*f[i]);
		}
		for (int i=0; i< f.length; i++){
			
			IBMFloat ibm = new IBMFloat (-f[i]);
			ibm.toBytes(b, 0);
			ibm = new IBMFloat();
			ibm.fromBytes(b, 0);
			assertEquals ("toFloat", -f[i], ibm.toFloat(), eps*f[i]);
		}
		
	}
	public static void main(String[] args) {
		junit.textui.TestRunner.run(IBMFloatTest.class);
	}

}
