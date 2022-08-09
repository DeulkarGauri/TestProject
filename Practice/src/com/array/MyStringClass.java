package com.array;

import java.util.Arrays;

public class MyStringClass {
	
			 
	//WAP to check character is vowel or consonant

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = "GAURI " ;  
		s1 = s1.toLowerCase();
		System.out.println(" My new String is : "+s1);
        char[] ch = s1.toCharArray();  
      int len = ch.length;  
  
       System.out.println("Char Array elements: "+Arrays.toString(ch));  
        for (int i = 0; i < len; i++) {  
            //System.out.println(ch[i]);
            if(ch[i] == 'a' || ch[i] == 'e' || ch[i] == 'i' || ch[i] == 'o' || ch[i] == 'u' ) {
            	System.out.println("The Letter "+ch[i] + " is vowel");
            }
            else
            	System.out.println("The Letter "+ch[i] + " is consonent");
            
        }  
		


	}

}
