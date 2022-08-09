package com.string;
// to check given string is empty or not 
// by using isempty() method we can check string if string is empty then it will print true
// otherwise  if string is not empty then it print false

public class IsEmpty {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("main method starts here");
		String S1 = "";            //empty string 
		boolean s2 = S1.isEmpty();
		System.out.println("given string is "+s2);
		
		String A1 =" gauri";         // non empty string 
		boolean A2 = A1.isEmpty();
		System.out.println("given string is "+A2);
	}

}
