package com.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class PrintDupplicatesNumFromList {

	public static void main(String[] args) {
		System.out.println("*************************************");

		List<Integer> list = new ArrayList<Integer>();

		for (int i = 0; i < 10; i++) {

			list.add(i);

			if (i == 5)
				list.add(i - 1);
			if (i == 7)
				list.add(i - 1);
			if (i == 2)
				list.add(i - 1);
			if (i == 9)
				list.add(i - 1);
			if (i == 5)
				list.add(i - 1);
			if (i == 7)
				list.add(i - 1);
			if (i == 2)
				list.add(i - 1);
			if (i == 9)
				list.add(i - 1);

		}
		System.out.println(list);

		list.stream().filter(e -> Collections.frequency(list, e) > 1).collect(Collectors.toSet())
				.forEach(System.out::println);
	}
}
