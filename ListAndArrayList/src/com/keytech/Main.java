package com.keytech;

import java.util.Scanner;

public class Main {

	private static Scanner scanner = new Scanner(System.in);
	private static GroceryList groceryList = new GroceryList();
	public static void main(String[] args) {
		
		boolean quit = false;
		int choice = 0;
		printInstructions();
		while(!quit) {
			System.out.println("Enter your choice: ");
			choice = scanner.nextInt();
			scanner.nextLine();
			
			switch (choice) {
			case 0:
				printInstructions();
				break;
			case 1:
				groceryList.printGroceryList();
				break;
			case 2:
				addItem();
				break;
			case 3:
				modifyItem();
				break;
			case 4:
				removeItem();
				break;
			case 5:
				searchForItem();
				break;
			case 6:
				quit = true;
				break;
			default:
				break;
			}
		}
		
	}
	private static void searchForItem() {
		System.out.println("Enter item: ");
		String item = scanner.nextLine();
		if((groceryList.findItem(item)) != null){
			System.out.println("Found "+item+" in your grocery list.");
		}else {
			System.out.println(item+" is not in the shopping list.");
		}
	}
	private static void removeItem() {
		System.out.println("Enter position of item you want to remove: ");
		int position = scanner.nextInt();
		scanner.nextLine();
		groceryList.removeGroceryItem(position-1);
	}
	private static void modifyItem() {
		System.out.println("Enter item number: ");
		int itemNo = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Enter replacement item: ");
		String newItem = scanner.nextLine();
		groceryList.modifyGroceryItem(itemNo-1, newItem);
	}
	private static void addItem() {
		System.out.println("Please enter the grocery item: ");
		groceryList.addGroceryItem(scanner.nextLine(, tempExit));
	}
	private static void printInstructions() {
		System.out.println("\nPress");
		System.out.println("\t 0-To print choice options.");
		System.out.println("\t 1-To print the list of grocery items.");
		System.out.println("\t 2-To add an item to the list.");
		System.out.println("\t 3-To modify an item in the list.");
		System.out.println("\t 4-To remove an item from the list.");
		System.out.println("\t 5-To search for an item in the list.");
		System.out.println("\t 6-To quit the application.");
	}
	
}
