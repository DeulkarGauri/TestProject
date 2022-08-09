package com.demo.method;

class Display {
	// String name;

	public synchronized void ShowThread(String name) {
		for (int i = 0; i < 10; i++) {
			System.out.println("Hey.........! ");
		}
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {

		}
		System.out.println(name);

	}
}

class MultithreadMything extends Thread {
	Display d;
	String name;

	public MultithreadMything(Display d, String name) {
		super();
		this.d = d;
		this.name = name;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		d.ShowThread(name);

	}
}

public class MyThread extends Thread {
	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {
			System.out.println("Main method Started ....");
		}

		Display d1 = new Display();
		Display d2 = new Display();

		MultithreadMything FirstThread = new MultithreadMything(d1, "john");
		FirstThread.start();
		MultithreadMything SecondThread = new MultithreadMything(d1, "Mike");
		SecondThread.start();
	}
}
