package com.demo.inheritance;
// Sample Program for inheritance 
class Animal{
	 
	 void eat(){
	 
	 System.out.println(" i am eating now ");
	 
	 }
	 
	 }
	 class Dog extends Animal{
	 
	 public static void main (String[] args){
		 System.out.println("main methods starts here: ");
	 Dog D = new Dog ();
	 D.eat();
	 
	}
	  }
	 