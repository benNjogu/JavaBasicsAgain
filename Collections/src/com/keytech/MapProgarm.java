package com.keytech;

import java.util.HashMap;
import java.util.Map;

public class MapProgarm {

	public static void main(String[] args) {

		Map<String, String> languages = new HashMap<>();
		languages.put("Java", "High level, Object Oriented, Platform independent language");
		languages.put("Python",
				"An interpreted, Object oriented, High level programing language with dynamic semantics");
		languages.put("Algol", "An algorithmic language");
		languages.put("Basic", "Beginners all purpose symbolic instruction code");
		languages.put("Lisp", "There in lies madness");

		if (languages.containsKey("Java")) {
			System.out.println("Java already exists in the map");
		} else {
			languages.put("Java", "what i want to preach");
		}

		System.out.println(languages.get("Java"));

		System.out.println("============================================================================");

		for (String key : languages.keySet()) {
			System.out.println(key+" : "+languages.get(key));
		}

	}

}
