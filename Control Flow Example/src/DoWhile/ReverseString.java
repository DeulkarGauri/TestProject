package DoWhile;

import java.util.Scanner;

public class ReverseString {

	public static String process(String str) {
		String reversedString = "";
		int i = str.length() - 1;

		do {
			reversedString += str.charAt(i);
			i--;
		} while (i >= 0);

		return reversedString;
	}

	public static void main(String[] args) {
		System.out.println("main method ....");

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Word...");
		String ch = sc.next();
		new ReverseString();
		String reverse = ReverseString.process(ch);
		System.out.println(reverse);
	}
}
