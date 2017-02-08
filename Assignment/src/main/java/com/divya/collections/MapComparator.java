package com.divya.collections;

import java.util.Comparator;
import java.util.Map;

public class MapComparator implements Comparator<Integer>{
     Map<Integer,String> ob;
     
	public MapComparator(Map<Integer,String> ob){
	 this.ob=ob;
	}
	public int compare(Integer k1,Integer k2) {
		return ob.get(k1).compareTo(ob.get(k2));
		
	}

}
