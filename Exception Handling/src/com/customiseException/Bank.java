package com.customiseException;

import java.util.Scanner;
import java.util.Vector;

public class Bank {
    
	public static void main(String[] args) {
		
		System.out.println("main method starts here : ");
	System.out.println("Enter a withdraw amount ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = 100000;
		int c = 100;
		
		System.out.println("withdraw amount enter by user = "+ a);
		
	if (a < c) {
		throw new LowBalanceException("\n"+" Your amount is too Low ... ");
	}
	else if( a  > b) {
		throw new HighBalanceException(" Your amount is too High ...  ");
	}
	else {
		System.out.println("*****Collect your cash  ... ****");
	}
	}
	
}
class LowBalanceException  extends RuntimeException{
	public LowBalanceException(String s) {
		super(s);
	}
}
class HighBalanceException extends RuntimeException{

	public HighBalanceException(String s) {
		super(s);
		
	}
	
}


