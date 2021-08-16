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
		
		numbers = resizeArray(numbers);
		message = "After resizing number at position ";
		
		numbers[0] = 1;
		numbers[1] = 1;
		numbers[2] = 1;
		numbers[3] = 1;
		numbers[4] = 1;
		numbers[5] = 1;
		numbers[6] = 1;
		numbers[7] = 1;
		numbers[8] = 1;
		numbers[9] = 1;
		numbers[10] = 1;
		numbers[11] = 1;
		
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
		int[] sortedArray = new int[numbers.length];
		for(int i=0; i<numbers.length; i++) {
			sortedArray[i] = numbers[i];
		}
		
//		int[] sortedArray = Arrays.copyOf(numbers, numbers.length);
		
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
	
	private static int[] resizeArray(int[] numbers) {
		int[] originalArray = numbers;
		numbers = new int[12];
		for(int i=0; i<originalArray.length; i++) {
			numbers[i] = originalArray[i];
		}
		
		System.out.println("new size of array is "+numbers.length);
		
		return numbers;
	}

}
