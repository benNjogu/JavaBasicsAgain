package com.keytech;

import java.util.Scanner;

public class MyChallenge {

	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("To what number do you want even numbers");
		int size;
		size = scanner.nextInt();
		int[] evenArray = new int[size];

		System.out.println("The array is of size " + evenArray.length);

		getEvenNumbers(evenArray);
	}

	private static void getEvenNumbers(int[] evenArray) {

		int j = 0;
		for (int i = 0; i <= evenArray.length; i++) {
			j++;
			evenArray[j] = i;
			i++;
		}

		printArrayElements(evenArray);

	}

	private static void printArrayElements(int[] evenArray) {

		for (int i = 1; i <= evenArray.length; i++) {
			if (i == 1 && evenArray[i] == 0) {
				System.out.println("Element " + i + " is " + evenArray[i]);

			} else if (i != 1 && evenArray[i] != 0) {

				System.out.println("Element " + i + " is " + evenArray[i]);
			}
		}

	}

}
