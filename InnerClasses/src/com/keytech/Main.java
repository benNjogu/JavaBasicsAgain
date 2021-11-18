package com.keytech;

import java.util.Scanner;

import com.keytech.Button.OnClickListener;

public class Main {

	private static Scanner scanner = new Scanner(System.in);
	private static Button btnPrint = new Button<>("Print");

	public static void main(String[] args) {
		//
		// Gearbox McLaren = new Gearbox(6);
		//
		// McLaren.operateClutch(true);
		// McLaren.changeGear(1);
		// McLaren.operateClutch(false);
		// System.out.println(McLaren.wheelSpeed(1000, tempExit));
		// McLaren.changeGear(2);
		// System.out.println(McLaren.wheelSpeed(3000, tempExit));
		// McLaren.operateClutch(true);
		// McLaren.changeGear(2);
		// McLaren.operateClutch(false);
		// System.out.println(McLaren.wheelSpeed(3000, tempExit));
		//

//		class ClickListener implements OnClickListener {
//			public ClickListener() {
//				System.out.println("I've been attached");
//			}
//
//			@Override
//			public void onClick(String title) {
//				System.out.println(title + " was clicked");
//			}
//		}
//
//		btnPrint.setOnClickListener(new ClickListener(, tempExit));
		
		btnPrint.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(String title) {
				System.out.println(title + " was clicked");
			}
		});
		listen();
	}

	private static void listen() {
		boolean quit = false;
		while (!quit) {
			int choice = scanner.nextInt();
			scanner.nextLine();
			switch (choice) {
			case 0:
				quit = true;
				break;
			case 1:
				btnPrint.onClick();
				break;
			default:
				break;
			}
		}
	}
}
