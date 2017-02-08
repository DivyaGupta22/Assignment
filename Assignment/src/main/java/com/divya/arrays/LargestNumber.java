package com.divya.arrays;

public class LargestNumber {
	public void getLargest(){
		int max =0;
	int[] arr = {108,90,87,12,45,110,67,150};
	 for(int i=0;i< arr.length-1;i++ ){
		 if (arr[i+1]>arr[max]){
			 max=i+1;
		 }
		
	 }
	 System.out.println("largest number in Array : "+arr[max]);
	}
	public static void main(String[] args) {
		LargestNumber ob=new LargestNumber();
		ob.getLargest();

	}

}
