package com.keytech;

public class HealthyBurger extends Hamburger {

	private String healthyExtra1Name;
	private double healthyExra1Price;

	private String healthyExtra2Name;
	private double healthyExra2Price;

	public HealthyBurger(String meat, double price) {
		super("Healthy", meat, price, "Brown rye");
	}
	
	public void addHealthyAddition1(String name, double price) {
		this.healthyExtra1Name = name;
		this.healthyExra1Price = price;
	}
	
	public void addHealthyAddition2(String name, double price) {
		this.healthyExtra2Name = name;
		this.healthyExra2Price = price;
	}

	@Override
	public double itemizeHamburger() {
		double humburgerPrice = super.itemizeHamburger();
		if(this.healthyExtra1Name != null) {
			humburgerPrice += this.healthyExra1Price;
			System.out.println("Added "+this.healthyExtra1Name+" for an exra "+this.healthyExra1Price);
		}
		if(this.healthyExtra2Name != null) {
			humburgerPrice += this.healthyExra2Price;
			System.out.println("Added "+this.healthyExtra2Name+" for an exra "+this.healthyExra2Price);
		}
		
		return humburgerPrice;
	}

}
