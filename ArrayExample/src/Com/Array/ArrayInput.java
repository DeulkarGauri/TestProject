package Com.Array;

import java.util.Scanner;

//Java Program to Get Array Input From End-user AND PRINT AN ARRAYS
public class ArrayInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(" main method started ");
		// Create a scanner class
		Scanner Sc = new Scanner(System.in);
		// declaring array
		int[] Arr = new int[10];

		System.out.println(" " + " enter " + Arr.length + " integer values");

		// read input from user
		for (int i = 0; i < Arr.length; i++) {

			Arr[i] = Sc.nextInt();
		}
		// printing an arrays element
		System.out.println("Arrays element are : ");
		for (int i = 0; i < Arr.length; i++) {
			System.out.print(Arr[i] + " ");
		}

	}

}
