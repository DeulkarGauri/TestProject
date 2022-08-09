package com.collection.college.info;

class Base {
	public Base() {
		System.out.println("Base");
	}
}

class Derived extends Base {
	public Derived() {
		System.out.println("Derived");
	}
}

class DeriDerived extends Derived {
	public DeriDerived() {
		System.out.println("DeriDerived"); // because it extend above so all statement will print
	}
}

public class Test {
	public static void main(String[] args) {
		Derived b = new DeriDerived();
	}
}
