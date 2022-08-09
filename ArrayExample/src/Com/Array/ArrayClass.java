package Com.Array;

//homework....
public class ArrayClass {
	// program for to find no divisible by 4 , 7 , and 4 & 7...
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] MyArray1 = new int[100];
		int[] MyArray2 = new int[100];
		int[] MyArray3 = new int[100];

		int[] Array = new int[100];

		int MyArray1_count = 0;

		int MyArray2_count = 0;

		int MyArray3_count = 0;

		System.out.println("Array of 0 to 100 numbers are: ");

		for (int i = 0; i <= Array.length; i++) {

			System.out.print(i + " ");

		}
		System.out.println();
		// number divisible by 4 are:
		for (int i = 0; i < Array.length; i++) {

			if (i % 4 == 0) {
				MyArray1[MyArray1_count] = i;
				MyArray1_count++;
			}
			// number divisible by 7
			else if (i % 7 == 0) {
				MyArray2[MyArray2_count] = i;
				MyArray2_count++;
			}
			// number divisible by 4 & 7 are
			else if ((i % 4 == 0) && (i % 7 == 0)) {
				MyArray3[MyArray3_count] = i;
				MyArray3_count++;
			}
		}
		System.out.println();
		System.out.println("Number Divided by 4 and 7 are: ");
		for (int i = 0; i < MyArray3.length; i++) {
			if (MyArray3[i] != 0) {
				System.out.print(MyArray3[i] + "  ");
			}
		}
		System.out.println();
		System.out.println("\n" + "Number Divide by 4 are: ");
		for (int i = 0; i < MyArray1.length; i++) {
			if (MyArray1[i] != 0) {
				System.out.print(MyArray1[i] + "  ");
			}
		}
		System.out.println();
		System.out.print("\n " + "Number Divided by 7 are: ");
		for (int i = 0; i < MyArray2.length; i++) {
			if (MyArray2[i] != 0) {
				System.out.print(MyArray2[i] + "  ");
			}

		}

	}
}
