package com.keytech;

public class Stem {

	private String type;// with shocks or not
	private String color;
	private Size size;
	private double price;

	public Stem(String type, String color, Size size, double price) {
		super();
		this.type = type;
		this.color = color;
		this.size = size;
		this.price = price;
	}

	public String getType() {
		return type;
	}

	public String getColor() {
		return color;
	}

	public Size getSize() {
		return size;
	}

	public double getPrice() {
		return price;
	}
	
}
