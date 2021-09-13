package com.keytech;

public class Main {

	public static void main(String[] args) {
		
		SoccerPlayer joe = new SoccerPlayer("Joe");
		VolleyBallPlayer wacu = new VolleyBallPlayer("Wacu");
		RugbyPlayer odongo = new RugbyPlayer("Odongo");
		RugbyPlayer njogu = new RugbyPlayer("Njogu");
		
		Team<SoccerPlayer> kogalo = new Team<>("Kogalo");
		kogalo.addPlayer(joe);
		//kogalo.addPlayer(wacu);
		//kogalo.addPlayer(odongo);
		
		System.out.println(kogalo.numPlayers());
		
		Team<RugbyPlayer> rTeam = new Team<>("Kenya 7s");
		rTeam.addPlayer(odongo);
		rTeam.addPlayer(njogu);
		
		System.out.println(rTeam.numPlayers());
		
	}
	
	
}
