package com.divya.strings;

public class ReverseString {
	public void getReverseString(String s){
		char[] ch = s.toCharArray();
		
		System.out.println("Reverse of String: "+ s +" is :: ");
		for(int i=ch.length-1;i>=0;i--){
			System.out.print(ch[i]);
		}
	}

	public static void main(String[] args) {
		ReverseString ob=new ReverseString();
		ob.getReverseString("Gungun is my daughter");

	}

}
