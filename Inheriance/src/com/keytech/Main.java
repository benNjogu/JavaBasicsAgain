package com.keytech;

public class Main {

	public static void main(String[] args) {
		
		Animal animal = new Animal("mammal", 1, 1, 5, 5);
		Dog dog = new Dog("pom", 2, 12, 2, 4, 1, 42, "hairy");
		dog.run();
	}
	
}
