package com.keytech;

public class challenge {

	public static void main(String[] args) {
		
//		double centimeters = calcFeetAndInchesToCentimeters(10, -1);
//		if (centimeters<0.0) {
//			System.out.println("Invalid parameters");
//		}
		
		calcFeetAndInchesToCentimeters(100);
	}
		
	
	public static double calcFeetAndInchesToCentimeters (double feet, double inches) {
		//1 foot = 12inches
		//1 inch = 2.54cm
		
		if((feet<0) || (inches<0) || (inches>12)) {
			System.out.println("Invalid feet or inches parameters");
			return -1;
		}
		
		double centimetres = (feet*12)*2.54;
		centimetres += inches*2.54;
		System.out.println(feet+"feet "+inches+"inches = "+centimetres+"cm.");
		return centimetres;
	}
	
	public static double calcFeetAndInchesToCentimeters (double inches) {
		if(inches<0) {
			return -1;
		}
		
		double feet = (int) inches/12;
		double remainingInches = (int) inches%12;
		System.out.println(inches +"inches is equal to "+feet+"feet and"+remainingInches+" inches");
		return calcFeetAndInchesToCentimeters(feet, remainingInches);
	}
}
