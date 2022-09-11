package com.string.program;

public class CountVowelConsonant {

	// public static void main(String[] args) {
	//
	// System.out.println(stringContainsVowels("Hello")); // true
	// System.out.println(stringContainsVowels("TV")); // false
	//
	// }
	//
	// public static boolean stringContainsVowels(String input) {
	//
	// return input.toLowerCase().matches(".*[aeiou].*");
	//
	// }

	public static void main(String[] args) {
		System.out.println();
		String s1 = "gauri deulkar";
		int countv = 0;
		int countc = 0;
		for (int i = 0; i < s1.length(); i++) {
			if (s1.charAt(i) == 'a' || s1.charAt(i) == 'e' || s1.charAt(i) == 'i' || s1.charAt(i) == 'o'
					|| s1.charAt(i) == 'u') {
				countv++;
			}
			// // or you can use ifs1.charAt(i) >= 'a' && s1.charAt(i)<='z') in else if
			// condition
			//
			else if (s1.charAt(i) != 'a' || s1.charAt(i) != 'e' || s1.charAt(i) != 'i' || s1.charAt(i) != 'o'
					|| s1.charAt(i) != 'u') {
				countc++;
			}
		}
		System.out.println("vowels present in string are = " + countv);
		System.out.println("consonent present in string are = " + countc);

	}
}
