package com.keytech;

import java.util.Scanner;

public class Example {

	public static void main(String[] args) {
		int result = divide();
		System.out.println(result);
	}

	private static int divide() {
		int x = getInt();
		int y = getInt();
		System.out.println("x is " + x + ", y is " + y);
		return x / y;
	}

	private static int getInt() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter an integer ");

		return scanner.nextInt();
	}

	/*
	 * Exception in thread "main" java.util.InputMismatchException at
	 * java.util.Scanner.throwFor(Scanner.java:864) at
	 * java.util.Scanner.next(Scanner.java:1485) at
	 * java.util.Scanner.nextInt(Scanner.java:2117) at
	 * java.util.Scanner.nextInt(Scanner.java:2076) at
	 * com.keytech.Example.getInt(Example.java:23) at
	 * com.keytech.Example.divide(Example.java:14) at
	 * com.keytech.Example.main(Example.java:8)
	 */

}
