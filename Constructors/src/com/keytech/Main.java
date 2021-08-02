package com.keytech;

public class Main {

	public static void main(String[] args) {
		Account bensAcct = new Account(12345, 750.00, "Bernad Njogu", "kimangas@gmail.com","0745580333");
		bensAcct = new Account();
		System.out.println(bensAcct.getBalance());
		
		Account kimsAcct = new Account("Kimangas", "k@yahoo.com", "0715617439");
		System.out.println(kimsAcct.getAccNo());
	}
	
}
