package com.streamAPI.Tutorial;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StreamApIexternal {

	public static void main(String[] args) {
		System.out.println("external ways to print values of list....");
		List<Object> mylist = new ArrayList<Object>();

		mylist.add(10);
		mylist.add(20);
		mylist.add(50);
		mylist.add(30);
		mylist.add(70);
		mylist.add("abc");
		mylist.add(65);
		mylist.add("pqr");
		System.out.println("***using for loop***");
		for (int i = 0; i < 8; i++) {
			System.out.print(mylist.get(i) + "__");
		}

		Iterator<Object> it = mylist.iterator();
		System.out.println("\n *** using iterator ***");
		while (it.hasNext()) {
			System.out.print(it.next() + "--");
		}

		System.out.println("\n *** using for each loop ***");
		for (Object i : mylist) {
			System.out.print(i + "...");
		}
	}
}
