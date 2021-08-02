package com.keytech;

public class Account {

	private int accNo;
	private double balance;
	private String customerName, email, phoneNumber;
	
	public Account() {
	
		System.out.println("Empty constructor called!");
		
	}
	
	public Account(int accNo, double balance, String customerName, String email, String phoneNumber) {
		this.accNo = accNo;
		this.balance = balance;
		this.customerName = customerName;
		this.email = email;
		this.phoneNumber = phoneNumber;
	}

	public int getAccNo() {
		return accNo;
	}

	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public void deposit(double amount) {
		this.balance += amount;
		System.out.println("You have deposited " + amount + " on your account.\nYour balance is " + this.balance);
	}

	public void withdraw(double amount) {
		if (this.balance < 0) {
			System.out.println("You've got no money...");
		} else if (this.balance - amount <= 0) {
			System.out.println("Not enough money!! Your balance is "+this.balance);
		} else if (this.balance < amount) {
			System.out.println("You do not have enough money.\nYour balance is " + this.balance);
		} else {
			this.balance -= amount;
			System.out
					.println(amount + " successfully withdrawn from your account. Account balance is " + this.balance);
		}
	}

}
