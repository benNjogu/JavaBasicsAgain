package com.keytech;

public class Main {

	public static void main(String[] args) {
		
		String privateVar = "this is private for main()";
		
		ScopeCheck scopeInstance = new ScopeCheck();
		System.out.println("scopeInstance privateVar is "+scopeInstance.getPrivateVar());
		System.out.println(privateVar);
		
		scopeInstance.timesTwo();
		
		ScopeCheck.InnerClass iClass = scopeInstance.new InnerClass();
		iClass.timesTwo();
		
	}
	
}
