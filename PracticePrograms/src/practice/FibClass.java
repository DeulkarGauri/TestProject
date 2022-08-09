package practice;

public class FibClass {

	static int MethodOne(int i) {

		return MethodTwo(i *= 11);
	}

	static int MethodTwo(int i) {

		return MethodThree(i /= 11);
	}

	static int MethodThree(int i) {

		return MethodFour(i -= 11);
	}

	static int MethodFour(int i) {

		return i += 11;
	}

	public static void main(String[] args) {

		System.out.println("pallindrome Class...........");
		System.out.println(MethodOne(11));
	}
}
