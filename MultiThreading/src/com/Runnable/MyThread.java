package com.Runnable;

class anotherThread extends Thread {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("inside another thread class");

		for (int i = 10; i > 0; i--) {
			System.out.println("value of another thread is :- " + i);
		}
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

public class MyThread implements Runnable {
	public static void main(String[] args) {
		System.out.println("main method");

		MyThread t2 = new MyThread();
		Thread t1 = new Thread(t2);

		anotherThread t3 = new anotherThread();
		t1.start();
		t3.start();

	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 0; i < 10; i++) {
			System.out.println("value of i:-" + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
