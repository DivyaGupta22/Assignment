package com.divya.fileHandling;

import java.io.DataInputStream;
import java.io.IOException;

public class DataInputStreamTest {

	public static void main(String[] args) {
		
		DataInputStream dis=new DataInputStream(System.in);
		System.out.println("enter first number");
		try {
			int a=((int)dis.readInt());
			System.out.println(a);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
			
		}
		
		
		

	}

}
