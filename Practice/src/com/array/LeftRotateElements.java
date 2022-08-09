package com.array;

import java.util.Arrays;
//program to rotate an array toward left

public class LeftRotateElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr [] = new int[] {1, 2, 3, 4, 5};
	//n determines no of times should be rotated
		int n =1;
	System.out.println(" Original Array will be : ");
	for(int i=0; i<arr.length; i++) {
		System.out.print(arr[i]  + " ");
	}
		// rotate the given array by n times towards left
	for(int i=0; i<n; i++) {
		int j, first ;
		 first = arr[0];
	 	
		for(  j =0; j<arr.length-1; j++) {
		// shift element of array by one 
		 arr[j] = arr[j+1];
		 }
		 
		arr[j]= first;
		}
		System.out.println();
		
		System.out.println("array after left rotation will be :");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] +" ");
			
	}

	}

}
