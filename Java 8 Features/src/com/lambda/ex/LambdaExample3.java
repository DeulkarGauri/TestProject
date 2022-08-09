package com.lambda.ex;

interface Sayable1 {
	String Say(String Name);
}

public class LambdaExample3 {
	public static void main(String[] args) {
		System.out.println("this is third example.....");
		String s1 = "Prachi";

		Sayable s2 = () -> {
			return "My Name is " + s1;
		};
		System.out.println(s2.say());
	}
}
