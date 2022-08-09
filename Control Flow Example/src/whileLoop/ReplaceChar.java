package whileLoop;

import java.util.Scanner;

public class ReplaceChar {

	public static String process(String s) {
		String replace = " ";
		int i = 0;
		while ((s.length()) > i) {

			if (s.charAt(i) == ('a') || s.charAt(i) == ('e') || s.charAt(i) == ('i') || s.charAt(i) == ('o')
					|| s.charAt(i) == ('u')) {

				replace += 'x';
			} else {
				replace += s.charAt(i);
			}
			i++;
		}
		return replace;
	}

	public static void main(String[] args) {
		System.out.println("main method starts here....");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Word...");
		String ch = sc.next();
		// String s1 = "java is fun";

		String replace = new ReplaceChar().process(ch);
		System.out.println(replace);
	}
}
