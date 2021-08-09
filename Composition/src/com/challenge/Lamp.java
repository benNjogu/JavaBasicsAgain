package com.challenge;

public class Lamp {

	private String sytle;
	private boolean battery;
	private int globRating;

	public Lamp(String sytle, boolean battery, int globRating) {
		super();
		this.sytle = sytle;
		this.battery = battery;
		this.globRating = globRating;
	}

	public void turnOn() {
		System.out.println("Lamp->Turning on");
	}
	
	public String getSytle() {
		return sytle;
	}

	public boolean isBattery() {
		return battery;
	}

	public int getGlobRating() {
		return globRating;
	}

}
