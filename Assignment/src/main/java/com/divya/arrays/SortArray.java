package com.divya.arrays;


public class SortArray {
    public void getSort(int[] a){
    	int temp =0;
    	for(int i=a.length-1;i>=0;i--){  //bubble sort
    		for(int j=1;j<=i;j++){
    		if (a[j]<a[j-1]){
    			temp=a[j-1];
    			a[j-1]=a[j];
    			a[j]=temp;
    		}
    	}
    	}
    	
    	for(int i=0;i<a.length;i++){
    		System.out.println(a[i]);
    	}
    	
    }
    
    
	public static void main(String[] args) {
		int[] arr ={77,-9,9,57,11,0,3,109,-1,2};
		SortArray ob=new SortArray();
		ob.getSort(arr);
		
		

	}

}
