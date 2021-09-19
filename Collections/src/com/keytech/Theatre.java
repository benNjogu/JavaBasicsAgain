package com.keytech;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;

public class Theatre {

	private final String theatreName;
	public List<Seat> seats = new ArrayList<>();

	public Theatre(String theatreName, int numRows, int seatPerRow) {
		this.theatreName = theatreName;

		int lastRow = 'A' + (numRows - 1);
		for (char row = 'A'; row <= lastRow; row++) {
			for (int seatNum = 1; seatNum <= seatPerRow; seatNum++) {
				double price = 12.00;
				if (row<'D' && (seatNum >= 4 && seatNum >= 9)) {
					price = 14.00;
				}else if ((row< 'F') || (seatNum<4 || seatNum>9)) {
					price = 7.00;
				}
				Seat seat = new Seat(row + String.format("%02d", seatNum), price);
				seats.add(seat);
			}
		}

	}

	public String getTheatreName() {
		return theatreName;
	}

	public boolean reserveSeat(String seatNumber) {
		Seat requestedSeat = new Seat(seatNumber, 0);
		int foundSeat = Collections.binarySearch(seats, requestedSeat, null);
		if (foundSeat>=0) {
//			System.out.print(".");
			return seats.get(foundSeat).reserve();
		}else {
			System.out.println("There is no seat "+seatNumber);
			return false;
		}
		
//		for (Seat seat : seats) {
//			System.out.print(".");
//			if (seat.getSeatNumber().equals(seatNumber)) {
//				requestedSeat = seat;
//				break;
//			}
//		}
//
//		if (requestedSeat == null) {
//			System.out.println("There is no seat " + seatNumber);
//			return false;
//		}
//
//		return requestedSeat.reserve();
	}

	// for testing
	public Collection<Seat> getSeats() {
//		for (Seat seat : seats) {
//			System.out.println(seat.getSeatNumber());
//		}
		return seats;
		
	}

	public class Seat implements Comparable<Seat>{

		private final String seatNumber;
		private double price;
		private boolean reserved = false;

		public Seat(String seatNumber, double price) {
			this.seatNumber = seatNumber;
			this.price = price;
		}

		public String getSeatNumber() {
			return seatNumber;
		}

		public boolean reserve() {
			if (!this.reserved) {
				this.reserved = true;
				System.out.println("Seat "+seatNumber+" reserved.");
				System.out.println("Please pay for "+seatNumber);
				return true;
			}else {
				System.out.println("Sorry seat "+seatNumber+" already taken.");
				return false;
			}
		}
		
		public boolean cancel() {
			if(this.reserved) {
				this.reserved=false;
				System.out.println("Reservation of seat "+seatNumber+" cancelled.");
				return true;
			}else {
				return false;
			}
		}

		@Override
		public int compareTo(Seat seat) {
			
			return this.seatNumber.compareToIgnoreCase(seat.getSeatNumber());
		}

		public double getPrice() {
			return price;
		}
		
		
	}

}
