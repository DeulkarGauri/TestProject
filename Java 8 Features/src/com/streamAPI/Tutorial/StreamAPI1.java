package com.streamAPI.Tutorial;

import java.util.ArrayList;
import java.util.List;

public class StreamAPI1 {

	public static void main(String[] args) {
		System.out.println("Stream api tutorial 1");

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
		// it is new feature come in java 8 i.e stream API

		mylist.forEach(a -> System.out.print(a + " , "));

	}
}
