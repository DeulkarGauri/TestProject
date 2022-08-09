package com.string.program;

public class DivideNParts {
	public static void main(String[] args) {
 System.out.println("main method");
		String s = "123456789098";
		
		int len = s.length();
		int n = 3;
		int count = 0 , chars = len/n;
		// to store array element343
		 String [] equalstar = new String [n];
		 // if length of string can divisible by 3 then it will divide in n parts
		if(len %n !=0) {
			System.out.println("This string can not divide into "+ n +" equal parts ");
		} else
		{
			for (int i = 0; i<len; i = i+chars) {
				 String part = s.substring(i, i+chars);
	                equalstar[count] = part;  
	                count++;  
			}System.out.println(n + " = Equal parts of string are ");
			for(int i = 0; i<equalstar.length; i++) {
			System.out.println(equalstar[i]);	
			}
		}
	}

}
