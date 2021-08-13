package com.keytech;

public class ShockedBicycle extends Bicycle {

	private boolean hasFrontShocks;
	private boolean hasRearSprings;

	public ShockedBicycle(Stem stem, SteeringStick stick, Wheels wheels, Frame frame, Peddals peddals, Seat seat,
			Flares flares, Chain chain, Size size, boolean hasFrontShocks, boolean hasRearSprings) {
		super(stem, stick, wheels, frame, peddals, seat, flares, chain, size);
		this.hasFrontShocks = hasFrontShocks;
		this.hasRearSprings = hasRearSprings;
	}

	public void onBumpyRide() {
		if(hasFrontShocks && hasRearSprings) {
			System.out.println("ShockedBicycle.OnBumpyRide :I can't feel the bumps doesn't hurt!!");
		}
		if (hasFrontShocks && !(hasRearSprings)) {
			System.out.println("ShockedBicycle.OnBumpyRide :I can feel the bumps hurts a little!!");
		}
		if (hasRearSprings && !(hasFrontShocks)) {
			System.out.println("ShockedBicycle.OnBumpyRide :I can't feel the bumps  just rough!!");
		}
	}
	
}
