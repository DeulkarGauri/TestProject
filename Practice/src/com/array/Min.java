package com.array;

import java.util.Arrays;

public class Min {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a [] = {10, 20, 40, 60, 50, 5};
		System.out.println("given array is = "+Arrays.toString(a));
		
	int min = a[0];
	
	for(int i =0; i<a.length;i++) {
		if(a[i]<min )
			min= a[i];
	}
	System.out.println ("smallest number is = "+min); 
	
	}

}
