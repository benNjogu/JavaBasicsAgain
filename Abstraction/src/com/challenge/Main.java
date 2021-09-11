package com.challenge;

public class Main {

	public static void main(String[] args) {
		
		MyLinkedList list = new MyLinkedList(null);
		//list.traverse(list.getRoot());
		
		//String stringData = "Murang'a Kenol Thika Nairobi Uthiru Limuru Kijabe Naivasha Gilgil Lanet Nakuru Murang'a";
		String stringData = "5 7 3 8 2 1 0 4 6";
		String[] data = stringData.split(" ");
		for (String s : data) {
			//create a new item
			list.addItem(new Node(s));
		}
		list.traverse(list.getRoot());
		list.removeItem(new Node("3"));
		
		list.traverse(list.getRoot());
		list.removeItem(new Node("8"));
		list.removeItem(new Node("7"));
		list.traverse(list.getRoot());
		
		list.removeItem(new Node("0"));
		list.removeItem(new Node("4"));
		list.removeItem(new Node("6"));
		list.removeItem(new Node("2"));
		list.traverse(list.getRoot());

		list.removeItem(new Node("1"));
		list.traverse(list.getRoot());
		list.removeItem(list.getRoot());
		list.traverse(list.getRoot());
	}
	
}
