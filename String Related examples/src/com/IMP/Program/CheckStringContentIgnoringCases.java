package com.IMP.Program;

public class CheckStringContentIgnoringCases {

	public static void main(String[] args) {
		System.out.println("main method ....");
		String s1 = "GAURI";
		String s2 = "gauri";

		System.out.println("s1 equal with s2 :----->" + s1.equals(s2));
		System.out.println("s1 equalsignorewithcase s2 :------>" + s1.equalsIgnoreCase(s2));
	}
}
