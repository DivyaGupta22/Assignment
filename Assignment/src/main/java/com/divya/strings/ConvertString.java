package com.divya.strings;

public class ConvertString {
	public void getConvertString(String s){
		String[] words = s.split(" ");
		int j=0;
		StringBuffer sb=new StringBuffer();
		for(int i=0;i<words.length;i++){
			
		
		   sb.append(words[i]);
		   sb.append(++j);
		   sb.append(" ");
		   
		}
		System.out.print(sb);
		}
	

	public static void main(String[] args) {
		ConvertString ob=new ConvertString();
		ob.getConvertString("Gungun is my lovely daughter");

	}
}