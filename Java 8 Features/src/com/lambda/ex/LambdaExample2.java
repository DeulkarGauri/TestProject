package com.lambda.ex;

interface Sayable {
	String say();
}

public class LambdaExample2 {

	public static void main(String[] args) {

		System.out.println("This is second example of lambda.......");
		String s1 = "Hello, I am here...";

		Sayable s = () -> {
			return "I want to say something...\nPlease Wait.." + " \n " + s1;
		};
		System.out.println(s.say());

	}

}
