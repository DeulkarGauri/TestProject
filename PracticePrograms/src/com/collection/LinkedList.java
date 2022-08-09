package com.collection;

public class LinkedList {

	public static void main(String[] args) {
		System.out.println("Linked list");

		java.util.LinkedList<String> names = new java.util.LinkedList<>();

		/****
		 * Linked list **
		 * 
		 * Elements are doubly linked to one another.
		 * 
		 * Performance is slower than the Array list. Good choice for insertion and
		 * deletion.
		 * 
		 * In Java 5.0 it supports common queue methods peek( ), Pool ( ), Offer ( )
		 * etc.
		 */
		names.add("cherry");
		names.add("apple");
		names.add("banana");
		names.add("kiwi");
		names.add("apple");

		System.out.println("Linked list " + names);
	}
}
