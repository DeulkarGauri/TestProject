package com.demo.StackoverflowException;

/*
 * Stackoverflowerror:- 
 * Stack over flow error occur when we try to call a methd and
 *  from this method we again try to call again that method then
 *  Stackoverflowerror occur 
 *  Repeatedly
 *  you can not overcome from this error
 *  Raised automatically by the 
 * JVM when ever we are performing recursive method invocation.
 */
public class StackoverflowError {

	public static void m1()
	{
		System.out.println("m1 method ");
try {
	m1();
	
} catch (Error e) {
	// TODO: handle exception
	System.out.println("you can't call method Repeatedly ");
}
	}

	public static void main(String[] args) {
		System.out.println("Main method Starts here : ");
		
		m1();
		
	}
}
