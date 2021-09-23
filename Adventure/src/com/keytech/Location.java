package com.keytech;

import java.util.HashMap;
import java.util.Map;

public class Location {

	private final int locationalId;
	private final String description;
	private final Map<String, Integer> exits;

	public Location(int locationalId, String description) {
		super();
		this.locationalId = locationalId;
		this.description = description;
		this.exits = new HashMap<String, Integer>();
		this.exits.put("Q", 0);
	}

	public void addExit(String direction, int location) {
		exits.put(direction, location);
	}
	
	public int getLocationalId() {
		return locationalId;
	}

	public String getDescription() {
		return description;
	}

	public Map<String, Integer> getExits() {
		return new HashMap<>(exits);
	}

	
	
}
