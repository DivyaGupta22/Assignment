package com.divya.arrays;

public class LinearSearch {
	public void getLinerSearch(int[] a,int num){
		boolean ismatch=false;
		for(int i=0;i<a.length;i++){
			if(a[i]==num){
				ismatch=true;
				System.out.println("matching element found at index:"+i);
				break;
			}
		}
		
		if(ismatch!=true){
			System.out.println("no matching element");
			
		}
	
	}

	public static void main(String[] args) {
		int[] arr= {11,2,4,56,23,0,19,66};
		LinearSearch ob=new LinearSearch();
		ob.getLinerSearch(arr, 0);
		

	}

}
