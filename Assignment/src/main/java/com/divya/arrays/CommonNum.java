package com.divya.arrays;

public class CommonNum {
	public void getCommon(int[] a,int[] b){
		int comm =0;
		boolean iscomm;
		for (int i=0;i<a.length-1;i++){
			for(int j=0;j<b.length-1;j++){
				if (a[i]==b[j]){
					 iscomm=true;
					 comm= b[j];					
					break;
				}
			}
			
		}
		if (iscomm=true){
			System.out.println("common number is :"+comm);
		
			
		}else{
			System.out.println("no common number");
		}
			
		
	}
	

	public static void main(String[] args) {
		int[] a={2,0,7,5,9,66,19};
		int[] b={77,15,66,8,35,1};
		
		CommonNum ob=new CommonNum();
		ob.getCommon(a, b);
	}

}
