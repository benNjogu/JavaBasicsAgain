package com.keytech;

import java.io.Serializable;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @Serialization :The process of translating a data structure or an object into
 *                a format that can be stored.
 */
public class Location implements Serializable {

	private final int locationId;
	private final String description;
	private final Map<String, Integer> exits;
	
	private Long serialVersionUID = 1L; 

	public Location(int locationalId, String description, Map<String, Integer> exits) {
		super();
		this.locationId = locationalId;
		this.description = description;

		if (exits != null) {
			this.exits = new LinkedHashMap<>(exits);
		} else {
			this.exits = new LinkedHashMap<>();
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
		return new LinkedHashMap<>(exits);
	}

}
