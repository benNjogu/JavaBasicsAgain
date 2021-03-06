package com.keytech;

public class Dog extends Animal {

	private int eyes;
	private int legs;
	private int tail;
	private int teeth;
	private String coat;
	
	public Dog(String name, int size, int weight,int eyes, int legs, int tail, int teeth, String coat) {
		super(name, 1, 1, size, weight);
		
		this.eyes = eyes;
		this.legs = legs;
		this.tail = tail;
		this.teeth = teeth;
		this.coat = coat;
	}
	
	private void chew() {
		System.out.println("mmmmh delicious!");
	}

	@Override
	public void eat() {
		System.out.println("am fuuul");
	}
	
	public void walk() {
		System.out.println("dog.walk() called");
		move(5);
	}
	
	public void run() {
		System.out.println("dog.run() called");
		move(12);
	}

	private void moveLegs(int speed) {
		System.out.println("calling dog.moveLegs() "+speed);
	}
	@Override
	public void move(int speed) {
		moveLegs(speed);
		System.out.println("calling move from dog "+speed);
	}
	
	

}
