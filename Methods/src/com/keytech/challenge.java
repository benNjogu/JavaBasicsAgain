package com.keytech;

public class challenge {

	public static void main(String[] args) {

		int pstn;
		String playerName = "Kimangas";
		pstn = calculatedHighScorePosition(1000);
		displayHighScorePosition(playerName, pstn);
		pstn = calculatedHighScorePosition(500);
		displayHighScorePosition(playerName, pstn);
		pstn = calculatedHighScorePosition(400);
		displayHighScorePosition(playerName, pstn);
		pstn = calculatedHighScorePosition(50);
		displayHighScorePosition(playerName, pstn);
		
	}

	public static void displayHighScorePosition(String playerName, int pstn) {
		System.out.println(playerName + " managed to get to position " + pstn + " on the high score table");
	}

	public static int calculatedHighScorePosition(int playerScore) {
		if (playerScore >= 1000) {
			return 1;
		} else if (playerScore >= 500 && playerScore < 1000) {
			return 2;
		} else if (playerScore >= 100 && playerScore < 500) {
			return 3;
		} else {
			return 4;
		}
	}
}
