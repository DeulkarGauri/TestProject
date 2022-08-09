package com.demo.practice;

interface myInterface {
	// void show1();

	default void show() {
		System.out.println("This is default method.....");

	}
}

public class anonymousExample implements myInterface {

	public static void main(String[] args) {

		// myInterface mi = new myInterface() {

		//
		// @Override
		// public void show() {
		// // TODO Auto-generated method stub
		// System.out.println("inside Interface Object");
		// }
		//
		// };
		// mi.show();

		System.out.println("main..");
		anonymousExample a1 = new anonymousExample();
		a1.show();
		// myInterface m1 = new myInterface()
		//
		// {
		//
		// @Override
		// public void show1() {
		// // TODO Auto-generated method stub
		// System.out.println("inside Interface Object");
		// }
		//
		// };
		// m1.show();
	}

}
