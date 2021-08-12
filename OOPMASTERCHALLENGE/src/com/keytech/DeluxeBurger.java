package com.keytech;

public class DeluxeBurger extends Hamburger{

	public DeluxeBurger() {
		super("Deluxe", "Sausage and Bacon", 30.45, "White");
		super.addHamburgerAddition1("chips", 60.40);
		super.addHamburgerAddition2("sprite", 45);
	}

	@Override
	public void addHamburgerAddition1(String name, double price) {
		System.out.println("Cannot add an additional item to a deluxe bugger");
	}

	@Override
	public void addHamburgerAddition2(String name, double price) {
		System.out.println("Cannot add an additional item to a deluxe bugger");
	}

	@Override
	public void addHamburgerAddition3(String name, double price) {
		System.out.println("Cannot add an additional item to a deluxe bugger");
	}

	@Override
	public void addHamburgerAddition4(String name, double price) {
		System.out.println("Cannot add an additional item to a deluxe bugger");
	}
	
	
}
