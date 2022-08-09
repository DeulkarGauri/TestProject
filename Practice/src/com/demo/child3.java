package com.demo;

class parent3{
	static {
		System.out.println("inside parent static block");
	}
	{
		System.out.println("inside parent instance block");	
	}
	parent3 (){
		System.out.println("inside parent constructor");
	}
	public static void main(String[] args) {
		System.out.println("parent class main method");
	}
}

public class child3 {
	static {
		System.out.println("inside child static block");
	}
	{
		System.out.println("inside child static block");	
	}
	child3 (){
		System.out.println("inside child constructor");
	}
public static void main(String[] args) {
	System.out.println("parent class main method");
	new parent3 ();
	
}
}
