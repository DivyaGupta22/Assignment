package com.divya.arrays;

public class MissingNum {
 public int sumOfNumbers(int n){
	 int sum =(n*(n+1))/2;
	 return sum;
 }
 public int sumOfElements(int[] arr){
	 int sum=0;
	 for(int i=0;i<arr.length;i++){
		 sum=sum+arr[i];
		 	 }
	 return sum;
  }


	public static void main(String[] args) {
		 int n=9;
		 int[] arr={2,8,5,6,9,4,3,1};
		 MissingNum ob=new MissingNum();
		 int missingNum=ob.sumOfNumbers(n) - ob.sumOfElements(arr);
		 System.out.println(missingNum);
		
	
	}
}
