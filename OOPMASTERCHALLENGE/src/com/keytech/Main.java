package com.keytech;

public class Main {

	public static void main(String[] args) {
		Hamburger hamburger = new Hamburger("Basic", "sausage", 300.55, "white");
		//double price = hamburger.itemizeHamburger();
		//System.out.println(price);
		hamburger.addHamburgerAddition1("tomato", 120);
		hamburger.addHamburgerAddition2("lettuce", 22.35);
		hamburger.addHamburgerAddition3("cheese", 90.30);
		double price = hamburger.itemizeHamburger();
		System.err.println("Total price = "+price);
		
	}
	
}
