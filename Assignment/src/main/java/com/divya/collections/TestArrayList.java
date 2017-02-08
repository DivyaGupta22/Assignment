package com.divya.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class TestArrayList {
  public void arrayListmethods(){
	  List<String> al=new ArrayList<String>();
	  al.add("divya");
	  al.add("seema");
	  al.add("12");
	  al.add("school");
	  al.add("one");
	  
	  
	  //searching of element
	  if(al.contains("12")){
		  System.out.println("Index of given element :"+ al.indexOf("12"));
	  }
	  
	  //print the elements of list using iterator
	  Iterator<String> itr=al.iterator();
	  while(itr.hasNext()){
		  System.out.println(itr.next());
	  }
	  
	  //print the elements list in reverse order using ListIterator
	  //ListIterator having hasPrevious() and previous() methods 
	  
	  ListIterator<String> litr=al.listIterator(al.size());	  
	  while(litr.hasPrevious()){
		  System.out.println(litr.previous());
	  }
	  
	  
 
  }
	
  
	public static void main(String[] args) {
		TestArrayList ob=new TestArrayList();
		ob.arrayListmethods();

	}

}
