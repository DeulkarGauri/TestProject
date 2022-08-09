package com.set;

import java.util.Comparator;

public class Sports implements Comparator<String> {

	@Override
	public int compare(String o1, String o2) {
		// TODO Auto-generated method stub
		String s1 = (String) o1;
		String s2 = (String) o2;
		return s1.compareTo(s2);

	}

}
