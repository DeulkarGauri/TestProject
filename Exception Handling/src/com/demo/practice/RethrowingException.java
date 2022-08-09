package com.demo.practice;

public class RethrowingException {
	public static void main(String[] args) {
		System.out.println("rethrowing an exception");

		try {
			String s = null;
			System.out.println(s.length());
		} catch (NullPointerException e) {

			// TODO: handle exception
			System.out.println("your string is null please initialize the string");
			throw e;
		}
		System.out.println("end of program.........");
	}
}
