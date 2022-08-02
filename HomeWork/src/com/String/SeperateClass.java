package com.String;
//homework : date:07/04/2022 

//program to differ a alphabets , numbers and special character from given string

public class SeperateClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = " Gauri@123#%3245*-_Deulkar";
		System.out.println("given string is :------>" + s1);

		String regex1 = "[^\\d]";
		String regex2 = "[^a-zA-Z]";
		String regex3 = "[a-z A-Z 0-9]";

		String s2 = s1.replaceAll(regex1, "");
		String s3 = s1.replaceAll(regex2, "");
		String s4 = s1.replaceAll(regex3, "");
		System.out.println("A Digits in given string is:  " + "\n" + s2);

		System.out.println("Alphabets in given string is:  " + "\n" + s3);

		System.out.println("A Special character in given string is " + "\n" + s4);

	}

}
