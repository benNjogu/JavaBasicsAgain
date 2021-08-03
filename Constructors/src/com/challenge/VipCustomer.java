package com.challenge;

public class VipCustomer {

	private String name;
	private double creditLimit;
	private String email;

	public VipCustomer() {
		this("defaultname", 0.00, "defaultEmail");
	}

	public VipCustomer(String name, double creditLimit, String email) {
		super();
		this.name = name;
		this.creditLimit = creditLimit;
		this.email = email;
	}

	public VipCustomer(String name, double creditLimit) {
		this(name,creditLimit, "defaultEmail");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public double getCreditLimit() {
		return creditLimit;
	}

	public void setCreditLimit(double creditLimit) {
		this.creditLimit = creditLimit;
	}


}
