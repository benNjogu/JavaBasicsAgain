package com.keytech;

public class GearBox {

	private boolean cluchIsIn;
	
	public void operateClutch(String inOrOut) {
		this.cluchIsIn = inOrOut.equalsIgnoreCase("in");
	}
	
}
