package com.keytech;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		Theatre theatre = new Theatre("KICC", 8, 12);
		theatre.reserveSeat("D12");
		theatre.reserveSeat("D12");
		theatre.reserveSeat("B13");	
		
		List<Theatre.Seat> reserveSeats = new ArrayList<>(theatre.getSeats(, tempExit));
		Collections.reverse(reserveSeats);
		printList(reserveSeats);
		
		List<Theatre.Seat> priceSeats = new ArrayList<>(theatre.getSeats(, tempExit));
		priceSeats.add(theatre.new Seat("B00", 13.00, tempExit));
		priceSeats.add(theatre.new Seat("A00", 13.00, tempExit));
		Collections.sort(priceSeats, theatre.PRICE_ORDER);
		printList(priceSeats);

	}

	public static void printList(List<Theatre.Seat> list) {
		for (Theatre.Seat seat : list) {
			System.out.println(" " + seat.getSeatNumber()+" "+seat.getPrice()+"/=");
		}
		System.out.println();
		System.out.println("===============================================================");
	}

}
