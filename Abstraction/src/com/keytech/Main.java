package com.keytech;

public class Main {

	public static void main(String[] args) {
		Animal animal = new Dog("chihuahua");
		animal.breathe();
		animal.eat();
		System.out.println("*********************************");
		Peakcock peakcock = new Peakcock("Pink Peakcock");
		peakcock.breathe();
		peakcock.eat();
		peakcock.fly();
		System.out.println("*********************************");
		Penguin penguin = new Penguin("Emperor");
		penguin.breathe();
		penguin.eat();
		penguin.fly();
	}
	
}
