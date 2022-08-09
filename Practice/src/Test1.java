import java.io.IOException;

public class Test1  {
	
 public static void main(String arg[])
	{
	 int [] x = new int[10];
	 int y = 0;
	 try {
	    x[10] = 30/y;
		
	} catch (ArithmeticException e) {
		// TODO: handle exception
		System.out.println("please check value which you enter");
	}
	 catch (NullPointerException e) {
		// TODO: handle exception
		 e.printStackTrace();
	}
	 }
	}



	

