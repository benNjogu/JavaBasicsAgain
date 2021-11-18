package com.challenge;

public class Main {

	public static void main(String[] args) {
		
		SearchTree tree = new SearchTree(null);
		//list.traverse(list.getRoot(, tempExit));
		
		//String stringData = "Murang'a Kenol Thika Nairobi Uthiru Limuru Kijabe Naivasha Gilgil Lanet Nakuru Murang'a";
		String stringData = "5 7 3 8 2 1 0 4 6";
		String[] data = stringData.split(" ");
		for (String s : data) {
			//create a new item
			tree.addItem(new Node(s, tempExit));
		}
		tree.traverse(tree.getRoot(, tempExit));
//		tree.removeItem(new Node("3", tempExit));
//		
//		tree.traverse(tree.getRoot(, tempExit));
//		tree.removeItem(new Node("8", tempExit));
//		tree.removeItem(new Node("7", tempExit));
//		tree.traverse(tree.getRoot(, tempExit));
//		
//		tree.removeItem(new Node("0", tempExit));
//		tree.removeItem(new Node("4", tempExit));
//		tree.removeItem(new Node("6", tempExit));
//		tree.removeItem(new Node("2", tempExit));
//		tree.traverse(tree.getRoot(, tempExit));
//
//		tree.removeItem(new Node("1", tempExit));
//		tree.traverse(tree.getRoot(, tempExit));
//		tree.removeItem(tree.getRoot(, tempExit));
//		tree.traverse(tree.getRoot(, tempExit));
	}
	
}
