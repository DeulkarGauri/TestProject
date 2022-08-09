package com.collection.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class ArrayListEx {

	public static void main(String[] args) {
		System.out.println("Welcome to arraylist....");

		List MyList = new ArrayList<String>();
		Stack<String> st = new Stack<>();
		MyList.add("SAKSHI");
		MyList.add("SHWETA");
		MyList.add("GAURI");
		MyList.add("SHWETAb");
		MyList.add("KOMAL");
		MyList.add(10);

		System.out.println(MyList);
		System.out.println(MyList.contains("SAKSHI"));

		// System.out.println(MyList.sort(c););\\]

		// Collections.sort(MyList);

		System.out.println(MyList);

		Collections.emptyList();
		System.out.println(MyList);

		System.out.println(MyList.remove(Integer.valueOf(10)));

		System.out.println(MyList);

		for (Object object : MyList) {
			System.out.println(object);
		}

	}
}
