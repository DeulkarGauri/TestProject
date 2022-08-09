package com.demo;
// INTERVIEW QUESTION PROGRAM 
public class MyString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String S1 =  "ABCADXAY";

int count = 0;
for(int i = 0; i<S1.length(); i++) {
	
	if(S1.charAt(i)=='A') {
		count++;
		
	}
}
System.out.println("'A ' Alphabet = "+count + " Times");
}
	}

