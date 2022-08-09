package com.demo.practice;

public class TryBlock {
	public static void main(String[] args) {
		System.out.println("Try block example.......");

		try {
			int a = 10, b = 0;
			int c = a / b;
		}

		catch (Exception e) {
			// TODO: handle exception
			System.out.println("Exception occured.... \n please check The value which you enter");
		}
		System.out.println("programs ends here.....");
	}
}
