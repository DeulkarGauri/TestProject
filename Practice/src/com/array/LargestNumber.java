package com.array;

import java.util.Arrays;

public class LargestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int [] a = {10,20,50,12,15,69};
  //  System.out.println("\n given array is :"+Arrays.toString(a));
    int largest = a[0];
    int smallest = a[0];
    for(int i = 1 ; i<a.length; i++) {
    	if(a[i]>largest) {
    	largest =a[i];
    	}
    	if(a[i]<smallest) {
        	smallest =a[i];
        	}    
    	System.out.println("\n given array is :"+Arrays.toString(a));
 	    System.out.println("\n largest number  is :"+largest);
    	    System.out.println("\nsmallest number  is :"+smallest);
    			
    	
    }
    
	}

}
