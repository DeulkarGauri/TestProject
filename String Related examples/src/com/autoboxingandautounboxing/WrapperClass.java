package com.autoboxingandautounboxing;

public class WrapperClass {

	public static void main(String[] args) {
		// Autoboxing
		int a = 100;
		Integer i = a;
		Output: System.out.println("Autoboxing------->" + i.toString()); // 100
		// AutoUnboxing 300
		Integer j = 300;
		int k = j;
		System.out.println("Autounboxing------->" + k);
	}
}
