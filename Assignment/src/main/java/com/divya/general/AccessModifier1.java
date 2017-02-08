package com.divya.general;

public class AccessModifier1 {
   
	 private void testPrivate(){
		 System.out.println("Test method for Private AccessModifier");
	 }
	
	 void testDefault(){
		 System.out.println("Test method for Default AccessModifier");
	 }
	 
	protected void testProtected(){
		 System.out.println("Test method for Protected AccessModifier");
	 }
	 
	public void testPubic(){
		System.out.println("Test method for Public AccessModifier");
	}
	 
	 
	public static void main(String[] args) {
		AccessModifier1 ob=new AccessModifier1();
		ob.testPrivate();
		ob.testDefault();
		ob.testProtected();
		ob.testPubic();
		

	}

}
