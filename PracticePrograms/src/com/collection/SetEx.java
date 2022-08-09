package com.collection;

import java.util.HashSet;
import java.util.Set;

public class SetEx {
	public static void main(String[] args) {
		System.out.println("set example....");

		/*
		 * names.add("cherry");
		 * 
		 * names.add("apple");
		 * 
		 * names.add("banana");
		 * 
		 * names.add("kiwi");
		 * 
		 * names.add("apple");
		 */
		Set<String> names = new HashSet<>();

		names.add("cherry");
		names.add("apple");
		names.add("banana");
		names.add("kiwi");
		names.add("apple");

		System.out.println("hashset are :----------->" + names);
	}
}
