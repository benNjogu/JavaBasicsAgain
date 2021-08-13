package com.keytech;

public class Main {

	public static void main(String[] args) {
		
		Size size = new Size(5, 10);
		Stem stem = new Stem("withShocks", "grey", size, 25.50);
		SteeringStick stick = new SteeringStick(size, "black", false, true);
		Wheels wheels = new Wheels("LiangFeng", size);
		Frame frame = new Frame("grey", "Liangfeng", size);
		Peddals peddals = new Peddals("steel", size);
		Seat seat = new Seat(false, true, "black");
		Flares flares = new Flares(3);
		Chain chain = new Chain(167);
		
		
		Bicycle bicycle = new Bicycle(stem, stick, wheels, frame, peddals, seat, flares, chain, size);
		bicycle.move();
		String manufacturer = bicycle.manufacturer();
		System.out.println("Your bicycle manufacturer is " +manufacturer);
		boolean isComfortable = bicycle.getSeat().isComfortable();
		System.out.println("Comfort guaranteed:"+isComfortable);
		
	}
	
}
