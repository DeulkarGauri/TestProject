package com.demo.abstraction;

 interface Student2 {
    void m1();
    void m2();
    
  }
   interface Student1 {
    void m3();
  }
   interface c  {
   void m1();
   
  }
public class Student implements c, Student1, Student2  {
	static void m11() {
		
		System.out.println("method  of class");
	}
	static{
		System.out.println("static block  ");
	}
	{
		System.out.println("instance block");
	}
	public static void main(String[] args) {
		System.out.println("main method of class");
	Student s1= new Student();
		Student.m11();
		s1.m1();
		s1.m2();
		s1.m3();
	}
	@Override
	public void m2() {
		// TODO Auto-generated method stub
		System.out.println("implimented method of interface 1");
	}
	@Override
	public void m1() {
		// TODO Auto-generated method stub
		System.out.println("implemented method of interface ");
	}
	@Override
	public void m3() {
		// TODO Auto-generated method stub
		int a=10,b=20;
		int result = a+b;
		System.out.println("implimented method of interface");
		System.out.println("addition in implimented method a+b = "+result);
	}

	
}
