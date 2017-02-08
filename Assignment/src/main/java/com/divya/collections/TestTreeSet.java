package com.divya.collections;


import java.util.Set;
import java.util.TreeSet;

public class TestTreeSet {
	
	Set<String> ts=new TreeSet<String>(new Mycomp());
	public void getsorted(){
       String[] arr1 ={"a1","a2","a3","a4","a5","a6","a7","a8"};
       String[] arr2 ={"b1","b2","b3","b4","b5","b6","b7","b8"};
       
       for(String s:arr1){
    	   ts.add(s);
    	   }
       
       for(String s:arr2){
    	   ts.add(s);
       }
       
		/*ts.add("a1");
		ts.add("a2");
		ts.add("a3");
		ts.add("b1");
		ts.add("b2");*/
		
       System.out.println("sorted treeset is : ");
     
       for(String s:ts){
    	   System.out.println(s);
       }
       }

	 public static void main(String[] args){
		 TestTreeSet ob=new TestTreeSet();
		 ob.getsorted();
	 }
		
	}


