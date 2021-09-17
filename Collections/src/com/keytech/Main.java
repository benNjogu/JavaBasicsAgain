package com.keytech;

public class Main {

	public static void main(String[] args) {
		
		Theatre theatre = new Theatre("KICC", 8, 12);
		//theatre.getSeats();
		
		theatre.reserveSeat("H11");
		theatre.reserveSeat("H11");
		theatre.reserveSeat("H11");
		theatre.reserveSeat("H11");
		
	}
	
}
