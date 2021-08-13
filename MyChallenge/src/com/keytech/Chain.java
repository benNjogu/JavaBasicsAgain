package com.keytech;

public class Chain {

	private int length;

	public Chain(int length) {
		super();
		this.length = length;
	}

	public int getLength() {
		if(this.length<=160) {
			System.out.println("Chain: This bike can move very fast");
		}
		else {
			System.out.println("Chain: Bike can be absolutely slow");
		}
		return length;
	}

}
