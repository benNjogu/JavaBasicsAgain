package com.keytech;

import java.util.HashMap;
import java.util.Map;

public class Location {

	private final int locationId;
	private final String description;
	private final Map<String, Integer> exits;

	public Location(int locationalId, String description, Map<String, Integer> exits) {
		super();
		this.locationId = locationalId;
		this.description = description;
		
		if (exits != null) {
			this.exits = new HashMap<>(exits);
		}else {
			this.exits = new HashMap<>();
		}
		this.exits.put("Q", 0);
	}

	protected void addExit(String direction, int location) {
		exits.put(direction, location);
	}
	
	public int getLocationId() {
		return locationId;
	}

	public String getDescription() {
		return description;
	}

	public Map<String, Integer> getExits() {
		return new HashMap<>(exits);
	}

	
	
}
