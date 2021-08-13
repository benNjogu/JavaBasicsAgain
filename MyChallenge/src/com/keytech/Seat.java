package com.keytech;

public class Seat {

	private boolean comfortable;
	private boolean firm;
	private String color;

	public Seat(boolean comfortable, boolean firm, String color) {
		super();
		this.comfortable = comfortable;
		this.firm = firm;
		this.color = color;
	}

	public boolean isComfortable() {
		return comfortable;
	}

	public boolean isFirm() {
		return firm;
	};
	
	

}
