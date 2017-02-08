package com.divya.exceptionHandling;

public class HandleNullPointExc {
	public void test(String s){
		for(int i=0;i<s.length();i++){
			System.out.print(s.charAt(i));
			System.out.print(" ");
		}
	}
   public static void main(String[] args){
	   HandleNullPointExc ob =new HandleNullPointExc();
	   try{ob.test(null);
	   }catch (NullPointerException e){
		   System.out.println(e);
	   }finally{
		   System.out.println("\n finally executed");
	   }
   }
}
