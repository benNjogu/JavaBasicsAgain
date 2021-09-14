package com.challenge;

import java.util.ArrayList;
import java.util.Collections;

public class League<T extends Team> {

	public String name;
	private ArrayList<T> league = new ArrayList<>();

	public League(String name) {
		super();
		this.name = name;
	}

	public boolean add(T team) {
		if (league.contains(team)) {
			return false;
		}
		league.add(team);
		return true;
	
	}
	
	public void showLeagueTable() {
		Collections.sort(league);
		System.out.println();
		for (T t : league) {
			System.out.println(t.getName()+": "+t.ranking());
		}
	}
	
}
