package com.divya.loops;

public class SwapNumber {
	public void swapWithoutThirdVar(int num1,int num2){
		System.out.println("before swap num1 : "+ num1); 
		System.out.println("before swap num2 : "+ num2); 
		
		num1=num1+num2;
		num2=num1-num2;
		num1=num1-num2;
		
		System.out.println("afer swap num1 : "+ num1); 
		System.out.println("after swap num2 : "+ num2); 
		
	}
	
	public void swapWithThirdVar(int num1,int num2){
		int num3;
		System.out.println("before swap num1 : "+ num1); 
		System.out.println("before swap num2 : "+ num2); 
		num3=num1;
		num1=num2;
		num2=num3;
		
		System.out.println("afer swap num1 : "+ num1); 
		System.out.println("after swap num2 : "+ num2); 
	}

	public static void main(String[] args) {
		SwapNumber ob=new SwapNumber();
		ob.swapWithoutThirdVar(15, 23);
		ob.swapWithThirdVar(90, 12);

	}

}
