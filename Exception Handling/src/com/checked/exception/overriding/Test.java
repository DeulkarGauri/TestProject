package com.checked.exception.overriding;

import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;

class myclass{
	
	 void m1() throws IOException
	 {
		System.out.println(" Inside m1 method of parent class Starts here ");
		
		System.out.println("m1 method of parent class ends here : ");
	}
}
public class Test extends myclass{
String s ;

	 void m1() throws IOException  {
		System.out.println(" Inside m1 method of child class ");
		System.out.println(" my string length will be = "+ s.length());
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("main method starts here : ");
myclass T1 = new myclass();

Test a1 = new Test();


System.out.println("main method ends here ");
	}

}
