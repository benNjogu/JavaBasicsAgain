package com.keytech;

public class Main {

	public static void main(String[] args) {

		int switchValue = 4;

		switch (switchValue) {
		case 1:
			System.out.println("The value is 1");
			break;
		case 2:
			System.out.println("The value is 2");
			break;
		case 3:
		case 4:
		case 5:
			System.out.println("was a 3 or a 4 or a 5");
			System.out.println("Actually it was a " + switchValue);
			break;
		default:
			System.out.println("Value is not 1 or 2");
			break;
		}

	}

}
