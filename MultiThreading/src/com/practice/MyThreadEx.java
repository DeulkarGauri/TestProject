package com.practice;

public class MyThreadEx implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Inside run method ");
		for (int i = 0; i < 10; i++) {
			System.out.println("************Run*****************");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	public static void main(String[] args) {
		System.out.println("here we start .....");

		MyThreadEx e1 = new MyThreadEx();

		Thread t1 = new Thread(e1);
		for (int i = 0; i < 10; i++) {
			System.err.println("************main*****************");

		}
		t1.start();

	}

}
