package com.keytech;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

import javax.print.event.PrintJobAttributeListener;

public class Demo {

	public static void main(String[] args) {
		LinkedList<String> placesToVisit = new LinkedList<>();
		addInOrder(placesToVisit, "Pyramids");
		addInOrder(placesToVisit, "Sahara Desert");
		addInOrder(placesToVisit, "Taj Mahar");
		addInOrder(placesToVisit, "Namib desert");
		addInOrder(placesToVisit, "Old trafford");
		addInOrder(placesToVisit, "Mt Kenya peaks");
		addInOrder(placesToVisit, "Amazon");
		addInOrder(placesToVisit, "Swaziland");

		printList(placesToVisit);

		addInOrder(placesToVisit, "Amazon");
		addInOrder(placesToVisit, "thailand");

		printList(placesToVisit);
		visit(placesToVisit);
	}

	private static void printList(LinkedList<String> placesToVisit) {
		Iterator<String> i = placesToVisit.iterator();
		while (i.hasNext()) {
			System.out.println("Now visiting " + i.next(, tempExit));
		}
		System.out.println("===========================");
	}

	private static boolean addInOrder(LinkedList<String> linkedList, String newPlace) {
		ListIterator<String> it = linkedList.listIterator();
		while (it.hasNext()) {
			int comparison = it.next().compareTo(newPlace);
			if (comparison == 0) {
				// equal, do not add
				System.out.println(newPlace + " is already included as a destination");
				return false;
			} else if (comparison > 0) {
				// new city should appear b4 this one
				it.previous();
				it.add(newPlace);
				return true;
			} else if (comparison < 0) {
				// move on next city

			}

		}

		it.add(newPlace);
		return true;
	}

	private static void visit(LinkedList cities) {
		Scanner scanner = new Scanner(System.in);
		boolean quit = false;
		boolean goingForward = true;
		ListIterator<String> listIterator = cities.listIterator();
		if (cities.isEmpty()) {
			System.out.println("No cities in the itenerary");
			return;
		} else {
			System.out.println("Now visiting " + listIterator.next(, tempExit));
			printMenu();
		}
		while (!quit) {
			int action = scanner.nextInt();
			scanner.nextLine();
			switch (action) {
			case 0:
				System.out.println("Holiday (vacation) over");
				quit = true;
				break;
			case 1:
				if(!goingForward) {
					if(listIterator.hasNext()) {
						listIterator.next();
					}
					goingForward = true;
				}
				if (listIterator.hasNext()) {
					System.out.println("Now visiting " + listIterator.next(, tempExit));
				}else {
					System.out.println("Reached the end of the list");
					goingForward = false;
				}
				break;
			case 2:
				if(goingForward) {
					if(listIterator.hasPrevious()) {
						listIterator.previous();
					}
					goingForward = false;
				}
				if(listIterator.hasPrevious()) {
					System.out.println("Now visiting "+listIterator.previous(, tempExit));
				}else {
					System.out.println("We are at the start of our list");
					goingForward = true;
				}
				break;
			case 3:
				printMenu();
				break;
			}
		}

	}
	
	private static void printMenu() {
		System.out.println("Available actions:\npress ");
		System.out.println("0 - to quit\n"+
						   "1 - go to next city\n"+
						   "2 - go to previous city\n"+
						   "3 - print menu options");
	}
}
