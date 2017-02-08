package com.divya.collections;

import java.util.HashSet;
import java.util.Set;

public class FindDuplictesUsingSet {
	Set<String> hs=new HashSet<String>();
	
	public void getduplicate(String[] arr){		    //set will return false for adding duplicate value
		for(String s:arr){
			if(hs.add(s)==false){
				System.out.println("duplicate element in array : "+s);
			}
					}
		
	}
	public static void main(String[] args) {
		FindDuplictesUsingSet ob=new FindDuplictesUsingSet();
		String[] arr={"divya","gunnu","one",null,"two","cheenu","deepa","two",null};
		ob.getduplicate(arr);

	}

}
