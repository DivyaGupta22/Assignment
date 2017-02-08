package com.divya.fileHandling;

import java.io.File;

public class FileNamesInFolder {

	public static void main(String[] args) {
	File file =new File("C:\\Users\\Divya\\Desktop\\ActionPlan");
	File[] arr=file.listFiles();
     for(File w:arr){
    	 System.out.println(w.getName());
     }
	}

}
