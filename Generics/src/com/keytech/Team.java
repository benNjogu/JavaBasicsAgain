package com.keytech;

import java.util.ArrayList;

public class Team {

	private String name;
	int played = 0;
	int won = 0;
	int lost = 0;
	int tied = 0;

	private ArrayList<Player> members = new ArrayList<>();

	public Team(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public boolean addPlayer(Player player) {
		if (members.contains(player)) {
			System.out.println(player.getName() + " is already on the team");
			return false;
		} else {
			members.add(player);
			System.out.println(player.getName() + " picked for item " + this.name);
			return true;
		}
	}

	public int numPlayers() {
		return members.size();
	}

	public void matchResult(Team opponent, int ourScore, int theirScore) {
		if (ourScore > theirScore) {
			won++;
		} else if (ourScore == theirScore) {
			tied++;
		} else {
			lost++;
		}
		played++;
		if (opponent != null) {
			opponent.matchResult(null, ourScore, theirScore);
		}
	}

	public int ranking() {
		return (won * 3) + tied;
	}

}
