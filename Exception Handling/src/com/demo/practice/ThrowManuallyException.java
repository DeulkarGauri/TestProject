package com.demo.practice;

public class ThrowManuallyException {
	public static void main(String[] args) {
		System.out.println("try ...block.......finally");

		try {
			NumberFormatException num = new NumberFormatException();
			throw num;

		} catch (NumberFormatException e) {
			// TODO: handle exception
			System.out.println("explicitly thrown NumberFormatException object will be caught here");

		}
	}
}
