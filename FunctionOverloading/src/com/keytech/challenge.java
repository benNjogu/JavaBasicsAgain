package com.keytech;

public class challenge {

	public static void main(String[] args) {
		double inches = 10d;
		double feet = calcFeetAndInchesToCentimeters(inches);
		System.out.println(feet);
		double cm = calcFeetAndInchesToCentimeters(feet, inches);
		System.out.println(cm);
	}
	
	public static double calcFeetAndInchesToCentimeters (double feet, double inches) {
		if(feet>=0) {
			//1 foot = 12inches
			//convert inches to cm
			double foot = 2.54*12;
			double cm = foot*feet;
			return cm;
		}
		if(inches>=0 && inches<=12) {
			//1 inch = 2.54cm
			double inch = 2.54;
			double cm = inch*inches;
			return cm;
		}
		else {
			return -1;
		}
	}
	
	public static double calcFeetAndInchesToCentimeters (double inches) {
		
		if(inches>=0 && inches<=12) {
			//1 foot = 12inches
			double inch = 12;
			double foot = inches/inch;
			return foot;
		}
		else {
			return -1;
		}
	}
}
