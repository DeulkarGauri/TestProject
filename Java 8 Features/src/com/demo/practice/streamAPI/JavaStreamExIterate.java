package com.demo.practice.streamAPI;

import java.util.stream.Stream;

public class JavaStreamExIterate {

	public static void main(String[] args) {

		System.out.println("Iterate stream in stream ::");

		Stream.iterate(1, element -> element + 1).filter(element -> element % 5 == 0).limit(5)
				.forEach(System.out::println);

	}
}