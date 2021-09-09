package com.keytech;

public class Penguin extends Bird{

	public Penguin(String name) {
		super(name);
	}

	@Override
	public void fly() {
		System.out.println("are not good at this, will swim instead");
	}

	
	
}
