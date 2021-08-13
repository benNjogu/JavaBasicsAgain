package com.keytech;

public class Peddals {

	private String color;
	private Size size;
	private boolean hasSandals=false;

	public Peddals(String color, Size size) {
		super();
		this.color = color;
		this.size = size;
	}

	public Size getSize() {
		return size;
	}
	
	public boolean hasSandals(boolean sandals) {
		this.hasSandals = sandals;
		return hasSandals;
	}
	
	public void cycle() {
		System.out.println("Peddals.cycle() :Moving");
	}

}
