package com.divya.general;

public class StaticBlocknMethod {
 
	int empID;
	String name;
	static String company;
	
	static{
		System.out.println("static block");         //Static block 
		//company = "Accenture";
	}
	
	public StaticBlocknMethod(int e,String n){      //Constructor
		empID=e;
		name =n;
	}
	
	public static String getCompany(){           //static method
		company = "oracle";
		return company;
	}
	
	
	public void getvalues(){
		System.out.println(" EmpId: "+empID +" name : "+name+" Company: "+ getCompany());
	}
	
	public static void main(String[] args) {
		
		System.out.println("I am in main");
		StaticBlocknMethod ob =new StaticBlocknMethod(12,"divya");
		ob.getvalues();
	}

}
