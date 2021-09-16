package com.keytech;

public class Main {

	public static void main(String[] args) {
		
//		SomeClass one = new SomeClass("one");
//		SomeClass two = new SomeClass("two");
//		SomeClass three = new SomeClass("three");
//		
//		System.out.println(one.getInstanceNumber());
//		System.out.println(two.getInstanceNumber());
//		System.out.println(three.getInstanceNumber());
		
		int pw = 674312;
		Password password = new ExtendedPassword(pw);
		password.storePassword();
		password.letMeIn(pw);
		
	}

}
