package forLoop;

public class BackwordCounting {

	public static void Count() {
		for (int i = 100; i >= 0; i = i - 5) {
			System.out.print(i + "  ");
		}

	}

	public static void main(String[] args) {
		System.out.println("Main method Starts....");
		BackwordCounting.Count();
	}
}
