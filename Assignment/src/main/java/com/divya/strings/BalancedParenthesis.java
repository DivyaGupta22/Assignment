package com.divya.strings;

import java.util.Stack;

public class BalancedParenthesis {
  public boolean getBalancedParen(String s){
	  Stack<Character> st =new Stack<Character>();
	  for(int i=0;i<s.length();i++){
		  if(s.charAt(i)=='('||s.charAt(i)=='{'||s.charAt(i)=='['){
			  st.push(s.charAt(i));
			 }else if(s.charAt(i)==')'){
				 if(st.isEmpty()||st.pop()!='('){
					 return false;
				 }
			 }else if(s.charAt(i)=='}'){
				 if (st.isEmpty()||st.pop()!='{'){
					 return false;
				 }
			 }else if(s.charAt(i)==']'){
					 if(st.isEmpty()||st.pop()!='['){
						 return false;
					 }
				 }
		 		  
			 }  return st.isEmpty();
	
  
  }
	public static void main(String[] args) {
		BalancedParenthesis ob=new BalancedParenthesis();
		System.out.println(ob.getBalancedParen("hi(({joy{[nnsdj]}}))"));

	}

}
