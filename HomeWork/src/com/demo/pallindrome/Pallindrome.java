package com.demo.pallindrome;
// homework : date 09/04/2022  Program to check a given string is pallindrome or not

import java.util.Scanner;

public class Pallindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 String a , b  = "";     
   Scanner Sc = new Scanner(System.in);
   System.out.print("Enter the number or string :");
   a = Sc.nextLine();
   int n = a.length();
   for(int i = n - 1; i >= 0; i--)
   {
       b = b + a.charAt(i);
   }
   if(a.equalsIgnoreCase(b))
   {
	   
       System.out.println("The string is palindrome.");
   }
   else
   {
       System.out.println("The string is not palindrome.");
   }
		
      
   }
		
	}


