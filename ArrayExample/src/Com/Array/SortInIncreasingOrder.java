package Com.Array;

import java.util.Scanner;

public class SortInIncreasingOrder {

	public static void main(String[] args) {
		System.out.println("Sorting array ....");

		Scanner sc = new Scanner(System.in);

		int size;
		System.out.println("enter size of array..");
		size = sc.nextInt();

		System.out.println("enter data...");
		int data[] = new int[size];

		for (int i = 0; i < data.length; i++) {
			data[i] = sc.nextInt();
			System.out.print(data[i] + ", ");
		}

		// int temp;
		// for (int j = 0; j < data.length; j++) {
		// for (int k = 0; k < data.length - 1; k++) {
		// if (data[k] > data[k + 1]) {
		// temp = data[k];
		// data[k] = data[k + 1];
		// data[k + 1] = temp;
		// // System.out.println(temp);
		// }
		// for (int m = 0; m < data.length; m++) {
		// System.out.println("data[" + m + "]=" + data[m]);
		// }
		//
		// }
		//
		// }
	}
}
