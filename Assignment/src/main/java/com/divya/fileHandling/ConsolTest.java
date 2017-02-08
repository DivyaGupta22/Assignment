package com.divya.fileHandling;

import java.io.Console;

public class ConsolTest {

	public static void main(String[] args) {
		Console c= System.console();
		System.out.println("enter first number");
		String f=c.readLine();
		System.out.println("enter Second number");
		String s=c.readLine();
		System.out.println(Integer.parseInt(f)/Integer.parseInt(s));
	}
  

}
