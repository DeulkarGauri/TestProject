package com.polymorphism.overloading;

public class Main {
	
	
	/*
	 * rule for two arg primitives  primitives 
	 * Direct match---> implicit promotion--->object-->C.E...........
	 * (if we write two arg object method then it will not go for autoboxing )
	 * But if not written any two arg object method then it will go through  below scenario 
	 * i.e Direct match--->implicit promotion---> autoboxing--->wrapper class parent/number--> super parent /object-->C.E
	 * 
	 * rule for two object 
	 * Direct match(own class  object)---> parent class(if exist) ---> object class---> C.E
	 * 
	 * RULE FOR TWO ARG WRAPPER CLASS OBJECT
	 * direct match-->wrapper class parent/number-->super parent/object -->Autounboxing (Convert Integer to int )--->C.E
	 */
//    void show(int a , int b ) {
//    	System.out.println("int int method");
//    }
//	
//    void show(long a , int b) {
//    	System.out.println(" long int method");
//   }
   
//    void show(float a, int b) {
//    	System.out.println("Float int   method");
//    }
	
//    void show(Float a , Integer b ) {
//    	
//    	System.out.println("Float Integer wrapper class   method");
//    }
// void show(int a , Integer b ) {
//    	
//    	System.out.println("int Integer wrapper class   method");
//    }
 
//    void show(int b , Number a) {
//    	System.out.println("Number Number method");
//     }
//    void show(int a , Object b) {
//    	System.out.println("int  object  class method");
//    }
   
	 void show(Integer a , Float b ) {
	    	
	    	System.out.println("Float Integer wrapper class   method");
	    }
    void show(Object a, Object b ) {
    	System.out.println("Object  object method");
    }
    void show(String a , int b ) {
    	System.out.println("String int  method");
    }
   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Main m1 = new Main();
Main m2 = new Main();
Integer i1 = new Integer(10);
Float f1 = new Float(12.4);

m1.show("abc ",  90);

m1.show(10,20);
m2.show(f1, i1);
	}

}
