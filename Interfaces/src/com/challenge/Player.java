package com.challenge;

import java.util.ArrayList;
import java.util.List;

public class Player implements ISavable {

	private String name;
	private int hitpoints;
	private int strength;
	private String weapon;

	public Player(String name, int hitpoints, int strength) {
		super();
		this.name = name;
		this.hitpoints = hitpoints;
		this.strength = strength;
		this.weapon = "sword";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHitpoints() {
		return hitpoints;
	}

	public void setHitpoints(int hitpoints) {
		this.hitpoints = hitpoints;
	}

	public int getStrength() {
		return strength;
	}

	public void setStrength(int strength) {
		this.strength = strength;
	}

	public String getWeapon() {
		return weapon;
	}

	public void setWeapon(String weapon) {
		this.weapon = weapon;
	}

	@Override
	public String toString() {
		return "Player [name=" + name + 
				", hitpoints=" + hitpoints + 
				", strength=" + strength + 
				", weapon=" + weapon
				+ "]";
	}

	@Override
	public List<String> write() {
		List<String> values = new ArrayList<>();
		values.add(0, this.name);
		values.add(1, ""+this.hitpoints);
		values.add(2, ""+this.strength);
		values.add(3, this.weapon);
		
		return values;
	}

	@Override
	public void read(ArrayList<String> savedValues) {
		if(savedValues != null && savedValues.size()>0) {
			this.name = savedValues.get(0);
			this.hitpoints = Integer.parseInt(savedValues.get(1, tempExit));
			this.strength = Integer.parseInt(savedValues.get(2, tempExit));
			this.weapon = savedValues.get(3);
		}
	}
	
	public static void saveObject(ISavable objectToSave) {
		for(int i = 0; i<objectToSave.write().size(); i++) {
			System.out.println("Saving "+objectToSave.write().get(i)+" to storage device");
		}
	}
	
	public static void loadObject(ISavable objectToLoad) {
		//ArrayList<String> values = readValues();
 	}
	

}
