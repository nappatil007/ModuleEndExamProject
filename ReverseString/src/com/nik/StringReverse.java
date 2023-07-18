package com.nik;

public class StringReverse {

	public StringReverse() {
		
	}
	
	public static void strrev(String str) {
		char ch;
		String revStr = "";
		for (int i=0; i<str.length(); i++)
	      {
	        ch= str.charAt(i); 
	        revStr= ch+revStr;
	      }
	      System.out.println("Reversed word: "+ revStr);
	}

	public static void main(String[] args) {
		String str = "Infoway Technologies";
		
		strrev(str);

	}

}
