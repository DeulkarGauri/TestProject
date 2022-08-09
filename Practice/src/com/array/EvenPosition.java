package com.array;
// program to print an element on even index are 
public class EvenPosition {

	public static void main(String[] args) {
		System.out.println("main method starts here ");
		
		int arr[] = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9};
		
		System.out.print("my original array = ");
		for(int i=0; i<arr.length;i++) {
			System.out.print(arr[i]+ " ");
		}
	
		System.out.println("\nelement on even index  are ");
		for(int i=0; i<arr.length;i++) {
			if(i%2==0) {
				System.out.print(arr[i]+ " ");
			}
			
		}
		
		
	}
}
