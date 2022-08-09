package Com.Array;

import java.util.Arrays;

public class ArrayExample {
	// normal program for an array...
	public static void main(String[] args) {
		int[] arr = new int[] { 1, 2, 3, 4, 5 };
		System.out.println("The Element of an array is :");
		System.out.println(Arrays.toString(arr));
		for (int i = 0; i < arr.length; i++) {

			System.out.println(arr[i] * arr[i] + " ");

		}
	}
}
