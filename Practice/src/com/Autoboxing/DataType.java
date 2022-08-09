package com.Autoboxing;

import java.util.ArrayList;
import java.util.List;

public class DataType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	 
	        // Creating an empty ArrayList of integer type
	        List<Integer> list = new ArrayList<Integer>();
	 
	        // Adding the int primitives type values by
	        //  converting them into Integer wrapper object
	        for (int i = 0; i < 3; i++)
	 
	            System.out.println(
	                list.add(Integer.valueOf(i)));
	}

}
