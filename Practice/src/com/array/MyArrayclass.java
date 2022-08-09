package com.array;

import java.util.Arrays;

public class MyArrayclass implements Myname{

	int[] myarray() {
		int [] array1 = {1,2,3,4,5};
		return array1;
	}
	public static void main(String[] args) {

		  System.out.println("main method starts ");
		  MyArrayclass c1 = new MyArrayclass();
		  System.out.println("my given array = "+Arrays.toString(c1.myarray()));
MyArrayclass m1 = new MyArrayclass();
System.out.print( m1.getid());
	}
	
	public boolean myid() {
		// TODO Auto-generated method stub
	System.out.println("hello inteface myname 2 method ");
	return false;	
	}
	@Override
	public boolean getid() {
		// TODO Auto-generated method stub
		return false;
	}
}
