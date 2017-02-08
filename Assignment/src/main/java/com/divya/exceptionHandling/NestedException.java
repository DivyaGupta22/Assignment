package com.divya.exceptionHandling;

public class NestedException {

	public void divide(int a,int b){

		System.out.println(a/b);
	}
	public void sum(int a,int b){

		System.out.println(a+b);
	}
		
	public void calculate(int a,int b){
		try{divide(a,b);
		}catch(Exception e){                //exception handled at parent method
			System.out.println(e);
			//e.printStackTrace();
				} 
		sum(a,b);
		}

	public static void main(String[] args) {
		NestedException ob=new NestedException();
		ob.calculate(6,0);
		

	}

}
