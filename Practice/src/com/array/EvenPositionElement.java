package com.array;

import java.util.Arrays;

public class EvenPositionElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a [] = new int [] {1, 2, 3, 4, 5 , 4, 6};
		
			System.out.println("original array = "+ Arrays.toString(a));
			for(int i =0; i<a.length; i++){
				if(i %2!=0) {
					System.out.println("even elemnts are "+i);
				}
			}
	}

}
