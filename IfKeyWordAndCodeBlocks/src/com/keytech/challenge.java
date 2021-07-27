package com.keytech;

public class challenge {

	public static void main(String[] args) {
		/*
		 * print 2nd score if
		 * a)score = 10000
		 * b)level completed = 8
		 * c)bonus = 200
		 * */
		
		int score = 10000;
		int levelCompleted = 8;
		int bonus = 200;
		
		int finalScore = score + (levelCompleted*bonus);
		System.out.println(finalScore);
	}
	
}
