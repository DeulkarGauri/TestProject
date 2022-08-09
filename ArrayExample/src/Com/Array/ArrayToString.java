package Com.Array;

import java.util.Arrays;
// converting array to string by using to string() method

public class ArrayToString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] s1 = { "India", "is", "My", "country" };
		for (int i = 0; i < s1.length; i++) {
			System.out.print(s1[i] + "  ");
		}
		System.out.println();
		System.out.println("coverting array to string : " + Arrays.toString(s1));

	}

}
