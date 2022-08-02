package com.StarPattern;

// program for printing star in diamond pattern
public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int number = 10;

		int m, n;

		// Outer loop 1
		// prints the first half diamond
		for (m = 1; m <= number; m++) {

			// Inner loop 1 print white spaces in between
			for (n = 1; n <= number - m; n++) {
				System.out.print(" ");
			}

			// Inner loop 2 prints star
			for (n = 1; n <= m * 2 - 1; n++) {
				System.out.print("*");
			}

			// Ending line after each row
			System.out.println();
		}

		// Outer loop 2
		// Prints the second half diamond
		for (m = number - 1; m > 0; m--) {

			// Inner loop 1 print white spaces in between
			for (n = 1; n <= number - m; n++) {
				System.out.print(" ");
			}

			// Inner loop 2 print star
			for (n = 1; n <= m * 2 - 1; n++) {
				System.out.print("*");
			}

			// Ending line after each row
			System.out.println();
		}

	}
}
