package com.keytech;

public class Main {
	
	public static void main(String[] args) {
		
		calculateScore(10000, 8, 200);
		calculateScore(80, 2, 25);
		
	}
	
	public static int calculateScore(int score, int level, int bonus) {
//		int score = 1000;
//		int levelCompleted = 8;
//		int bonus = 200;
		
		if(score!=0) {
			int finalScore = score + (level*bonus);
			System.out.println(finalScore);
			
			return finalScore;
		}
		return 0;
		
	}
}
