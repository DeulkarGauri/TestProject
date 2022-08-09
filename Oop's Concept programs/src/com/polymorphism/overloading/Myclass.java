package com.polymorphism.overloading;

public class Myclass {

	void show (int a, int b ) {
		System.out.println(" int int method ");
	}
void show (int a, float b ) {
	System.out.println(" int float method ");
	}
void show (float a, int b ) {
	System.out.println(" float int method ");
}
void show (int a, long b ) {
	System.out.println(" int long method ");
}
void show (int a, Number b ) {
	System.out.println(" int Number method ");
}
void show (Number a, int b ) {
	System.out.println(" Number int method ");
}
void show (int a, Object b ) {
	System.out.println(" int Object method ");
}
void show (Object a, int b ) {
	System.out.println(" Object int method ");
}
void show (Integer a, Integer b ) {
	System.out.println(" Integer Integer method ");
}
	public static void main(String[] args) {
		
		Myclass m1 = new Myclass();
		m1.show(10, 20);
	}
	
}
