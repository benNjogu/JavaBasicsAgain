package com.keytech;

public class SteeringStick {

	private Size size;
	private String color;
	private boolean hard;
	private boolean soft;

	public SteeringStick(Size size, String color, boolean hard, boolean soft) {
		super();
		this.size = size;
		this.color = color;
		this.hard = hard;
		this.soft = soft;
	}

	public boolean isHard() {
		return hard;
	}

	public boolean isSoft() {
		return soft;
	}

	
	
}
