package Com.Array;

public class SortArray {
	// program for sorting an array....
	public static void main(String[] args) {
		System.out.println("Sort an array........");

		int[] array = new int[] { 10, 30, 50, 20, 60, 90, 12, 40, 58 };

		// Arrays.sort(array);
		System.out.println("my sorted array is...........");
		// for (int i = 0; i < array.length; i++) {
		// System.out.print(array[i] + " , ");
		// }

		for (int i = 0; i < array.length; i++) {

			for (int j = i + 1; j < array.length; j++) {

				int temp = 0;

				if (array[i] > array[j]) {
					temp = array[i];
					array[i] = array[j];
					array[j] = temp;
				}
			}
			System.out.print(array[i] + "  ");
		}
	}
}
