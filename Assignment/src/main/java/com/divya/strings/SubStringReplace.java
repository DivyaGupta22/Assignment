package com.divya.strings;

public class SubStringReplace {
	public static void getSubString(String sen,String word,String rep){
		String abc = null;
		if (sen.contains(word)){
			abc = sen.replace(word, rep);
					
		System.out.println(abc);
		
	} else {System.out.println("no substring found");
		
	}
}

	public static void main(String[] args) {
		String s="my name is gungun";
		String str="name";
		String rep="love";
		
		getSubString(s,str,rep);
	}

}
