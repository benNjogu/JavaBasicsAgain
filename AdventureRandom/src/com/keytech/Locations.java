package com.keytech;

import java.io.BufferedInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.RandomAccessFile;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class Locations implements Map<Integer, Location> {

	private static Map<Integer, Location> locations = new LinkedHashMap<Integer, Location>();
	private static Map<Integer, IndexRecord> index = new LinkedHashMap<>();
	private static RandomAccessFile ra;

	public static void main(String[] args) throws IOException {

		try (RandomAccessFile rao = new RandomAccessFile("locations_rand.dat", "rwd")) {

			/**
			 * 1. The first four bytes will contain the number of locations(bytes 0-3)
			 * 2. The next four bytes will contain the start offset of the locations section(bytes 4-7)
			 * 3. The next section of the file will contain the index(the index is 1692 bytes long).bytes 8-69 
			 * 4. The final section of the file will contain the location records(the data). it will start at 1700
			 * */
			
			rao.writeInt(locations.size());
			//locationId, offset and length hence multiply by 3.
			int indexSize = locations.size() * 3 * Integer.BYTES;
			int locationStart = (int) (indexSize + rao.getFilePointer() + Integer.BYTES);
			rao.writeInt(locationStart);
			
			long indexStart = rao.getFilePointer();
			
			int startPointer = locationStart;
			rao.seek(startPointer);
			
			for(Location location : locations.values()) {
				rao.writeInt(location.getLocationId());
				rao.writeUTF(location.getDescription());
				StringBuilder builder =  new StringBuilder();
				for(String direction : location.getExits().keySet()) {
					if (!direction.equalsIgnoreCase("Q")) {
						builder.append(direction);
						builder.append(",");
						builder.append(location.getExits().get(direction));
						builder.append(",");
					}
				}
				
				rao.writeUTF(builder.toString());
				
				IndexRecord record = new IndexRecord(startPointer, (int) rao.getFilePointer() - startPointer);
				index.put(location.getLocationId(), record);
				startPointer = (int) rao.getFilePointer();
			}
			
			rao.seek(indexStart);
			for (Integer locationId : index.keySet()) {
				rao.write(locationId);
				rao.write(index.get(locationId).getStartByte());
				rao.write(index.get(locationId).getLength());
			}
			
		}

	}

	static {
		try {
			ra = new RandomAccessFile("locations_rand.dat", "rwd");
			int numLocations = ra.readInt();
			long locationStartPoint = ra.readInt();
			while(ra.getFilePointer() < locationStartPoint) {
				int locationId = ra.readInt();
				int locationStart = ra.readInt();
				int locationLength = ra.readInt();
				
				IndexRecord record = new IndexRecord(locationStart, locationLength);
				index.put(locationId, record);
			}
			
		} catch (IOException e) {
			System.out.println("IOException in static initializer: " + e.getMessage());
		}
	}

	public Location getLocation(int locationId) throws IOException {
		IndexRecord record = index.get(locationId);
		ra.seek(record.getStartByte());
		int id = ra.readInt();
		String description = ra.readUTF();
		String exits = ra.readUTF();
		String[] exitPart = exits.split(",");
		
		Location location = new Location(locationId, description, null);
		
		if (locationId != 0) {
			for (int i = 0; i < exitPart.length; i++) {
				System.out.println("exitPart = " + exitPart[i]);
				System.out.println("exitPart[+1] " + exitPart[i + 1]);
				String direction = exitPart[i];
				int destination = Integer.parseInt(exitPart[++i]);
				location.addExit(direction, destination);
			}
		}
		
		return location;
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
	
	public void close() throws IOException {
		ra.close();
	}

}