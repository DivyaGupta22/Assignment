package com.divya.collections;

public class EnumMonths {

	public enum Month{
		JANUARY,FEBRUARY,MARCH,APRIL,MAY,JUNE,JULY,AUGUSET,SEPTEMBER,OCTOBER,NOVEMBER,DECEMBER
			}
	
	public static void main(String[] args) {
		for(Month m:Month.values()){
			System.out.println(m);
		}

	}

}
