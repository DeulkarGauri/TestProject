package com.set;

import java.util.Comparator;
import java.util.TreeSet;

class MyComparator implements Comparator<Object> {

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub

		String s1 = (String) o1;
		String s2 = (String) o2;
		return s1.compareTo(s2);
	}

}

public class Runner extends Sports {

	public static void main(String[] args) {
		System.out.println("welcome to runner class....");
		TreeSet<String> t = new TreeSet<String>(new MyComparator());
		t.add("sakshi");
		t.add("kiran");
		t.add("prachi");
		t.add("achal");
		t.add("mansvi");
		t.add("vaidehi");
		System.out.println(t);
	}
}
