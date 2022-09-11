package com.lambda.ex;

interface i1 {
	void show();
}

public class MyClassLambda {

	public static void main(String[] args) {
		String name = "abc";

		i1 i = () -> {
			System.out.println("hello......" + name);
		};
		i.show();
	}

}
