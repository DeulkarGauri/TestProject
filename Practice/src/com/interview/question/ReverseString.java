package com.interview.question;

public class ReverseString {

	public static void main(String[] args) {
		System.out.println("reverse string............");

		String my_string = "prajakta";

		System.out.println("string .......... " + my_string);

		char[] a = my_string.toCharArray();

		for (int i = a.length - 1; i >= 0; i--) {
			System.out.print(a[i] + ",");

		}
	}
}
