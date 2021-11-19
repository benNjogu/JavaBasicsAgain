package com.keytech;

interface A{
	void show(int i);
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
		a = i -> System.out.println("Hello "+i);	
		
		a.show(6);
		
	}
	
}
