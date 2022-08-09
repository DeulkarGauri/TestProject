package com.array;

import java.util.Arrays;

// program to find largest number from an array

public class Max {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    
int [] a =new int [] {12, 23, 34, 45, 56};
System.out.println("My given array is = "+Arrays.toString(a));

   int max = a[0];

   for(int i =0; i<a.length; i++) {
	
	if(a[i] > max) 
		max =  a[i];
   }
System.out.println(" largest  numb is = "+max);

	}

}
