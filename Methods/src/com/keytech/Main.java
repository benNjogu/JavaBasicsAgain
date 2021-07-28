package com.keytech;

public class Main {
	
	public static void main(String[] args) {
		
		int highScore = calculateScore(10000, 8, 200);
		System.out.println(highScore);
		
		highScore = calculateScore(80, 2, 25);
		System.out.println(highScore);
		
	}
	
	public static int calculateScore(int score, int level, int bonus) {
//		int score = 1000;
//		int levelCompleted = 8;
//		int bonus = 200;
		
		if(score!=0) {
			int finalScore = score + (level*bonus);
			//System.out.println(finalScore);
			
			return finalScore;
		}
		return 0;
		
	}
}
