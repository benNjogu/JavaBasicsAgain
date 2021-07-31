package com.keytech;

public class Challenge {

	public static void main(String[] args) {

		char grade = 'A';
		switch (grade) {

		case 'A':
		case 'B':
		case 'C':
		case 'D':
		case 'E':
			System.out.println("Your grade is " + grade);
			break;
		default:
			System.out.println("Seems like you never took your exam, child.");
			break;
		}

	}

	public static class ChallengeWithString {
		public static void main(String[] args) {
			String month = "JAnuAry";
			switch (month.toLowerCase()) {
			case "january":
				System.out.println("Jan");
				break;
			case "june":
				System.out.println("hune");
				break;
			default:
				System.out.println("guess again!");
				break;
			}
		}
	}
}
