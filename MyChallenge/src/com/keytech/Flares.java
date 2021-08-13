package com.keytech;

public class Flares {

	private int size = 2;

	public Flares(int size) {
		super();
		if(size<1 || size>3) {
			this.size = 2;
		}
		else {
			this.size = size;
		}
		
	}

	public int getSize() {
		if(size==1) {
			System.out.println("Flares: soft which means easy");
		}
		else {
			System.out.println("Flares: hard which means fast");
		}
		return size;
	}
	
	public boolean isOiled(boolean oiled) {
		return oiled;
	}
	
}
