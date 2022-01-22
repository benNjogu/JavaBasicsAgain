package com.keytech;

public class StringUtilities {

	private StringBuilder sBuilder = new StringBuilder();
	private int charsAdded = 0;
	
	public void addChar(StringBuilder sBuilder, char c) {
		
		sBuilder.append(c);
		charsAdded ++;
	}
	
	public String upperAndPrefix(String str) {
		
		String upper = str.toUpperCase();
		return "prefix_"+upper;
	}
	
	public String addSuffix(String str) {
		
		return str+"__suffix";
	}
}
