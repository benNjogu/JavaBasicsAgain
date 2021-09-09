package com.keytech;

public class Bird extends Animal{

	public Bird(String name) {
		super(name);
	}

	@Override
	public void eat() {
		System.out.println(getName()+" is pecking");
	}

	@Override
	public void breathe() {
		System.out.println("breath in, breath out repeat");
	}

	
	
}