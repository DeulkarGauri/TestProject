package com.demo.NullPointerException;
/*
 *  A null pointer exception occur when you try to print a length of string 
 *  but don't initialize a string , so it gives an null point exception 
 *  so by getting such exception your program can't execute other statement 
 *  to execute other statement after getting  an exception we used try.. catch block.
 *  in try block we write risky code 
 *  and in catch block we print an such exception
 */
public class NullPointerException {
static String  s ;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(" Main Method Starts Here ");

 try {
	System.out.println("Your String Can be "+ s.length());
} catch (Exception e) {
	// TODO: handle exception
	System.out.println("Hey... Please Check Your String ");
}
finally {
	System.out.println(" Close the resources ");
}
 
String s = "abc";
System.out.println("Now your string can be : "+ s + " \n"+" length is = "+   s.length());
System.out.println("  Main Method End Here : ");
	}

}
