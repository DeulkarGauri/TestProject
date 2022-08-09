package com.string.program;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String s1 = "brag";
		String s2 = "barg";
		
		char[] a = s1.toCharArray();
		char[] b = s2.toCharArray();

		 Arrays.sort(a);
		Arrays.sort(b);
		boolean Result = Arrays.equals(a, b);
		if(Result == true) {
			System.out.println("both string are anagram");
		}else {
			System.out.println("both string are not anagram");
		}

			
	}
}
