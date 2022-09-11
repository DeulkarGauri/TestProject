package com.demo.practice.streamAPI;

import java.util.Hashtable;
import java.util.Map;
import java.util.stream.Stream;

public class JavaStreamExIterate {

	public static void main(String[] args) {

		System.out.println("Iterate stream in stream ::");
		Map<Integer, Integer> mp = new Hashtable<>();
		System.out.println("***************before *********\n size of map :- " + mp.size());
		mp.put(10, 20);
		mp.put(20, 20);
		mp.put(30, 20);
		mp.put(40, 20);
		mp.put(50, 20);
		mp.put(60, 20);
		mp.put(70, 20);
		mp.put(80, 20);
		mp.put(90, 20);
		mp.put(100, 20);
		mp.put(111, 20);
		mp.put(123, 20);
		mp.put(134, 20);
		mp.put(140, 20);
		mp.put(150, 20);
		mp.put(160, 20);

		mp.put(170, 20);
		mp.put(18, 20);

		// System.out.println("\n ***************after *********\n size of map :- " +
		// mp.size());
		// System.out.println("map element are ------------> " + mp);

		Stream.iterate(2, element -> element + 1).filter(element -> element % 5 == 0).limit(5)
				.forEach(System.out::println);

	}
}