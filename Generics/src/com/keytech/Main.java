package com.keytech;

import java.awt.print.Printable;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		ArrayList items = new ArrayList<>();
		items.add(1);
		items.add(3);
		items.add(5);
		items.add(7);
		items.add(9);
		
		PrintDoubled(items);
		
	}

	private static void PrintDoubled(ArrayList items) {

		for(Object i : items) {
			System.out.println((Integer)i * 2);
		}
	}
	
}
