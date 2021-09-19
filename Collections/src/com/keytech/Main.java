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
		
		
//		List<Theatre.Seat> seatCopy = new ArrayList<>(theatre.seats);
//		printList(seatCopy);
//
//		seatCopy.get(1).reserve();
//		Collections.shuffle(seatCopy);
//		System.out.println("printing seat copy");
//		printList(seatCopy);
//		System.out.println("printing theatre.seat");
//		printList(theatre.seats);

//		Theatre.Seat minSeat = Collections.min(seatCopy);
//		Theatre.Seat maxSeat = Collections.max(seatCopy);
//		System.out.println("Min seat number is " + minSeat.getSeatNumber());
//		System.out.println("Min seat number is " + maxSeat.getSeatNumber());
//		
//		sortList(seatCopy);
//		System.out.println("printing sorted copy");
//		printList(seatCopy);
//		
//		List<Theatre.Seat> newList = new ArrayList<>(theatre.seats.size());
//		Collections.copy(newList, theatre.seats);

	}

	public static void printList(List<Theatre.Seat> list) {
		for (Theatre.Seat seat : list) {
			System.out.print(" " + seat.getSeatNumber()+" "+seat.getPrice());
		}
		System.out.println();
		System.out.println("===============================================================");
	}

//	public static void sortList(List<? extends Theatre.Seat> list) {
//
//		for (int i = 0; i < list.size() - 1; i++) {
//
//			for (int j = 0; j < list.size(); j++) {
//				
//				if (list.get(i).compareTo(list.get(j)) > 0) {
//					Collections.swap(list, i, j);
//				}
//				
//			}
//
//		}
//
//	}

}
