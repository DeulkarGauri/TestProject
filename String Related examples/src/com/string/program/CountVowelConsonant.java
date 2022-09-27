package com.string.program;

import java.util.HashSet;
import java.util.Set;

public class CountVowelConsonant {

	public static void main(String[] args) {
		System.out.println();
		String str = "gkear";
		int count = 0;

		Set<Character> set = new HashSet<Character>();
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (isVowel(c)) {
				count++;
				set.add(c);
			}

		}
		System.out.println(" total vowels are :-  " + count);
		System.out.println("Vowels are:    ");
		for (Character c : set) {
			System.out.print(" " + c);
		}

	}

	public static boolean isVowel(char character) {

		if (character == 'a' || character == 'A' || character == 'e' || character == 'E' || character == 'i'
				|| character == 'I' || character == 'o' || character == 'O' || character == 'u' || character == 'U') {
			return true;
		} else {
			return false;
		}
	}

	// int countv = 0;
	// int countc = 0;
	// for (int i = 0; i < s1.length(); i++) {
	// if (s1.charAt(i) == 'a' || s1.charAt(i) == 'e' || s1.charAt(i) == 'i' ||
	// s1.charAt(i) == 'o'
	// || s1.charAt(i) == 'u') {
	// countv++;
	// System.out.println(s1);
	// }
	// // // or you can use ifs1.charAt(i) >= 'a' && s1.charAt(i)<='z') in else if
	// // condition
	// //
	// else if (s1.charAt(i) != 'a' || s1.charAt(i) != 'e' || s1.charAt(i) != 'i' ||
	// s1.charAt(i) != 'o'
	// || s1.charAt(i) != 'u') {
	// countc++;
	// }
	// }
	// System.out.println("vowels present in string are = " + countv);
	// System.out.println("consonent present in string are = " + countc);

}
