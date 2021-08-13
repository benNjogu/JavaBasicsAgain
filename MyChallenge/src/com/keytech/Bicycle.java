package com.keytech;

public class Bicycle {

	private Stem stem;
	private SteeringStick stick;
	private Wheels wheels;
	private Frame frame;
	private Peddals peddals;
	private Seat seat;
	private Flares flares;
	private Chain chain;
	private Size size;

	public Bicycle(Stem stem, SteeringStick stick, Wheels wheels, Frame frame, Peddals peddals, Seat seat,
			Flares flares, Chain chain, Size size) {
		super();
		this.stem = stem;
		this.stick = stick;
		this.wheels = wheels;
		this.frame = frame;
		this.peddals = peddals;
		this.seat = seat;
		this.flares = flares;
		this.chain = chain;
		this.size = size;
	}
	
	public void move() {
		peddals.cycle();
	}
	
	public String manufacturer() {
		return frame.getManufacturer();
	}

	public Seat getSeat() {
		return seat;
	}

}
