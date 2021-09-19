package com.keytech;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

	private static Scanner scanner = new Scanner(System.in);
	private static Map<Integer, Location> locations = new HashMap<Integer, Location>();

	public static void main(String[] args) {

		locations.put(0, new Location(0, "You are sitting in front of a computer learning java"));
		locations.put(1, new Location(1, "You are headed for a ride"));
		locations.put(2, new Location(2, "You are at the top of a hill"));
		locations.put(3, new Location(3, "You are moving sometime "));
		locations.put(4, new Location(4, "You are on your way to school"));
		locations.put(5, new Location(5, "You are conversing with friends"));
		locations.put(6, new Location(6, "You are on your way to pee"));

		int loc = 1;
		while (true) {
			System.out.println(locations.get(loc).getDescription());
			if (loc == 0) {
				break;
			}

			loc = scanner.nextInt();
			if (!locations.containsKey(loc)) {
				System.out.println("You cannot go in that direction");
				break;
			}
		}

	}

}
