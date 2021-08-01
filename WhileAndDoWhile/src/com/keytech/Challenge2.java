package com.keytech;

public class Challenge2 {

	public static void main(String[] args) {

		int n = 5;
		int finishNumber = 20;
		
		while (n<=finishNumber) {
			
			if(!isEvenNumber(n)) {
				n++;
				continue;
			}
			
			System.out.println(n+" is even.");
			n++;
		}
		
	}

	public static boolean isEvenNumber(int n) {
		if (n % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}

}
