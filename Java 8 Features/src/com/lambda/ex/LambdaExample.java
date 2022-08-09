package com.lambda.ex;

public class LambdaExample {

	public static void main(String[] args) {
		/**
		 * 
		 * Lambda expression is provide an implimentation of functional Interface.
		 * 
		 * 
		 * Lambda expression is a type of function without a name
		 * 
		 * Syntax for lambda expression:------->
		 * 
		 * //functionalInterface fi = (String name)-> {
		 * 
		 * System.out.println("Hello"+name);
		 * 
		 * return "Hello "+name; }
		 * 
		 * 
		 * Benifits:---> It is beneficial in iterating, filtering, and extracting data
		 * from a collection.
		 * 
		 * 
		 * 
		 * ** Funactional Interface :- A interface having only one abstract method are
		 * called as Functional Interface.
		 * 
		 * Java Provide an Annotation @functionalInterface , which is used to declare as
		 * Functional Interface.
		 * 
		 * 
		 * why we used it? # to provide implimentation of functional Interface # Less
		 * coding
		 * 
		 * Lambda exoression consist of Three Component:-
		 * 
		 * 1. Argument List---->(argument List)
		 * 
		 * 2. arrow Token ----> it is denoted by 'array token -> Pronounce it as "such
		 * that".....'
		 * 
		 * 
		 * 
		 * 3. body ------------> { body }
		 * 
		 * 
		 **/

		System.out.println("Lambda exapression Example.");
		// without lambada
		String Name = "Wild...";

		// Jungle j1 = new Jungle() {
		//
		// @Override
		// public void jungleName() {
		// // TODO Auto-generated method stub
		// System.out.println("Jungle name is :- " + Name);
		// }
		// };
		// j1.jungleName();

		// using lambda
		Jungle j2 = () -> {
			System.out.println("Jungle name is :- " + Name);
		};
		j2.jungleName();
	}
}
