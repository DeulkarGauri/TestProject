package com.polymorphism.overloading;

public class Students {
	
	static  void m1() {System.out.println("inside  method");}
	static void m1(byte a) {System.out.println("inside  byte method");}
	static void m1(short a) {System.out.println("inside short  method");}
	static int m1(int a) {
		System.out.println("inside int method "+"\n"+"value of a = "+a );
		return a;
		}
	static void m1(long a) {System.out.println("inside long method");}
	static void m1(Integer a) {System.out.println("inside  method");}
	static void m1(Long a) {System.out.println("inside Long method");}
	static void m1(Object a) {System.out.println("inside Object  method");}
	static String m1(String a) {System.out.println("inside String method"+"\n"+""+a);
	return a;}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//System.out.println("main method");
		Students s1 = new Students();
	Students.m1(s1);	
Students.m1(10);
Students.m1("ABC");

	}

}
