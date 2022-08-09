package com.string;

import java.util.Arrays;

public class AnagramorNot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String S1 = "aradhya";
String S2 = "hradaya";

char[] a = S1.toCharArray();
char[] b = S2.toCharArray();

 Arrays.sort(a);
Arrays.sort(b);

	
boolean Result =	Arrays.equals(a, b);

if(Result == true) {
System.out.println("Given String Are anagram:");
}else {
	System.out.println("Given String Are not anagram");
}
	
	
	
	
	}

}
