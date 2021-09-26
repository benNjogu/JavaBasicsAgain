package com.keytech;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {

	private static Map<String, HeavenlyBody> solarSystem = new HashMap<String, HeavenlyBody>();
	private static Set<HeavenlyBody> planets = new HashSet<>();
	
	public static void main(String[] args) {

		HeavenlyBody temp = new HeavenlyBody("mercury", 88);
		solarSystem.put(temp.getName(), temp);
		planets.add(temp);
		
		temp = new HeavenlyBody("venus", 225);
		solarSystem.put(temp.getName(), temp);
		planets.add(temp);
		
		temp = new HeavenlyBody("earth", 365);
		solarSystem.put(temp.getName(), temp);
		planets.add(temp);
		
		HeavenlyBody tempMoon = new HeavenlyBody("moon", 27);
		solarSystem.put(tempMoon.getName(), tempMoon);
		temp.addMoon(tempMoon);
		
		tempMoon = new HeavenlyBody("moon1", 27);
		solarSystem.put(tempMoon.getName(), tempMoon);
		temp.addMoon(tempMoon);
		
		tempMoon = new HeavenlyBody("moon2", 27);
		solarSystem.put(tempMoon.getName(), tempMoon);
		temp.addMoon(tempMoon);
		
		temp = new HeavenlyBody("mars", 687);
		solarSystem.put(temp.getName(), temp);
		planets.add(temp);
		
		tempMoon = new HeavenlyBody("moon3", 28);
		solarSystem.put(tempMoon.getName(), tempMoon);
		temp.addMoon(tempMoon);
		
		tempMoon = new HeavenlyBody("moon4", 2);
		solarSystem.put(tempMoon.getName(), tempMoon);
		temp.addMoon(tempMoon);
		
		temp = new HeavenlyBody("jupiter", 4332);
		solarSystem.put(temp.getName(), temp);
		planets.add(temp);
		
		temp = new HeavenlyBody("saturn", 10759);
		solarSystem.put(temp.getName(), temp);
		planets.add(temp);
		
		temp = new HeavenlyBody("uranus", 30660);
		solarSystem.put(temp.getName(), temp);
		planets.add(temp);
		
		temp = new HeavenlyBody("neptune", 165);
		solarSystem.put(temp.getName(), temp);
		planets.add(temp);
		
		temp = new HeavenlyBody("pluto", 248);
		solarSystem.put(temp.getName(), temp);
		planets.add(temp);
		
		
		System.out.println("planets:-");
		for (HeavenlyBody planet : planets) {
			System.out.println("\t"+planet.getName());
		}
		
		
		HeavenlyBody body = solarSystem.get("mars");
		System.out.println("moons of "+body.getName());
		for (HeavenlyBody moonss: body.getSatellites()) {
			System.out.println(moonss.getName());
		}
		
	}

}
