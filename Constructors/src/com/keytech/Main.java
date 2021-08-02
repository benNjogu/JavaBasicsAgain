package com.keytech;

public class Main {

	public static void main(String[] args) {
		Account bensAcct = new Account(12345, 750.00, "Bernad Njogu", "kimangas@gmail.com","0745580333");
		bensAcct = new Account();
		System.out.println(bensAcct.getBalance());
	}
	
}
