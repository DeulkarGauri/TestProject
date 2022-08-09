package practice;

public class fibonacciSeries {

	public static void main(String[] args) {
		System.out.println("hello...........");

		int a = 0, b = 1, c, d = 10;

		System.out.print(a + " " + b);

		for (int i = 2; i < d; ++i) {
			c = a + b;
			System.out.print(" " + c);
			a = b;
			b = c;

		}

	}
}
