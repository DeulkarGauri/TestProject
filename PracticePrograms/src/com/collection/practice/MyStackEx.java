package com.collection.practice;

import java.util.Stack;

public class MyStackEx {

	public static void main(String[] args) {

		Stack<String> mystack = new Stack<>();
		mystack.push("cat");
		mystack.push("dog");
		mystack.push("rat");
		mystack.push("mouse");

		System.out.println(mystack);

		System.out.println(mystack.peek());

		System.out.println(mystack.pop());

		System.out.println(mystack);
	}
}