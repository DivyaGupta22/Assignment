package com.divya.general;

// class is final so cannot create subclass
//variable is final so we can't change value of it after creating object
//no setter method 

public final class ImmutableClass {
  
	private final int empId;
	
	public ImmutableClass(int empId){
		this.empId=empId;
		
	}
	
	public void getEmpId(){
		System.out.println( empId);
	}
	
	public static void main(String[] args) {
		ImmutableClass ob =new ImmutableClass(80);
			ob.getEmpId();
				
		
	}

}
