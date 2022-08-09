package com.demo.abstraction;



public abstract class Student {
	int id ;
	public Student(int id) {
		super();
		this.id = id;
	}
	void show () {
		System.out.println("show method of parent class ");
	}
	public abstract void show1();
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("main method of abstract class ");


	}
}
 class MyTest extends Student{

	public MyTest(int id) {
		super(id);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void show1() {
		// TODO Auto-generated method stub
		System.out.println("Show 1 method in Student class impliment in child class");
	}
	public static void main(String[] args) {
		MyTest t1 = new MyTest(10);
		t1.show();
		t1.show1();
		System.out.println("my test id = " +t1.id);
		t1.id = 20;
		System.out.println("my new  test id = " +t1.id);
		
		
	}
	
}
