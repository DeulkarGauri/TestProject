package com.Practice;

class Parentclass {

	public void show() {
		System.out.println("inside parent class");
	}
}

public class ChildClass extends Parentclass {

	public static void main(String[] args) {
		System.out.println("hello...............");

		ChildClass c1 = new ChildClass();

		Parentclass p1 = new Parentclass();
		p1.show();

	}

	public void show() {
		// TODO Auto-generated method stub

		System.out.println("inside chilld class");

	}
}
