package com.keytech;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Locations implements Map<Integer, Location> {

	private static Map<Integer, Location> locations = new HashMap<Integer, Location>();

	public static void main(String[] args) throws IOException {
		try (DataOutputStream locFile = new DataOutputStream(
				new BufferedOutputStream(new FileOutputStream("locations.dat")))) {
			for (Location location : locations.values()) {
				locFile.writeInt(location.getLocationId());
				locFile.writeUTF(location.getDescription());
				System.out.println("Writing location " + location.getLocationId() + ":" + location.getDescription());
				System.out.println("Writing " + (location.getExits().size() - 1) + " exits.");
				locFile.writeInt(location.getExits().size() - 1);
				for (String direction : location.getExits().keySet()) {
					if (!direction.equalsIgnoreCase("Q")) {
						System.out.println("\t\t" + direction + "," + location.getExits().get(direction));
						locFile.writeUTF(direction);
						locFile.writeInt(location.getExits().get(direction));
					}
				}
			}
		}

	}

	static {
		try (DataInputStream locFile = new DataInputStream(
				new BufferedInputStream(new FileInputStream("locations.dat")))) {

			boolean eof = false;
			while (!eof) {
				try {
					Map<String, Integer> exits = new LinkedHashMap<>();
					int locID = locFile.readInt();
					String description = locFile.readUTF();
					int numExits = locFile.readInt();
					System.out.println("Read location " + locID + " : " + description);
					System.out.println("Found " + numExits + " exits");
					for (int i = 0; i < numExits; i++) {
						String direction = locFile.readUTF();
						int destination = locFile.readInt();
						exits.put(direction, destination);
						System.out.println("\t\t" + direction + "," + destination);
					}

					locations.put(locID, new Location(locID, description, exits));
				} catch (EOFException e) {
					eof = true;
				}

			}
		} catch (IOException e) {
			System.out.println("IO Exception");
			e.printStackTrace();
		}

		// Scanner scanner = null;
		// try {
		// scanner = new Scanner(new FileReader("locations.txt"));
		// scanner.useDelimiter(",");
		// while (scanner.hasNextLine()) {
		// int loc = scanner.nextInt();
		// scanner.skip(scanner.delimiter());
		// String description = scanner.nextLine();
		// System.out.println("Imported loc: " + loc + ": " + description);
		// Map<String, Integer> tempExit = new HashMap<>();
		// locations.put(loc, new Location(loc, description, tempExit));
		// }
		// } catch (IOException e) {
		// e.printStackTrace();
		// } finally {
		// if (scanner != null) {
		// scanner.close();
		// }
		// }
		//
		// // Now read the exits
		// try {
		// scanner = new Scanner(new BufferedReader(new FileReader("directions.txt")));
		// scanner.useDelimiter(",");
		// while (scanner.hasNextLine()) {
		//
		// String input = scanner.nextLine();
		// String[] data = input.split(",");
		// int loc = Integer.parseInt(data[0]);
		// String direction = data[1];
		// int destination = Integer.parseInt(data[2]);
		// System.out.println(loc + ": " + direction + ": " + destination);
		// Location location = locations.get(loc);
		// location.addExit(direction, destination);
		// }
		// } catch (IOException e) {
		// e.printStackTrace();
		// } finally {
		// if (scanner != null) {
		// scanner.close();
		// }
		// }
		//
		// locations.put(5, new Location(5, "You are conversing with friends", null));
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
