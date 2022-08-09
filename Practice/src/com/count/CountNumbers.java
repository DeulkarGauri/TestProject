package com.count;

import java.util.Scanner;

public class CountNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner console = new Scanner(System.in);
		 
	        int number,          
	           Possitivecount=0, NegativeCount=0, ZeroesCount=0;
	 
	        char choice;
	 
	        do
	        {
	            System.out.print("Enter the number ");
	            number = console.nextInt();
	 
	            if(number > 0)
	            {
	                Possitivecount++;
	            }
	            else if(number < 0)
	            {
	                NegativeCount++;
	            }
	            else
	            {
	                ZeroesCount++;
	            }
	 
	            System.out.print("Do you want to continue y/n? ");
	            choice = console.next().charAt(0);
	 
	        }while(choice=='y' || choice == 'Y');
	 
	        System.out.println("Positive numbers: " + Possitivecount);
	        System.out.println("Negative numbers: " + NegativeCount);
	        System.out.println("Zero numbers: " + ZeroesCount);
	    
	}

}
