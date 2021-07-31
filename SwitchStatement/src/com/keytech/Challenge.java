package com.keytech;

public class Challenge {

	public static void main(String[] args) {

		char grade = 'A';
		switch(grade) {
		
		case 'A': case 'B': case 'C': case 'D': case 'E':
		System.out.println("Your grade is "+grade);
		break;
		default:
			System.out.println("Seems like you never took your exam, child.");
			break;
		}
		
	}

}
