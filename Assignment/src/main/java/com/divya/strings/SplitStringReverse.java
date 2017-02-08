package com.divya.strings;

public class SplitStringReverse {
	
	public void getReverseString(String s){
		String[] words = s.split(" ");
		
		for(int i=0;i<words.length;i++){
			
			String word=words[i];
		char[] ch = word.toCharArray();
		
			for(int j=ch.length-1;j>=0;j--){
			System.out.print(ch[j]);
		}
		System.out.print(" ");
		}
	}

	public static void main(String[] args) {
		SplitStringReverse ob=new SplitStringReverse();
		ob.getReverseString("Gungun is my lovely daughter");

	}

}
