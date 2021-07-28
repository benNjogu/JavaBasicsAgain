package com.keytech;

public class Main {

	public static void main(String[] args) {
		
		int newScore = calculateScore("Kim", 520);
		calculateScore(newScore);

	}

	/*
	 * when overloading you need to change the method signature
	 * In this case the parameters
	 * */
	public static int calculateScore(String playerName, int score) {
		System.out.println("Player "+playerName+ " scored "+score+" points.");
		return score*1000;
	}
	
	public static int calculateScore(int score) {

		System.out.println("new score is "+score);
		return score*1000;
	}
	
}
