package com.string;
// to check char frequency in a given string 2 interview question
public class CharAt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1 = " ISHITA ";
		int count = 0;
		
		for (int i=0; i<=s1.length()-1; i++) {
			
			 if(s1.charAt(i) == 'I') {
				 count++;
			 }
		}
		System.out.println("frequency of i is "+count);
	}
	

}
