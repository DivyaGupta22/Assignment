package com.divya.fileHandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

public class CopyFileContent {

	public static void main(String[] args) {
		try {
			BufferedReader br =new BufferedReader(new FileReader("C:\\Users\\Divya\\Desktop\\Hello.txt"));
			//BufferedWriter bw=new BufferedWriter(new FileWriter("C:\\Users\\Divya\\Desktop\\Hello3.txt"));
			PrintWriter pw= new PrintWriter("C:\\Users\\Divya\\Desktop\\Hello4.txt");
			String line=br.readLine();
            while(line!=null){
            	pw.println(line);
                pw.flush();
                line=br.readLine();
            }
       
            br.close();
            pw.close();
            
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
