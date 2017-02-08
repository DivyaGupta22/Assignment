package com.divya.general;

public class GCTest {
	@Override
	protected void finalize(){
		System.out.println("object is garbage collected");
		
	}

	public static void main(String[] args) {
		GCTest ob1 =new GCTest();
		GCTest ob2=new GCTest();
		ob1=null;
		ob2=null;
		System.gc();
		

	}

}
