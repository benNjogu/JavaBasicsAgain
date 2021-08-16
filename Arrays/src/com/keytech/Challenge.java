package com.keytech;

import java.util.Arrays;
import java.util.Scanner;

public class Challenge {

	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {

		int[] numbers = getIntegers(5);

		String message = "Entered number at position ";
		printArray(numbers, message);
		
		numbers = sortNumbersArray(numbers);
		message = "After sorting number at position ";
		printArray(numbers, message);
		

	}

	private static void printArray(int[] numbers, String message) {

		System.out.println("**********************************");
		for(int i=0; i<numbers.length; i++) {
			System.out.println(message+""+i+" is "+numbers[i]);
		}
		System.out.println("**********************************");
	}

	private static int[] sortNumbersArray(int[] numbers) {
//		int[] sortedArray = new int[numbers.length];
//		for(int i=0; i<numbers.length; i++) {
//			sortedArray[i] = numbers[i];
//		}
		
		int[] sortedArray = Arrays.copyOf(numbers, numbers.length);
		
		boolean flag = true;
		int temp;
		while(flag) {
			flag = false;
			for(int i=0; i<sortedArray.length-1; i++) {
				if(sortedArray[i]<sortedArray[i+1]) {
					temp = sortedArray[i];
					sortedArray[i] = sortedArray[i+1];
					sortedArray[i+1] = temp;
					flag = true;
				}
			}
		}
		
		return sortedArray;
		
	}

	private static int[] getIntegers(int number) {

		System.out.println("Enter " + number + " integers of your choice.\r");
		int[] values = new int[number];
		for (int i = 0; i < values.length; i++) {
			values[i] = scanner.nextInt();
		}

		return values;
	}

}
