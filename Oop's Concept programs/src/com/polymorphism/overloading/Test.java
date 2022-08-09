package com.polymorphism.overloading;
// program to achieve polymorphism by using method overloading
public class Test {
   static  void show(int a) {
	System.out.println("1");
   }
     void show (String a) {
	System.out.println("2 ");
    }
	public static void main(String[] args) {
	System.out.println("main method starts here: ");	
	Test t1 = new Test();
	t1.show( "abc");
	Test.show(19);
    Test.main(100L);
	}
	public static void main(long a) {
		System.out.println("my name is gauri");
	}
	
}
