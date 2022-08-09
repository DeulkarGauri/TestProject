package com.collection.college.info;

public class StringPallindromeOrNot {

	public static void main(String[] args) {
		System.out.println("main method Started ..");

		String s1 = "aba", s2 = "";

		int a = s1.length();

		for (int i = (a - 1); i >= 0; i--) {
			s2 = s2 + s1.charAt(i);

		}

		if (s1.equals(s2)) {
			System.out.println(s1 + " is pallindrome : ");

		} else {
			System.out.println(s1 + " not pallindrome");
		}
	}
}
