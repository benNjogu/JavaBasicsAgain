package com.keytech;

interface A{
	void show();
}

//class B implements A{
//
//	@Override
//	public void show() {
//		System.out.println("Hello lambda!");
//	}
//	
//}

public class LamdaDemo {

	public static void main(String[] args) {
		A a;
		a = () -> System.out.println("Hello");	
		
		a.show();
		
	}
	
}
