package com.collection;

public class Vector {
	public static void main(String[] args) {

		/*
		 * It is the same as Array List.
		 * 
		 * Vector methods are synchronized.
		 * 
		 * Thread safety
		 * 
		 * .Vector also maintains the insertion order and accepts the duplicates.
		 * 
		 * It also implements Random Access.
		 * 
		 * Thread safety usually causes a performance hit.
		 * 
		 */

		System.out.println("vector example........");

		java.util.Vector<String> names = new java.util.Vector<>();
		names.add("cherry");
		names.add("apple");
		names.add("banana");
		names.add("kiwi");
		names.add("apple");

		System.out.println("vector list " + names);
	}

}
