package com.String;
// homework :date: 05/04/2022 

public class ReverseString {

	public static void main(String[] args) {
		
		String s1 =" India Is My Country ";
		System.out.println("Original String Is :"+"\n" + s1);
		
		String[] a = s1.split(" ");
		
		System.out.println("Reverse String Is :");
			 
		for(int i=a.length-1; i>=0; i-- ) {
		    System.out.print(a[i] +" ");
		}
	}
	
}
