package DoWhile;

import java.util.Scanner;

public class PallindromeChecker {

	public static boolean isPallindrome(String str) {

		boolean status = false;
		String pallindrome = "";
		int i = str.length() - 1;

		do {
			pallindrome += str.charAt(i);
			i--;
		} while (i >= 0);
		if (str.equals(pallindrome)) {
			status = true;
		}

		return status;
	}

	public static void main(String[] args) {

		System.out.println("main method...");

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a string...");

		String s = sc.next();

		boolean isPalnidrome = new PallindromeChecker().isPallindrome(s);
		if (isPalnidrome) {
			System.out.println("String " + s + " is a Palindrome");
		} else {
			System.out.println("String " + s + " is NOT a Palindrome");
		}
	}
}
