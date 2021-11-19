package com.keytech;

interface Parser {
	
	String parse(String str);
	
}

class StringParser{
	
	public String convert(String s) {
		if (s.length()<=3) {
			s = s.toUpperCase();
		}else {
			s = s.toLowerCase();
		}
		return s;
	}
	
}

class MyPrinter{
	
	public void print(String str, Parser p) {
		str = p.parse(str);
		System.out.println(str);
	}
	
}

public class Main {

	public static void main(String[] args) {

		String str = "Faith Nyoko";
		StringParser sp = new StringParser();
		MyPrinter mPrinter = new MyPrinter();
		mPrinter.print(str, (sp::convert));
		
	}
	
}
