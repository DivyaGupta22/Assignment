package com.divya.loops;

public class Fibonaci {
	public void getfibonaci(int count){
		int[] fibo=new int[count];
		
		fibo[0]=0;
		fibo[1]=1;
		
		for (int i=2;i<count;i++){
			fibo[i]=fibo[i-1]+fibo[i-2];
						
		}
		
		for(int i=0;i<count;i++){
			System.out.println(fibo[i]);
		}
		
	}

	public static void main(String[] args) {
		Fibonaci ob=new Fibonaci();
		ob.getfibonaci(10);

	}

}
