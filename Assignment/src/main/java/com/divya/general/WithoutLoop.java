package com.divya.general;

//printing 1 to 10 number without using loop

public class WithoutLoop {
   
	public  static void count(int n){
		if (n<=10){
			System.out.println(n);
			count(n+1);
		}
	}
	public static void main(String[] args) {
		count(1);

	}	

}
