package com.demo.abstraction;

public abstract class Bike {
abstract void run();

}
	class Shine extends Bike{

		@Override
		void run() {
			// TODO Auto-generated method stub
			System.out.println("running safely");
		}
		public static void main(String[] args) {
		Bike b1 = new Shine();
		b1.run();
		}
		
		
	}
