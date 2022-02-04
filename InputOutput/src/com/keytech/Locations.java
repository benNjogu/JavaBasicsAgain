package com.keytech;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Locations implements Map<Integer, Location> {

	private static Map<Integer, Location> locations = new HashMap<Integer, Location>();

	public static void main(String[] args) throws IOException {
		// try (DataOutputStream locFile = new DataOutputStream(
		// new BufferedOutputStream(new FileOutputStream("locations.dat")))) {
		// for (Location location : locations.values()) {
		// locFile.writeInt(location.getLocationId());
		// locFile.writeUTF(location.getDescription());
		// System.out.println("Writing location " + location.getLocationId() + ":" +
		// location.getDescription());
		// System.out.println("Writing " + (location.getExits().size() - 1) + "
		// exits.");
		// locFile.writeInt(location.getExits().size() - 1);
		// for (String direction : location.getExits().keySet()) {
		// if (!direction.equalsIgnoreCase("Q")) {
		// System.out.println("\t\t" + direction + "," +
		// location.getExits().get(direction));
		// locFile.writeUTF(direction);
		// locFile.writeInt(location.getExits().get(direction));
		// }
		// }
		// }
		// }

		try (ObjectOutputStream locFile = new ObjectOutputStream(
				new BufferedOutputStream(new FileOutputStream("locations.dat")))) {

			for (Location location : locations.values()) {
				locFile.writeObject(location);
			}
		}

	}

	static {
		try (ObjectInputStream locFile = new ObjectInputStream(
				new BufferedInputStream(new FileInputStream("locations.dat")))) {

			boolean eof = false;
			while (!eof) {
				try {
					Location location = (Location) locFile.readObject();
					System.out.println("Read location " + location.getLocationId() + " : " + location.getDescription());
					System.out.println("Found " + location.getExits().size() + " exits");
					locations.put(location.getLocationId(), location);
				} catch (EOFException e) {
					eof = true;
				}

			}
		} catch (IOException e) {
			System.out.println("IO Exception "+e.getMessage());
		}catch (ClassNotFoundException e) {
			System.out.println("ClassNotFoundException "+e.getMessage());
		}
		// while (!eof) {
		// try {
		// Map<String, Integer> exits = new LinkedHashMap<>();
		// int locID = locFile.readInt();
		// String description = locFile.readUTF();
		// int numExits = locFile.readInt();
		// System.out.println("Read location " + locID + " : " + description);
		// System.out.println("Found " + numExits + " exits");
		// for (int i = 0; i < numExits; i++) {
		// String direction = locFile.readUTF();
		// int destination = locFile.readInt();
		// exits.put(direction, destination);
		// System.out.println("\t\t" + direction + "," + destination);
		// }
		//
		// locations.put(locID, new Location(locID, description, exits));
		// } catch (EOFException e) {
		// eof = true;
		// }
		//
		// }

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
