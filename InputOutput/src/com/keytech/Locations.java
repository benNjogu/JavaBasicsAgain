package com.keytech;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Locations implements Map<Integer, Location> {

	private static Map<Integer, Location> locations = new HashMap<Integer, Location>();

	public static void main(String[] args) throws IOException {
		try(FileWriter locFile = new FileWriter("locations.txt")) {
			for(Location location : locations.values()) {
				locFile.write(location.getLocationalId()+","+location.getDescription()+"\n");
			}
		} catch (Exception e) {
			
		}
		
//		FileWriter locFile = null;
//		try {
//			locFile = new FileWriter("locations.txt");
//			for (Location location : locations.values()) {
//				locFile.write(location.getLocationalId() + "," + location.getDescription() + "\n");
//			}
//
//		} finally {
//			System.out.println("In finally block");
//
//			if (locFile != null) {
//				System.out.println("Attempting to close locFile");
//				locFile.close();
//			}
//
//		}

	}

	static {
		Map<String, Integer> tempExit = new HashMap<String, Integer>();
		locations.put(0, new Location(0, "You are sitting in front of a computer learning java", tempExit));

		tempExit = new HashMap<String, Integer>();
		tempExit.put("W", 2);
		tempExit.put("E", 3);
		tempExit.put("S", 4);
		tempExit.put("N", 5);
		locations.put(1, new Location(1, "You are headed for a ride", tempExit));

		tempExit = new HashMap<String, Integer>();
		tempExit.put("N", 5);
		locations.put(2, new Location(2, "You are at the top of a hill", tempExit));

		tempExit = new HashMap<String, Integer>();
		tempExit.put("W", 1);
		locations.put(3, new Location(3, "You are moving sometime ", tempExit));

		tempExit = new HashMap<String, Integer>();
		tempExit.put("N", 1);
		tempExit.put("W", 2);
		locations.put(4, new Location(4, "You are on your way to school", tempExit));

		tempExit = new HashMap<String, Integer>();
		tempExit.put("S", 1);
		tempExit.put("W", 2);
		locations.put(5, new Location(5, "You are conversing with friends", null));
	}

	@Override
	public void clear() {
		locations.clear();
	}

	@Override
	public boolean containsKey(Object key) {
		return locations.containsKey(key);
	}

	@Override
	public boolean containsValue(Object value) {
		return locations.containsValue(value);
	}

	@Override
	public Set<Entry<Integer, Location>> entrySet() {
		return locations.entrySet();
	}

	@Override
	public Location get(Object key) {
		return locations.get(key);
	}

	@Override
	public boolean isEmpty() {
		return locations.isEmpty();
	}

	@Override
	public Set<Integer> keySet() {
		return locations.keySet();
	}

	@Override
	public Location put(Integer key, Location value) {
		return locations.put(key, value);
	}

	@Override
	public void putAll(Map<? extends Integer, ? extends Location> arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public Location remove(Object key) {
		return locations.remove(key);
	}

	@Override
	public int size() {
		return locations.size();
	}

	@Override
	public Collection<Location> values() {
		return locations.values();
	}

}