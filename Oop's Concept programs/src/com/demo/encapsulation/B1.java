package com.demo.encapsulation;
 
public class B1{
	private static  int a  ;
	
	public  static void seta(int a1) {
		a = a1;
		
	}
	public static int geta() {
		return a;
		
	}
	public static void main(String[] args) {
		System.out.println("main method ");
		seta(101);
		System.out.println(geta());
	}
}