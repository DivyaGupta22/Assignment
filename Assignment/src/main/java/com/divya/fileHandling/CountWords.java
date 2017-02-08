package com.divya.fileHandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CountWords {

	public static void main(String[] args) {
		try {
			BufferedReader br=new BufferedReader(new FileReader("C:\\Users\\Divya\\Desktop\\Hello.txt"));
			String str=br.readLine();
			int count=0;
			while(str!=null){
				String[] arr=str.replaceAll("\\s+"," ").split(" ");
				for(String w:arr){
					count++;
				}
				str=br.readLine();
			}
			System.out.println("total number of wors in file : "+count);
			
		} catch (FileNotFoundException e) {
					e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}

	}

}
