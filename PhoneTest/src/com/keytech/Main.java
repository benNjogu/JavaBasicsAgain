package com.keytech;

import com.example.game.Deskphone;
import com.example.game.ITelephone;
import com.example.game.MobilePhone;

public class Main {

	public static void main(String[] args) {
		
		ITelephone bensPhone;
		bensPhone = new Deskphone(745580333);
		bensPhone.powerOn();
		bensPhone.callPhone(745580333);
		bensPhone.answer();
		
		System.out.println("---------------------------------------");
		bensPhone = new MobilePhone(784953);
		bensPhone.powerOn();
		bensPhone.callPhone(784953);
		bensPhone.answer();
		
	}

}
