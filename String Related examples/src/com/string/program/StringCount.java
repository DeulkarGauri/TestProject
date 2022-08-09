package com.string.program;
//WAP To Count Total Character in String

public class StringCount {

	public static void main(String[] args) {
		
		String S1 = "My Name is gauri";
		int count = 0;
		for(int i =1; i<S1.length();i++) {
			if(S1.charAt(i) !=0) 
				count++;
		}		
			System.out.println(" Total  character of String S1 Are : "+count);
			
		
	}
}
