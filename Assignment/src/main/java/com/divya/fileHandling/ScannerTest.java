package com.divya.fileHandling;

import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter first number");
		int firstNo =sc.nextInt();
		System.out.println("enter second number");
		int secondNo =sc.nextInt();
		
		System.out.println("addition of two number : "+(firstNo+secondNo));
		sc.close();
	}

}
