package com.keytech;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Example {

	public static void main(String[] args) {
		
		try {
			int result = divide();
			System.out.println(result);
		} catch (Exception e) {
			System.out.println(e.toString());
			System.out.println("Unable to put division, autopilot shutting down");
		}
		
	}

	private static int divide() {
		int x;
		int y;

		try {
			x = getInt();
			y = getInt();
			System.out.println("x is " + x + ", y is " + y);
			System.out.print("division is ");

			return x / y;
		} catch (NoSuchElementException e) {
			throw new NoSuchElementException("no suitable input");
		} catch (ArithmeticException e) {
			throw new ArithmeticException("Attempt to divide by zero");

		}

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
