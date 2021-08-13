package com.keytech;

public class Frame {

	private String color;
	private String manufacturer;
	private Size size;

	public Frame(String color, String manufacturer, Size size) {
		super();
		this.color = color;
		this.manufacturer = manufacturer;
		this.size = size;
	}

	public String getColor() {
		return color;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public Size getSize() {
		return size;
	}

}
