package com.demo.blocks;

public class ParentClass {
  
	static String name;


	public ParentClass(String name) {
		super();
		this.name = name;
		System.out.println("Inside Constructor of parent class");
	}
	static {
		System.out.println("** We are in static block of parent class **");
	}
	
	{
		System.out.println("We Are in instance block1 parent class");
	}
	{
		System.out.println("We Are in instance block2 parent class");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
