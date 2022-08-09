 
  

public class Test  {
	static String s ;

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("main method starts here: ");

try {
	
	System.out.println("try block"+ 10/0);
	
}
catch (ArithmeticException e) {
	// TODO: handle exception
	System.out.println("hey.... please check the value you will divide by " );
	
}
finally {
	System.out.println("close the resources");
}
try {
System.out.println("try block 1 "+ s.length());
} catch (Exception e) {
	// TODO: handle exception
	
		System.out.println("null pointer exception occur " );
}
finally {
	System.out.println("close the resources");
}


	}

}
 

