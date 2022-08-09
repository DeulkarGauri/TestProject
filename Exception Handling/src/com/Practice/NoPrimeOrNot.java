package com.Practice;

import java.util.Scanner;

public class NoPrimeOrNot {
	// incomplete code..........
	public static void main(String[] args) {
		System.out.println("For Checking whether number is prime or not");
		int num;
		int temp = 0;
		boolean isPrime = true;
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		sc.close();
		for (int i = 2; i <= num / 2; i++) {
			temp = num % i;
			if (temp == 0) {
				isPrime = false;
				break;
			}
		}
		System.out.println(temp);
	}
}
