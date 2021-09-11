package com.challenge;

public class MyLinkedList implements NodeList{

	private ListItem root = null;

	public MyLinkedList(ListItem root) {
		super();
		this.root = root;
	}

	@Override
	public ListItem getRoot() {
		return this.root;
	}

	@Override
	public boolean addItem(ListItem newItem) {
		if(this.root == null) {
			//list is empty, so this item becomes the head
			this.root = newItem;
			return true;
		}
		ListItem currentItem = this.root;
		while (currentItem != null) {
			int comparison = (currentItem.compareTo(newItem));
			if(comparison<0) {
				//new item is greater, move right if possible
				if(currentItem.next() != null) {
					currentItem = currentItem.next();
				}else {
					//there is no next insert at the end of the list
					currentItem.setNext(newItem);
					newItem.setPrevious(currentItem);
					return true;
				}
			}else if (comparison>0) {
				//new item is less, insert b4
				if (currentItem.previous() != null) {
					currentItem.previous().setNext(newItem);
					newItem.setPrevious(currentItem.previous());
					newItem.setNext(currentItem);
					currentItem.setPrevious(newItem);
				}else {
					//the node without the previous is the root
					newItem.setNext(this.root);
					this.root.setPrevious(newItem);
					this.root = newItem;
				}

				return true;
			}else {
				//they are equal
				System.out.println(newItem.getValue()+" is already present, not added.");

				return false;
			}
		}
		
		return false;
	}

	@Override
	public boolean removeItem(ListItem item) {
		return false;
	}

	@Override
	public void traverse(ListItem root) {
		
	}
	
	
}
