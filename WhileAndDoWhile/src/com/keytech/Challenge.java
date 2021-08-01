package com.keytech;

public class Challenge {

	public static void main(String[] args) {

		int n = 3;
		if (isEvenNumber(n)) {
			System.out.println(n+" is even");
		}else {
			System.out.println(n+" is odd");
		}
		
	}

	private static boolean isEvenNumber(int n) {
		while (n%2==0) {
			return true;
		}
		
		return false;
	}
}
