package com.challenge;

public class Main {

	
	public static void main(String[] args) {
		Wall wall1 = new Wall("North");
		Wall wall2 = new Wall("East");
		Wall wall3 = new Wall("South");
		Wall wall4 = new Wall("West");
		Ceiling ceiling = new Ceiling(12, 55);
		Bed bed = new Bed("Mordern", 4, 3, 2, 1);
		Lamp lamp = new Lamp("classic", false, 75);
		BedRoom bedRoom = new BedRoom("Master", wall1, wall2, wall3, wall4, ceiling, bed, lamp);
		
		bedRoom.makeBed();
		bedRoom.getLamp().turnOn();
	}
	
	
}
