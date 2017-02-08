package com.divya.general;

public class AccessModifier2 {

	public static void main(String[] args) {
		AccessModifier1 ob = new AccessModifier1();
		//ob.testPrivate(); --> not accessible 
		ob.testDefault();
		ob.testProtected();
		ob.testPubic();

	}

}
