package com.demo.file.reader;

import java.util.Enumeration;
import java.util.Stack;
import java.util.Vector;

public class FileReader {

	public static void main(String[] args) {
		System.out.println("welcome to file handling......");

		Vector v = new Vector<>();
		for (int i = 0; i <= 10; i++) {
			v.addElement(20);
		}
		System.out.println(v);

		Enumeration e = v.elements();

		while (e.hasMoreElements()) {
			Integer i = (Integer) e.nextElement();
			if ((i % 2) == 0)
				System.out.println(i);
		}

		System.out.println(v);
		Stack s = new Stack<>();

		s.push(10);
		s.push(20);
		s.push("A");
		s.push(40);
		System.out.println(s);
		System.out.println(s.search(10));
		System.out.println(s.search(20));
		System.out.println(s.search("A"));
		System.out.println(s.search(40));
	}
}
//