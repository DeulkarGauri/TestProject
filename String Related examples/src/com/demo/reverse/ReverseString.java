package com.demo.reverse;
 //program to reverse  a given string 
import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		String a , b = " ";
		Scanner sc = new Scanner (System.in);
		System.out.println(" Enter a String");
		a = sc.nextLine();
		int n = a.length();
		for(int i = n-1; i>=0; i--) {
			
			b = b+a.charAt(i);
		}
System.out.println(" A reverse string is : -s"+b);

	}
	

}
