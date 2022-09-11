package com.method;

// sample program 
public class Test {
	static int x = 10;
	int y = 20;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test t1 = new Test();
		t1.x = 888;
		t1.y = 999;

		Test t2 = new Test();
		System.out.println("second output" + t2.x + "...." + t2.y);
	}

}
