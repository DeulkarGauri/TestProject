package com.method;

class B{

	int i = 10;
	
	}

public class A extends B {
	
	 static int i = 30;
	
	void show(int i) {
		System.out.println(this.i);
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A MyObj = new A ();
		MyObj.show(20);
	}

}
