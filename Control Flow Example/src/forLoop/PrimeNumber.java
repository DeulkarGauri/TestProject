package forLoop;

import java.util.Scanner;

public class PrimeNumber {

	public static boolean process(int number) {

		boolean returnValue = true;
		for (int i = 2; i <= number / 2; i++) {
			if (number % i == 0) { // Check if divisible by any other number
				returnValue = false;
				break;
			} else {
				continue;
			}
		}
		return returnValue;

	}

	public static void main(String[] args) {
		System.out.println("main method..");

		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		boolean isPrime = new PrimeNumber().process(number);
		if (isPrime) {
			System.out.println("Number " + number + " is a Prime number");
		} else {
			System.out.println("Number " + number + " is NOT a Prime number");
		}
	}
}
