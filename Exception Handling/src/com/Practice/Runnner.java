package com.Practice;

interface i1 {
	void m1();

}

interface i2 {
	void m1();

}

public class Runnner implements i2, i1 {

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		System.out.println("this is i1 method");
	}

}
