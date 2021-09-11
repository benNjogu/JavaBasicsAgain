package com.challenge;

public class Main {

	public static void main(String[] args) {
		
		SearchTree tree = new SearchTree(null);
		//list.traverse(list.getRoot());
		
		//String stringData = "Murang'a Kenol Thika Nairobi Uthiru Limuru Kijabe Naivasha Gilgil Lanet Nakuru Murang'a";
		String stringData = "5 7 3 8 2 1 0 4 6";
		String[] data = stringData.split(" ");
		for (String s : data) {
			//create a new item
			tree.addItem(new Node(s));
		}
		tree.traverse(tree.getRoot());
//		tree.removeItem(new Node("3"));
//		
//		tree.traverse(tree.getRoot());
//		tree.removeItem(new Node("8"));
//		tree.removeItem(new Node("7"));
//		tree.traverse(tree.getRoot());
//		
//		tree.removeItem(new Node("0"));
//		tree.removeItem(new Node("4"));
//		tree.removeItem(new Node("6"));
//		tree.removeItem(new Node("2"));
//		tree.traverse(tree.getRoot());
//
//		tree.removeItem(new Node("1"));
//		tree.traverse(tree.getRoot());
//		tree.removeItem(tree.getRoot());
//		tree.traverse(tree.getRoot());
	}
	
}
