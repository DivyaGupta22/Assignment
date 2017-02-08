package com.divya.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

//Sorting map by values

public class MapSortByValue {
	public void getSortValue(){
		Map<Integer,String> hmap=new HashMap<Integer,String>();
		
		hmap.put(9, "nine");
		hmap.put(1, "one");
		hmap.put(2, "two");
		hmap.put(5,"five");
		hmap.put(3, "twooo");
		System.out.println("Unsorted :");
		Set<Integer> keys=hmap.keySet();
		for(Integer key:keys){
			System.out.println("keys :"+key+" value: "+hmap.get(key));
		}
		
		
		Map<Integer,String> tmap=new TreeMap<Integer,String>(new MapComparator (hmap));
		tmap.putAll(hmap);
		
		System.out.println("Sorted :");
		Set<Integer> keyss=tmap.keySet();
		for(Integer key:keyss){
			System.out.println("keys :"+key+" value: "+tmap.get(key));
					}
		
		
	}

	public static void main(String[] args) {
		MapSortByValue ob=new MapSortByValue();
		ob.getSortValue();

	}

}
