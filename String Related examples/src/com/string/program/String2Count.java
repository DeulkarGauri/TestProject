package com.string.program;

public class String2Count {

	public static void main(String[] args) {
		String s1  = "Gauri";
		String s2  = "Shweta";
		int count=0;
		for(int i = 0; i<s2.length(); i++) {
			if(s2.charAt (i) !=0)
				count++;	
		}
		System.out.println("S2 total character are = "+count);
	}
}
