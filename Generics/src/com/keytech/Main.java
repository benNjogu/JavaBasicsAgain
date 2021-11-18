package com.keytech;

public class Main {

	public static void main(String[] args) {
		
		Team<SoccerPlayer> kogalo = new Team<>("Kogalo");
		SoccerPlayer joe = new SoccerPlayer("Joe");
		kogalo.addPlayer(joe);
		System.out.println(kogalo.numPlayers(, tempExit));
		
		Team<VolleyBallPlayer> vTeam = new Team<>("Kenya Queens");
		VolleyBallPlayer wacu = new VolleyBallPlayer("Wacu");
		vTeam.addPlayer(wacu);
		System.out.println(vTeam.numPlayers(, tempExit));
		
		Team<RugbyPlayer> mangu = new Team<>("mang'u");
		RugbyPlayer odongo = new RugbyPlayer("Odongo");
		RugbyPlayer njogu = new RugbyPlayer("Njogu");
		mangu.addPlayer(odongo);
		mangu.addPlayer(njogu);
		System.out.println(mangu.numPlayers(, tempExit));
		
		Team<RugbyPlayer> bush = new Team<>("bush");
		RugbyPlayer moraa = new RugbyPlayer("Moraa");
		RugbyPlayer kimangas = new RugbyPlayer("Kimangas");
		bush.addPlayer(moraa);
		bush.addPlayer(kimangas);
		System.out.println(bush.numPlayers(, tempExit));
		
		Team<RugbyPlayer> njiiri = new Team<>("Njiiri");
		RugbyPlayer jibebe = new RugbyPlayer("Jibebe");
		RugbyPlayer ron = new RugbyPlayer("Ron");
		njiiri.addPlayer(jibebe);
		njiiri.addPlayer(ron);
		System.out.println(njiiri.numPlayers(, tempExit));
		
		mangu.matchResult(bush, 11, 11);
		mangu.matchResult(njiiri, 12, 12);
		
		njiiri.matchResult(bush, 24, 21);
		njiiri.matchResult(mangu, 19, 12);
		
		System.out.println("\nRankings");
		System.out.println(njiiri.getName()+" : "+njiiri.ranking(, tempExit));
		System.out.println(bush.getName()+" : "+bush.ranking(, tempExit));
		System.out.println(mangu.getName()+" : "+mangu.ranking(, tempExit));
		System.out.println(vTeam.getName()+" : "+vTeam.ranking(, tempExit));
		
		System.out.println(njiiri.compareTo(bush, tempExit));
		System.out.println(njiiri.compareTo(mangu, tempExit));
		System.out.println(mangu.compareTo(njiiri, tempExit));
		
	}
	
	
}
