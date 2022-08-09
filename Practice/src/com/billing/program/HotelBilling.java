package com.billing.program;

import java.util.Scanner;

public class HotelBilling {

static int total;
   
public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		System.out.println("::Welcome to Snack centre::");
		System.out.println("1. Tea (Rs.10)");
	    System.out.println("2. Green Tea (Rs.15)");
	    System.out.println("3. samosa  (Rs.20)");
	    System.out.println("4. Green Tea (Rs.30)");
	    char choice1 = 0;
	    boolean checkUser = true;
		
		do{
			System.out.println("Enter your choice::");
			System.out.println("enter your quantity");
			
			int choice = scan.nextInt();   // choice enter by user
            int quantity = scan.nextInt();  // quantity enter by user
			switch(choice ){
			case 1: 
			 total = total +10 * quantity;
			System.out.println("Tea prize = "+total+"rs");
			// logic for case 1
			break;
			case 2: 
			 total = total + 15 * quantity;
			System.out.println("Green Tea prize = "+total+"rs");
			// logic for case 2
			break;
			case 3: 
			 total = total + 20 * quantity;
			System.out.println("samosa prize = "+total+"rs");
			// logic for case 3
			break;
			case 4: 
		     total = total +30 * quantity;
			System.out.println("sandwitch prize = "+total+"rs");
			// logic for case 4
			break;
			
			default: System.out.println("Incorrect input!!! Please re-enter choice from our menu");
			}
			System.out.println("Do You Want To Continue or not  press Y/N");
			choice1 = scan.next().charAt(0);
			System.out.println("choice "+choice1);
			 if(choice1 == 'n' || choice1 == 'N') {
				 checkUser = false;	
				}
		}while(checkUser == true);
		  if(choice1 == 'n' || choice1 == 'N') {
				System.out.println("generate bill");
				System.out.println("**TOTAL-BILL**"+total);
				
			}

	}
	}


			
		
	
		
		
	


