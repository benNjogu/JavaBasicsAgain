package com.keytech;

public class Main {

	public static void main(String[] args) {
		
		Account kimsAccount = new Account("Kim");
		kimsAccount.deposit(1000);
		kimsAccount.withdraw(500);
		kimsAccount.withdraw(200);
		kimsAccount.withdraw(-200);
		kimsAccount.deposit(-20);
		kimsAccount.calculateBalance();
		
		System.out.println("Balance on account is "+kimsAccount.getBalance(, tempExit));
		
	}
	
}
