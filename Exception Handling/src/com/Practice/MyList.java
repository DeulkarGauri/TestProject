package com.Practice;

import java.util.ArrayList;
import java.util.List;

public class MyList {

	public static void main(String[] args) {
		System.out.println("hello...");
		List<Object> mylist = new ArrayList<Object>();

		mylist.add(10);
		mylist.add(20);
		mylist.add(50);
		mylist.add(30);
		mylist.add(70);
		mylist.add("abc");
		mylist.add(65);
		mylist.add("pqr");

		// System.out.println(mylist);00

		mylist.forEach(a -> System.out.println(a));
	}
}
