package Com.Array;

public class ArrayExample1 {
	// program for to find number on even position
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("Main Method Started Here: ");

		// 0 1 2 3 4 5 6 7 8 9
		int a[] = new int[] { 12, 13, 16, 20, 67, 56, 43, 25, 20, 90 }; // array initialization

		int even = 0;

		for (int i = 0; i < a.length; ++i) {

			if (i % 2 == 0) {

				even = a[i];

			} else {
				System.out.println("number is on odd are " + a[i]);
			}

			System.out.println("number on even index are: " + even);

		}

	}

}
