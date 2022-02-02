package com.keytech;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Example {

	public static void main(String[] args) {
		int result = divide();
		System.out.println(result);
	}

	private static int divide() {
		int x;
		int y;
		try {
			x = getInt();
			y = getInt();
		} catch (NoSuchElementException e) {
			throw new ArithmeticException("no suitable input");
		}

		
		System.out.println("x is " + x + ", y is " + y);
		System.out.print("division is ");
		
		try {
			
		} catch (ArithmeticException e) {
			throw new ArithmeticException("Attempt to divide by zero");
		}
		return x / y;
	}

	private static int getInt() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter an integer ");
		while (true) {
			try {
				return scanner.nextInt();
			} catch (InputMismatchException e) {
				// go round again
				scanner.nextLine();
				System.out.println("please enter a number using the digits 0-9");
			}
		}

	}

}
