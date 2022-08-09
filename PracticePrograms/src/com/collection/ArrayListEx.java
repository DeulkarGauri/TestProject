package com.collection;

import java.util.ArrayList;

public class ArrayListEx {
	public static void main(String[] args) {
		System.out.println("Arrray list example....");

		/*
		 *** ARRAY LIST***
		 * 
		 * Fast iteration and fast Random Access. It is an ordered collection (by index)
		 * and not sorted. It implements the Random Access Interface. underlyong data
		 * structure is growable array
		 * 
		 * Array List maintains the insertion order and it accepts the duplicates. But
		 * it’s not sorted
		 */
		ArrayList<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		System.out.println("my list :-----> " + list);
	}
}
