package com.example.game;

public class Deskphone implements ITelephone {

	private int myNumber;
	private boolean isRinging;
	
	public Deskphone(int myNumber) {
		super();
		this.myNumber = myNumber;
	}

	@Override
	public void powerOn() {
		System.out.println("No action taken, Deskphone does not have a power button");
	}

	@Override
	public void dial(int phoneNumber) {
		System.out.println("Now ringing "+myNumber+" on deskphone");
	}

	@Override
	public void answer() {
		if(isRinging) {
			System.out.println("Answering the deskphone");
			isRinging = false;
		}
	}

	@Override
	public boolean callPhone(int phoneNumber) {
		if(phoneNumber == myNumber) {
			isRinging=true;
			System.out.println("Ring ring");
		}else {
			isRinging = false;
		}
		return isRinging;
	}

	@Override
	public boolean isRinging() {
		return isRinging;
	}

}
