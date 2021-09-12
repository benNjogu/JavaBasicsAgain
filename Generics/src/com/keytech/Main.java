package com.keytech;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList<Integer> items = new ArrayList<Integer>();
		items.add(1);
		items.add(3);
		items.add(5);
		items.add(7);
		items.add(9);
		
		PrintDoubled(items);
		
	}

	private static void PrintDoubled(ArrayList<Integer> items) {

		for(int i : items) {
			System.out.println(i * 2);
		}
	}
	
}
