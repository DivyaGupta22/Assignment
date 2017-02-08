package com.divya.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TestHashMap {
  public void getHashMap(int searchkey){
	  Map<Integer,String> hm=new HashMap<Integer,String>();
	  hm.put(1, "one");
	  hm.put(2, "two");
	  hm.put(9, "nine");
	  hm.put(15,"five");
	  hm.put(2, "twooo");
	  
	  
	  //searching a key in map and returning its value
	 	  if(hm.containsKey(searchkey)){
		  System.out.println("value of search key is: "+hm.get(searchkey));
		  	  }else {
		  		  System.out.println("Given key not found in hasmap");
		  	  }
	  
	  Set<Integer> keys=hm.keySet();
	  for(Integer key:keys){
		  System.out.println("keys: "+key +"  value: "+hm.get(key));
		  
		 
	  }
  }
	public static void main(String[] args) {
		TestHashMap ob =new TestHashMap();
		ob.getHashMap(10);

	}

}
