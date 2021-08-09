package com.keytech;

public class Main {

	
	public static void main(String[] args) {
		
		Dimensions dimensions = new Dimensions(20, 20, 5);
		Case theCase = new Case("220b", "HP", "240", dimensions);
		Resolution nativeResolution = new Resolution(2540, 1440);
		Monitor monitor = new Monitor("27 inch Beast", "Dell", 27, nativeResolution);
		MotherBoard motherBoard = new MotherBoard("BJ-200", "Asus", 4, 6, "v2.44");
		PC thePc = new PC(theCase, monitor, motherBoard);

		thePc.getTheCase().pressPowerButton();
		thePc.getMotherBoard().loadProgam("Ubuntu 20.04");
		thePc.getMonitor().drawPixelAt(1500, 1200, "red");
		
	}

}
