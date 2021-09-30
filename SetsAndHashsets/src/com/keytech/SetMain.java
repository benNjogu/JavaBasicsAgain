package com.keytech;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.omg.CORBA.PRIVATE_MEMBER;

public class SetMain {

	public static void main(String[] args) {

		Set<Integer> squares = new HashSet<>();
		Set<Integer> cubes = new HashSet<>();

		for (int i = 1; i <= 100; i++) {
			squares.add(i * i);
			cubes.add(i * i * i);
		}

		System.out.println("There are " + squares.size() + " squares and " + cubes.size() + " cubes");

		Set<Integer> union = new HashSet<>(squares);
		union.addAll(cubes);
		System.out.println("union contains " + union.size() + " elements.");

		Set<Integer> intersection = new HashSet<>(squares);
		intersection.retainAll(cubes);
		System.out.println("Intersection contains " + intersection.size() + " elemnts.");

		for (Integer integer : intersection) {
			System.out.println(
					integer + " is the square of " + Math.sqrt(integer) + " and the cube of " + Math.cbrt(integer));
		}

		Set<String> words = new HashSet<>();
		String sentence = "One day i will truly be a Java evangelist";
		String[] arrayWords = sentence.split(" ");
		words.addAll(Arrays.asList(arrayWords));

		for (String word : words) {
			System.out.println(word);
		}

		Set<String> nature = new HashSet<>();
		Set<String> divine = new HashSet<>();

		String[] natureWords = { "all", "nature", "is", "but", "art", "unknown", "to", "thee" };
		nature.addAll(Arrays.asList(natureWords));

		String[] divineWords = { "to", "err", "is", "human", "to", "forgive", "divine" };
		divine.addAll(Arrays.asList(divineWords));

		System.err.println("nature - divine");
		Set<String> diff1 = new HashSet<>(nature);
		diff1.removeAll(divine);
		printSet(diff1);

		System.err.println("divine - nature");
		Set<String> diff2 = new HashSet<>(divine);
		diff2.removeAll(nature);
		printSet(diff2);

		Set<String> unionTest = new HashSet<>(nature);
		unionTest.addAll(divine);
		Set<String> intersectionTest = new HashSet<>(nature);
		intersectionTest.retainAll(divine);

		System.err.println("Symmetric difference");
		unionTest.removeAll(intersectionTest);
		printSet(unionTest);

		
		if (nature.containsAll(divine)) {
			System.out.println("divine is a subset of nature");
		}
		if(nature.containsAll(intersectionTest)) {
			System.out.println("intersectionTest is a subset of nature");
		}
		if (divine.containsAll(intersectionTest)) {
			System.out.println("intersectionTest is a subset of divine");
		}

	}

	private static void printSet(Set<String> set) {
		System.out.println("\t\t");
		for (String string : set) {
			System.out.print(string + " ");
		}

		 System.out.println();
	}

}
