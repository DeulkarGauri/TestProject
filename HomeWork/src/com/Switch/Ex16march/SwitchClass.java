package com.Switch.Ex16march;

import java.util.Scanner;

public class SwitchClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
     System.out.println("Enter The Month");
   
   int Month = 1;
   String Month_Name = sc.next();
   
      switch (Month_Name){
      case " 1":{
    	  System.out.println("This Month is Janewary");
    	 
      }
      case " 2":{
    	  System.out.println("This Month is Februwary");
    	 
      }
      case " 3":{
    	  System.out.println("This Month is March");
    	  
      }
      case "4":{
    	  System.out.println("This Month is April");
     
      }
      case " 5":{
    	  System.out.println("This Month is May");
    	  
    	  
      }
      
       }


	}

	
}
