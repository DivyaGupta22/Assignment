package com.divya.arrays;

public class MergeArray {
	public static void getMerge(int[] a,int[] b){
		int length=a.length+b.length;
		int[] c= new int[length];
		for (int i=0;i<a.length;i++){
			c[i]=a[i];
		}
		int temp = a.length;
		for(int j=temp;j<c.length;j++){
			c[j]=b[j-temp];
		}
		
		for(int i=0;i<c.length;i++){
			System.out.println(c[i]);
		}
		
	}
	
	public void sortedMerge(int[] a,int[] b){
		int length=a.length+b.length;
		int[] c= new int[length];
		int i=0;int j=0;int k=0;
		
		while(i<a.length && j<b.length){
			if(a[i]<b[j]){
				c[k]=a[i];
				i++;
			}else {
				c[k]=b[j];
				j++;
			}
			k++;
		}
		
		while(i<a.length){
			c[k]=a[i];
			i++;
			k++;
		}
		
	 while(j<b.length){
		 c[k]=b[j];
		 j++;
		 k++;
	 }
	 
	 for(int h=0;h<c.length;h++){
		 System.out.println(c[h]);
	 }
	}

	public static void main(String[] args) {
		int[] arr1={2,45,3,11,5};
		int[] arr2={9,44,8,6,3};
		
		MergeArray ob=new MergeArray();
		//ob.getMerge(arr1, arr2);
		ob.sortedMerge(arr1, arr2);

	}

}
