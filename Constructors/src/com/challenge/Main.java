package com.challenge;

public class Main {

	public static void main(String[] args) {
		
		VipCustomer cp = new VipCustomer("CP", 98.09, "cp@gmail.com");
		String email = cp.getEmail();
		System.out.println("cp's email is "+cp.getEmail());
	}
	
}
