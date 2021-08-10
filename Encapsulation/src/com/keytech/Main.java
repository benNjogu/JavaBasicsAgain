package com.keytech;

public class Main {

	public static void main(String[] args) {
//		Player player = new Player();
//		player.name = "Ben";
//		player.health = 20;
//		player.weapon = "Knife";
//		int damage = 10;
//		
//		player.loseHealth(damage);
//		System.out.println("Remaining health = "+player.healthRemaining());
//		
//		damage = 11;
//		player.loseHealth(damage);
//		System.out.println("Remaining health = "+player.healthRemaining());
		
		/*
		 * Always encapsulate
		 * */

		EnhancedPlayer player = new EnhancedPlayer("Ben", 1, "AK47");
		player.loseHealth(5);
		System.out.println(player.getHealth());
	
	}
	
}
