package com.keytech;

public class Wheels {

	private String manufacturer;
	private Size size;

	public Wheels(String manufacturer, Size size) {
		super();
		this.manufacturer = manufacturer;
		this.size = size;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public Size getSize() {
		return size;
	}
	
	public void pump() {
		System.out.println("Wheels.pump() pressure full!");
	}

}
