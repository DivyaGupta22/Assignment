package com.divya.AccessModifier;

import com.divya.general.AccessModifier1;

public class AccessModifier4 {

	public static void main(String[] args) {
		AccessModifier1 ob=new AccessModifier1();
		ob.testPubic();
		
				//ob.testPrivate(); --> not accessible 
				//ob.testDefault();  --> not accessible 
				//ob.testProtected();  --> not accessible 
		

	}

}
