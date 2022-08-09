package com.collection.college.info;

class Shape {
	protected void display() {
		System.out.println("inside shape class method ");
	}
}

public class Circle extends Shape {

	@Override
	protected void display() {
		// TODO Auto-generated method stub
		super.display();
	}
}
