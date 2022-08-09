package com.array;
// program to reverse an array2
public class ReverseArray {
	public static void main(String[] args) {
		System.out.println("main method starts here: ");
		int [] arr = {1, 2, 3, 4, 5};
		
		System.out.print("my original array = ");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		System.out.print("my new reverse array = ");
     
		for(int i = arr.length-1; i>=0; i--) {
			System.out.print(arr[i] +" ");
			
		}
		
		System.out.println(" \n end of program ");
	}

}
