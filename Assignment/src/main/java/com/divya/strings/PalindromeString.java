package com.divya.strings;

public class PalindromeString {
   public void getpalindrome(String s){
	   String reverse="";
	   
	   for(int i=s.length()-1;i>=0;i--){
		   reverse=reverse+s.charAt(i);
	   }
	   if(s.equals(reverse)){
		   System.out.println("String is palindrome");
	   }else{
		   System.out.println("String is not palindrome");
	   }
   }
	public static void main(String[] args) {
		PalindromeString ob =new PalindromeString();
		ob.getpalindrome("madam");
		


	}

}
