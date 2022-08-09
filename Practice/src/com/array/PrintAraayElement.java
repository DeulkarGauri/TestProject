package com.array;
//printing an prime number from an array 
public class PrintAraayElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr [] = new int [] {1,2,3,4,5,6,7,8,9, 11};
		int a =0;
		
		System.out.println("array elemnts Are :");
		for(int j =0; j<arr.length; j++) {
			
		for(int i=2; i<=(j-1);i++) {
			a= j%i;
			
			if(a==0) {
			System.out.print("\n "+j+" is not Prime number");
			break;
			}
		}
		if(a!=0) {
			System.out.println("\n "+j+" is  Prime number");
		}
		}
	}

}
