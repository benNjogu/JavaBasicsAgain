package com.keytech;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		SoccerPlayer joe = new SoccerPlayer("Joe");
		VolleyBallPlayer wacu = new VolleyBallPlayer("Wacu");
		RugbyPlayer odongo = new RugbyPlayer("Odongo");
		
		Team kogalo = new Team("Kogalo");
		kogalo.addPlayer(joe);
		kogalo.addPlayer(wacu);
		kogalo.addPlayer(odongo);
		
		System.out.println(kogalo.numPlayers());
		
	}
	
	
}
