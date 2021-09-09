package com.keytech;

public class Main {

	public static void main(String[] args) {
		Animal animal = new Dog("chihuahua");
		animal.breathe();
		animal.eat();
		System.out.println("*********************************");
		animal = new Peakcock("Peakcock");
		animal.breathe();
		animal.eat();
	}
	
}
