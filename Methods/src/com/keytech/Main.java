package com.keytech;

public class Main {
	
	public static void main(String[] args) {
		
		calculateScore();
		
	}
	
	public static void calculateScore() {
		int score = 1000;
		int levelCompleted = 8;
		int bonus = 200;
		
		int finalScore = score + (levelCompleted*bonus);
		System.out.println(finalScore);
	}
}
