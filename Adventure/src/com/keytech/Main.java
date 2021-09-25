package com.keytech;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	private static Scanner scanner = new Scanner(System.in);
	private static Map<Integer, Location> locations = new HashMap<Integer, Location>();

	public static void main(String[] args) {

		Map<String, Integer> tempExit = new HashMap<String,Integer>();
		locations.put(0, new Location(0, "You are sitting in front of a computer learning java", tempExit));
		

		tempExit = new HashMap<String,Integer>();
		tempExit.put("W", 2);
		tempExit.put("E", 3);
		tempExit.put("S", 4);
		tempExit.put("N", 5);
		locations.put(1, new Location(1, "You are headed for a ride", tempExit));

		tempExit = new HashMap<String,Integer>();
		tempExit.put("N", 5);
		locations.put(2, new Location(2, "You are at the top of a hill", tempExit));

		tempExit = new HashMap<String,Integer>();
		tempExit.put("W", 1);
		locations.put(3, new Location(3, "You are moving sometime ", tempExit));

		tempExit = new HashMap<String,Integer>();
		tempExit.put("N", 1);
		tempExit.put("W", 2);
		locations.put(4, new Location(4, "You are on your way to school", tempExit));

		tempExit = new HashMap<String,Integer>();
		tempExit.put("S", 1);
		tempExit.put("W", 2);
		locations.put(5, new Location(5, "You are conversing with friends", tempExit));
		
		Map<String, String> vocabulary = new HashMap<String, String>();
		vocabulary.put("QUIT", "Q");
		vocabulary.put("NORTH", "N");
		vocabulary.put("SOUTH", "S");
		vocabulary.put("WEST", "W");
		vocabulary.put("EAST", "E");

		int loc = 1;
		while (true) {
			System.out.println(locations.get(loc).getDescription());
			tempExit.remove("S");
			if (loc == 0) {
				break;
			}

			Map<String, Integer> exits = locations.get(loc).getExits();
			System.out.print("Available exits are ");
			for (String exit : exits.keySet()) {
				System.out.print(exit + ", ");
			}
			System.out.println();

			String direction = scanner.nextLine().toUpperCase();
			if (direction.length()>1) {
				String[] words = direction.split(" ");
				for(String word: words) {
					if (vocabulary.containsKey(word)) {
						direction = vocabulary.get(word);
						break;
					}
				}
			}

			if (exits.containsKey(direction)) {

				loc = exits.get(direction);
			} else {

				System.out.println("You cannot go in that direction");
			}

		}

	}

}
