package com.demo;

public class MyTest {
static int clg_id = 101;
     
      int mob_num = 12445;
      
      public MyTest(int mob_num ) {
    	  super();
    	  
    	  this.mob_num = mob_num;
    	  System.out.println("inside constructor");
      }
      static {
    	  System.out.println("inside static block");
      }
      static {
    	  System.out.println("inside static2 block");
      }
      {
    	  System.out.println("inside intsnce block");
      }
      {
    	  System.out.println("inside intsnce block");
      }
   public static void main(String[] args) {
	System.out.println("main method start");
	
     MyTest t1 = new MyTest(12345);
	System.out.println("my clg id id : "+clg_id);
	System.out.println("my mob num is : "+t1.mob_num);
	
	
}   
}
