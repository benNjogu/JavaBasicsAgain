package com.keytech;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
		calculateBMI();
	}

	private static void calculateBMI() throws Exception {
		System.out.print("Please enter your weight in kg: ");
		Scanner s = new Scanner(System.in);
		float weight = s.nextFloat();
		System.out.print("Please enter your height in cm: ");
		float height = s.nextFloat();
		/*
		 * Formula for Calculating BMI in Metric Units
		 * 
		 * BMI = Weight in Kg/(Height in Meters * Height in Meters)
		 * 
		 * Example calculation for weight = 90kg, height = 1.5m
		 * 
		 * BMI = 90/(1.5*1.5) = 40
		 */

		// multiplication by 100*100 for cm to m conversion
		float bmi = (100 * 100 * weight) / (height * height);

		System.out.println("Your BMI is: " + bmi);
		printBMICategory(bmi);

	}

	// Prints BMI category
	private static void printBMICategory(float bmi) {
		if (bmi < 18.5) {
			System.out.println("You are underweight");
		} else if (bmi < 25) {
			System.out.println("You are normal");
		} else if (bmi < 30) {
			System.out.println("You are overweight");
		} else {
			System.out.println("You are obese");
		}
	}
}
