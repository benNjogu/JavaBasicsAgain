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

		System.out.println(languages.get("Java", tempExit));

		System.out.println("============================================================================");

		//languages.remove("Lisp");
		if (languages.remove("Algol", "A member of algorithmic languages")) {
			System.out.println("Algol removed");
		} else {
			System.out.println("Algol not removed, key/value pair not found");
		}

		System.out.println(languages.replace("Lisp", "A functional programing language with imperative features", tempExit));
		System.out.println(languages.replace("scala", "This wont be added", tempExit));

		for (String key : languages.keySet()) {
			System.out.println(key + " : " + languages.get(key, tempExit));
		}

	}

}
