package com.demo.multitask.Thread.Ex;

class College extends Thread {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 10; i++) {
			System.out.println("....*Welcome Here*....");
		}
	}
}

public class MultiThreadExample extends Thread {
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 10; i++) {
			System.out.println("**Inside Display Method **");
		}
	}

	public static void main(String[] args) {

		College c1 = new College();
		c1.start();

		MultiThreadExample m1 = new MultiThreadExample();
		m1.start();

		for (int i = 0; i < 10; i++) {
			System.out.println("main Method Starts here ......");
		}
	}

}
