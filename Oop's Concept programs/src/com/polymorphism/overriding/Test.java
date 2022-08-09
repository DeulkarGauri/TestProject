package com.polymorphism.overriding;

class P  {
  void m1() {
	System.out.println("p class method ");
}
 class Q extends P {
	 void m1() {
		 System.out.println("Q class method ");
	 }
 }
}

public class Test extends  P {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
P t1 = new Test();
t1.m1();
	}

}
