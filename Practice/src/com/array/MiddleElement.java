package com.array;

import java.util.Arrays;

public class MiddleElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = {1, 2, 3, 4, 5};
		
		System.out.println("Given Array is = "+Arrays.toString(a));
		
		int Start_index =0, last_Index = a.length-1;
		
		int Mid_Index = Start_index+(last_Index-Start_index)/2;
		
System.out.println("middle index is = "+Mid_Index +  "  and elemnt at Middle index = " +a[Mid_Index]);

		
	
	}

}
