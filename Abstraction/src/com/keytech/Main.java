package com.keytech;

public class Main {

	public static void main(String[] args) {
		
		Dog dog = new Dog("chihuahua");
		dog.breathe();
		dog.eat();
		System.out.println("*********************************");
		Bird bird = new Peakcock("Peakcock");
		bird.breathe();
		bird.eat();
	}
	
}
