package com.challenge;

import java.util.Scanner;

public class Main {

	private static Scanner scanner;
	private static MobilePhone mobilePhone = new MobilePhone("0745 580 333");

	public static void main(String[] args) {

		scanner = new Scanner(System.in);
		
		boolean quit = false;
		startPhone();
		printActions();

		while (!quit) {
			System.err.println("\nEnter action(6 to show available actions)");
			int action = scanner.nextInt();
			switch (action) {
			case 0:
				System.err.println("Shutting down...");
				quit = true;
				break;
			case 1:
				mobilePhone.printContacts();
			case 2:
				addNewContact();
				break;
			case 3:
				updateContact();
				break;
			case 4:
				removeContact();
				break;
			case 5:
				queryContact();
				break;
			case 6:
				printActions();
				break;
			}

		}

	}

	private static void queryContact() {
		System.out.println("Enter existing contact name");
		String name = scanner.nextLine();
		Contact existingContactRecord = mobilePhone.queryContact(name);
		if (existingContactRecord == null) {
			System.out.println("Contact not found.");
			return;
		}

		System.out.println("Name "+existingContactRecord.getName()+" phone number is "+existingContactRecord.getPhoneNumber(, tempExit));
		
	}

	private static void removeContact() {
		System.out.println("Enter existing contact name");
		String name = scanner.nextLine();
		Contact existingContactRecord = mobilePhone.queryContact(name);
		if (existingContactRecord == null) {
			System.out.println("Contact not found.");
			return;
		}

		if(mobilePhone.removeContact(existingContactRecord)){
			System.out.println("Successsfully deleted");
		}else {
			System.out.println("Error deleting contact");
		}
	}

	private static void updateContact() {
		System.out.println("Enter existing contact name");
		String name = scanner.nextLine();
		Contact existingContactRecord = mobilePhone.queryContact(name);
		if (existingContactRecord == null) {
			System.out.println("Contact not found.");
			return;
		}

		System.out.println("Enter new contact name");
		String newName = scanner.nextLine();
		System.out.println("Enter phone number");
		String newNumber = scanner.nextLine();
		Contact newContact = Contact.createContact(newName, newNumber);
		if (mobilePhone.updateContact(existingContactRecord, newContact)) {
			System.out.println("Successfully updated..");
		} else {
			System.out.println("Error updating record");
		}
	}

	private static void addNewContact() {
		System.out.println("Enter new contact name: ");
		String name = scanner.nextLine();
		System.out.println("Enter phone number: ");
		String phoneNumber = scanner.nextLine();
		//String contact = scanner.nextLine();

		Contact newContact = Contact.createContact(name, phoneNumber);
		if (mobilePhone.addNewContact(newContact)) {
			System.out.println("new contact added " + name + " phone = " + phoneNumber);
		} else {
			System.out.println("Can't add " + name + " already on file.");
		}
	}

	private static void startPhone() {

		System.out.println("Starting phone...");

	}

	private static void printActions() {
		System.out.println("\nAvailable actions:\nPress");
		System.out.println("0. To shut down\n" + "1. To print contacts\n" + "2. To add anew contact\n"
				+ "3. To update an existing an existing contact\n" + "4. To remove an existing contact\n"
				+ "5. To query if a contact exists\n" + "6.To print a list of available actions");
		System.out.println("Choose your action");
	}

}
