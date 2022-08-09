package com.demo.practice;

import java.util.Scanner;

//@SuppressWarnings("serial")
public class InsufficientBalanceException extends RuntimeException {

	// public InsufficientBalanceException(String string) {
	// // TODO Auto-generated constructor stub
	// System.out.println("exceddong the limit");
	// }

	public static void main(String[] args) {
		System.out.println("exception using throw keywprd..");

		Scanner sc = new Scanner(System.in);
		System.out.println("enter available balance  in account");
		double avlBalance = sc.nextDouble();

		System.out.println("available balance ---->" + avlBalance);

		System.out.println("enter amount to withdraw...");
		double withamt = sc.nextDouble();
		double rem = avlBalance - withamt;
		if (withamt > avlBalance) {
			throw new InsufficientBalanceException();

		} else if (withamt < avlBalance) {
			System.out.println("***collect your cash*** " + " \n\n remaining balance : " + rem);
		}
	}
}
