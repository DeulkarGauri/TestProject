package com.array;

import java.util.Scanner;

public class CheckprimeArrayNo {

	public static void main(String[] args) {

		System.out.println("main method ....");

		int[] array = new int[5];
		Scanner in = new Scanner(System.in);

		System.out.println("Enter the elements of the array: ");
		for (int i = 0; i < 5; i++)
			array[i] = in.nextInt();
		System.out.println(" *** prime numbers ****");
		for (int j = 0; j < array.length; j++) {
			boolean isPrime = true;

			for (int k = 2; k < array[j]; k++) {
				if (array[j] % k == 0) {
					isPrime = false;
					break;
				}
			}

			if (isPrime)

				System.out.println(array[j] + " are the prime number  ");
		}

	}
}
