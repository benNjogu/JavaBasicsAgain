package com.challenge;

public class Main {

	public static void main(String[] args) {

		League<Team<RugbyPlayer>> ruji = new League<>("EPL");

		Team<RugbyPlayer> mangu = new Team<>("mang'u");
		RugbyPlayer odongo = new RugbyPlayer("Odongo");
		RugbyPlayer njogu = new RugbyPlayer("Njogu");
		// mangu.addPlayer(odongo);
		// mangu.addPlayer(njogu);
		// System.out.println(mangu.numPlayers());

		Team<RugbyPlayer> bush = new Team<>("bush");
		RugbyPlayer moraa = new RugbyPlayer("Moraa");
		RugbyPlayer kimangas = new RugbyPlayer("Kimangas");
		// bush.addPlayer(moraa);
		// bush.addPlayer(kimangas);
		// System.out.println(bush.numPlayers());

		Team<RugbyPlayer> njiiri = new Team<>("Njiiri");
		RugbyPlayer jibebe = new RugbyPlayer("Jibebe");
		RugbyPlayer ron = new RugbyPlayer("Ron");
		// njiiri.addPlayer(jibebe);
		// njiiri.addPlayer(ron);
		// System.out.println(njiiri.numPlayers());

		Team<SoccerPlayer> kogalo = new Team<>("Kogalo");
//		SoccerPlayer joe = new SoccerPlayer("Joe");
//		kogalo.addPlayer(joe);
//		System.out.println(kogalo.numPlayers());
		
		mangu.matchResult(bush, 11, 11);
		mangu.matchResult(njiiri, 12, 12);
		
		njiiri.matchResult(bush, 24, 21);
		njiiri.matchResult(mangu, 19, 12);
		
		ruji.add(njiiri);
		ruji.add(bush);
		ruji.add(mangu);
		//ruji.add(kogalo);
		
		ruji.showLeagueTable();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
