package com.Parse;

public class WrapperClass1 {
	public static void main(String[] args) {
		System.out.println("wrapper class parse method");
		String s = "123";
		String s1 = "223.33";
		int i = Integer.parseInt(s);// Converts string into integer
		double d = Double.parseDouble(s1);// converst string to double
		System.out.println("converting string to interger");

		System.out.println(s + s1);// 123223.33h
		System.out.println("converting string to double");
		System.out.println(i + d);// 123+223.33
	}
}
