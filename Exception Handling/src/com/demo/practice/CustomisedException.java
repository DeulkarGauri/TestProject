package com.demo.practice;
// interview question..... //Date 21/05//2022
/*
 * Question asked in interview are as :
 * how we can  pass local variable from main method to another method ?
 * what is checked Exception?
 * what is method overloading ?
 * can we change we changed return type of method overriding?
 * What is deep cloning ?
 * difference  between shallow cloning and deep cloning?
 * how the try catch and finally  block will be execute tell the flow of the try catch and
 *  finally block? 
 * what can store in stack area ? (answer:- local variables , method calling chain and
 *  ref of object)?
 *  
 * 
 * 
 * 
 */

import java.util.Scanner;

class InvalidCustomisedException extends RuntimeException{
	
	public InvalidCustomisedException(String s) {
		super(s);
	}
}

public class CustomisedException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("welcome to main method ");
Scanner sc = new Scanner(System.in);
    System.out.println("Enter Your Age :");
    int a = sc.nextInt();
    if(a<18) {
    	throw new InvalidCustomisedException("you are not valid");
    	
    }
    System.out.println("Welcome Here....... ");
	}

}
