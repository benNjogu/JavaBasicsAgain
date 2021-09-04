package com.keytech;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		Customer customer = new Customer("Ben",  54.98);
		Customer anotherCustomer;
		anotherCustomer = customer;
		anotherCustomer.setBalance(12.18);
		System.out.println("Balance for customer "+customer.getName()+ " is "+customer.getBalance());
		
		ArrayList<Integer> integers = new ArrayList<>();
		integers.add(3);
		integers.add(5);
		integers.add(8);
		integers.add(11);
		
		for(int i=0; i<integers.size(); i++) {
			System.out.println(i+": "+integers.get(i));
		}
		System.out.println("-------------------------------------------------");
		integers.add(1,2);
		for(int i=0; i<integers.size(); i++) {
			System.out.println(i+": "+integers.get(i));
		}
	}
	
}
