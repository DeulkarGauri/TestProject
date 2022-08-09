package com.demo.inheritance;
// ineheritance sample program

class Bank{
	static	String BankName= "City Bank";
	
}

public class Employee extends Bank {

	static int salary = 80000;
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("given bank name is :"+BankName);
		System.out.println("Salary of employee is:"+salary);
	}

}








