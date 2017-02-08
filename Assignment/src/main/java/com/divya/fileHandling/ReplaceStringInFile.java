package com.divya.fileHandling;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class ReplaceStringInFile {


	   public static void replaceSubString(String str,String rep){
			BufferedReader br;
			String newline=null;
			try {
				br = new BufferedReader(new FileReader("C:\\Users\\Divya\\Desktop\\Hello.txt"));
				PrintWriter bw=new PrintWriter("C:\\Users\\Divya\\Desktop\\Hello1.txt");
				String line=br.readLine();
				while(line!=null){
							//if(line.contains(str)){
						  newline =line.replaceAll(str,rep);
						  bw.println(newline);
						  bw.flush();
					//	}
						line=br.readLine();
				
				}
				br.close();
				bw.close();
		

				
			}catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}
		public static void main(String[] args) {
			replaceSubString("good","cute");
		}

}
