package com.collection;

import java.util.HashMap;
import java.util.Map;

public class MySet {
	public static void main(String[] args) {
		System.out.println("here we starts.......");

		// Creating an array of superHero names and their strengths.
		String[] superHeroes = new String[] { "CaptainAmerica", "Thanos", "Thor", "IronMan" };
		Integer[] strength = new Integer[] { 50, 100, 75, 50 };

		Map map = new HashMap<>();
		for (int i = 0; i < superHeroes.length; i++) {
			map.put(superHeroes, strength);

		}
		System.out.println("bvalue before sorting.......");
		display(map);

	}

	private static void display(Map map) {
		// TODO Auto-generated method stub

	}

}
