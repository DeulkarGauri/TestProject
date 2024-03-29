package com.demo.practice.streamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class StreamAPI {
	/*
	 * stream is an sequence of element element are of any type which supports
	 * sequential and parallel operation like
	 * 
	 * aggrigate operations are :- sum,count,filter.avg,min,max,groupBy,distinct
	 *
	 * stream api is used in collection it has so method lambda exression also used
	 * in stream api. .
	 * 
	 * Stream pipeline:-
	 * 
	 * we can create stream pipeline by combining multiple stream operation together
	 * 
	 */ public static void main(String[] args) {
		System.out.println("Stream API practice program......");

		List<Integer> myList = new ArrayList<>();

		for (int i = 0; i < 100; i++) {
			myList.add(i);
		}

		int count = (int) myList.stream().filter(Akshay -> Akshay > 95).filter(x -> x % 2 == 0).count();

		System.out.println(" My final answer count is ......... " + count);

		// List<Integer> productPriceList2 =
		// myList.stream().collect(Collectors.toList());
		//
		// System.out.print(" \n my list is -------------> " + "\n" +
		// productPriceList2);
		Optional<Integer> s = myList.stream().findFirst();
		System.out.println(s);
	}
}
