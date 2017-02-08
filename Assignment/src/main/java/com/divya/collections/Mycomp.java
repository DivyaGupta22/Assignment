package com.divya.collections;

import java.util.Comparator;

public class Mycomp implements Comparator<String> {

	public int compare(String str1,String str2) {
		return str1.compareTo(str2);
	}

}
