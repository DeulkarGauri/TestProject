package com.collection.college.info;

class Base123 {
	public Base123() {
		System.out.print("Base ");
	}

	public Base123(String s) {
		System.out.print("Base: " + s);
	}
}

class Derived12 extends Base123 {
	public Derived12(String s) {
		// super(); // Stmt-1
		super(s); // Stmt-2
		System.out.print("Derived ");
	}
}

public class Test2 {
	public static void main(String[] args) {
		Derived12 base = new Derived12("Hello ");
	}
}
