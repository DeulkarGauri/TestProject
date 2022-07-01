package com.demo.blocks;

public class ChildClass extends ParentClass {
	
	int a;
	
	public ChildClass(int a) {
		super(name);
		this.a = a;
		System.out.println(a);
		System.out.println("Inside Constructor of child class");
	}

	static {
		System.out.println("** We are in static block of child class **");
	}
	
	{
		System.out.println("We Are in instance block child class");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Inside the main method of child class");
ChildClass c1 = new ChildClass(10);

	}

}
