package com.collection.college.info;

import java.util.Scanner;

public class NumberPallindromeornot {

	public static void main(String[] args) {
		System.out.println("check whether number is pallindrome  or not ");
		Scanner sc = new Scanner(System.in);
		System.out.println("enter number");
		int num1 = sc.nextInt(), num2 = 0, remainder;

		int originalNum = num1;
		while (originalNum != 0) {
			remainder = originalNum % 10; // 121%10 == 12.1
			num2 = num2 * 10 + remainder; // 0 * 10 + 12.1; = 12.1

			originalNum = originalNum / 10; // 121 /10 = 12.1

		}
		if (num1 == num2) { // 12.1 = = 12.1
			System.out.println("is pallindrome");
		} else {
			System.out.println("not pallindrome");
		}
	}
}
