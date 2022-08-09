package com.string;

public class SwapNumber {

	public static void main(String[] args) {
		System.out.println("Hello............");
		int a = 10;
		int b = 20;
		int c;

		System.out.println("original A is .......... " + a);
		System.out.println("Original b is ..........." + b);
		c = a + b;
		b = c - b;
		a = c - b;

		System.out.println("after swap  \nA is ..........." + a);
		System.out.println("B is :........." + b);
	}
}
