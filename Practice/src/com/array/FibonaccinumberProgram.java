package com.array;

public class FibonaccinumberProgram {

	public static void main(String[] args) {

		System.out.println("fibonacci series......");

		int a = 0, b = 1, c;
		int count = 10;

		System.out.print(a + "  " + b);

		for (int i = 2; i < count; i++) {

			c = a + b;

			System.out.print("  " + c + "  ");
			a = b;
			b = c;
			
			
			
		}

	}
}
