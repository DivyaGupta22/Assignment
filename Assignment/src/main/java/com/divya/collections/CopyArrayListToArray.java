package com.divya.collections;

import java.util.ArrayList;
import java.util.List;

public class CopyArrayListToArray {
   
	public void getCopy(){
		List<String> al=new ArrayList<String>();
		al.add("Divya");
		al.add("Rohit");
		al.add("Rivya");
		al.add("Sobhit");
		al.add("Mala");
		
		System.out.println("AraayList : "+al);
		
		String[] strarr=new String[al.size()];
		al.toArray(strarr);
		
		for(String s:strarr){
		System.out.println(s);
		}
		
	}
	public static void main(String[] args) {
		CopyArrayListToArray ob=new CopyArrayListToArray();
		ob.getCopy();

	}

}
