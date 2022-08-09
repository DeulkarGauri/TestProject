package com.demo.name;
  //1class
class father{            //parent class
 static String Father_name = " xyz";

}

public class Inherritance extends father {    //child class 2
   static String name ="abc";
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Inherritance i1 = new Inherritance();
		
System.out.println("my name is :"+name);
System.out.println("my father name is : "+ Father_name);

	}

}




