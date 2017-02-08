package com.divya.fileHandling;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BreaderandISReader {

	public static void main(String[] args) {
		InputStreamReader isr =new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.println("Enter first number ");
		try {
			String a = br.readLine();
			
			System.out.println("Enter Second number ");
			String b = br.readLine();
		
		
			System.out.println("Substraction of two numbers :"+(Integer.parseInt(a)-Integer.parseInt(b)));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
