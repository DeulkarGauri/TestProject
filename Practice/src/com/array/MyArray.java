package com.array;
//1 interview questions to check the no from given array is even or odd 
public class MyArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a[] = {1 , 2 , 3, 4 , 5, 6, 7, 8, 9, 10};
		System.out.println(a);
		
		for (int i =0; i<a.length; i++) {
			
			if(a[i] %2 == 0) {
				
				System.out.println("even number is  : "+a[i]);
				}
			else {
				
				System.out.println("odd number is  : "+a[i]);
				
			}
		}

	}
}
