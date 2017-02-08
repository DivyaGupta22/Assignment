package com.divya.AccessModifier;

import com.divya.general.AccessModifier1;

public class AccessModifier3 extends AccessModifier1  {

	public static void main(String[] args) {
		AccessModifier3 ob=new AccessModifier3();
		ob.testProtected();
		ob.testPubic();
		
		//ob.testPrivate(); --> not accessible 
		//ob.testDefault(); > not accessible
		
		

	}

}
