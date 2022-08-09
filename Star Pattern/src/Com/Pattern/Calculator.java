package Com.Pattern;
// example given bye akshay dada . date : 23/03/2022
import java.util.Scanner;
   // program to create calculator using switch case 
    
    public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
		String yn;
		// do while loop used for to continue the program 
		
		do { Scanner sc = new Scanner (System.in);
	     
	     System.out.println(" Enter first Number : ");
	     int num1 = sc.nextInt();    // to take input from user and the number stored in num1
	     
	     System.out.println(" Enter Second Number : ");
	     int num2 = sc.nextInt();    // to take input from user 
	    
	     System.out.println("Select Symbol (+,-,*,/)");
	     String Symbol = sc.next();  // to take input from user 
	     int Result;
	     
	     switch(Symbol) {
	     
	     case "+" : Result = num1 + num2;
	     System.out.println("Addition Of This Two Number is = "+Result);
	     break;
	     
	     case "-" : Result = num1 - num2;
	     System.out.println("Subtraction  Of This Two Number is = "+Result);
	     break;
	     
	     case "*" : Result = num1 * num2;
	     System.out.println("Multiplication  Of This Two Number is = "+Result);
	     break;
	     
	     case "/" : Result = num1 / num2;
	     System.out.println("Division Of This Two Number is = "+Result);
	     break;
	     
	     default : System.out.println("Invalid Symbol ! Please Choose The Right Symbol ");
	     
	     }
    	System.out.println("Do You Want To Continue (Press Y for Yes and n For No )");
    	yn = sc.next();
    	} 
		while(yn.equals("y")||yn.equals("Y"));
    
     
     
     
     
	}

}
