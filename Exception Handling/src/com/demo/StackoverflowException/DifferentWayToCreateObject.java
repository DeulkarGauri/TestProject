package com.demo.StackoverflowException;

import java.lang.reflect.Constructor;

public class DifferentWayToCreateObject implements Cloneable {
	String name = "gauri";

	public static void main(String[] args) throws Exception {
		System.out.println("here we start ...");
		// using new keyword
		DifferentWayToCreateObject firstobj = new DifferentWayToCreateObject();
		System.out.println("using new keyword :- " + firstobj.name);

		// using newinstance method of Class class
		Class c1 = Class.forName("com.practice.DifferentWayToCreateObject");
		DifferentWayToCreateObject secondobj = (DifferentWayToCreateObject) c1.newInstance();
		System.out.println("using newInstance method:- " + secondobj.name);

		// using newInstancemethod of constructor class

		Constructor<DifferentWayToCreateObject> con = DifferentWayToCreateObject.class.getDeclaredConstructor();
		DifferentWayToCreateObject thirdobj = con.newInstance();
		System.out.println("using constructor class new instance method :- " + thirdobj.name);

		// using clone method

		DifferentWayToCreateObject d1 = new DifferentWayToCreateObject();
		DifferentWayToCreateObject FourthObj = (DifferentWayToCreateObject) d1.clone();

		System.out.println("using clone method :- " + FourthObj.name);
	}
}
