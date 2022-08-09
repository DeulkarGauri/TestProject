package com.shallow.clonning;

public class MyClone implements Cloneable {
	int id;
	String Name;

	public MyClone(int id, String name) {
		super();
		this.id = id;
		Name = name;
	}

	public static void main(String[] args) throws CloneNotSupportedException {

		System.out.println("Main Method Starts Here ......");

		MyClone m1 = new MyClone(10, "Sakshi");
		MyClone m2 = (MyClone) m1.clone();
		System.out.println("BEFORE CHANGING ID :- " + m1.id);
		m2.id = 20;
		System.out.println("AFTER  CHANGING ID :-  " + m1.id);

	}
}
