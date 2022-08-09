package com.array;

import java.util.Arrays;

public class LeftArrayElement {
	
public static void main(String[] args) {
	System.out.println("welcome here.....");
	int [] arr = {1,2,3,4,5,6,7,8,20};
	int[] evenArr = new int [arr.length];
	int [] oddArr = new int [arr.length];

	int [] newarr = new int [evenArr.length+oddArr.length];
	
	int add;
	System.out.println("even array elemnt are ... ");
	for(int i=0; i<arr.length; i++) {
		
	if (arr[i] % 2 ==0) {
		evenArr[i]= arr[i];
		//System.out.print(evenArr[i] +" , ");
	}
	
	else if (arr[i] % 2 !=0) {
		oddArr[i] = arr[i];
		//System.out.print(oddArr[i]  +" , ");
	}
	
	}
	System.out.println(" \n even array element are ..."+Arrays.toString(evenArr));
	System.out.println(" \n odd array element are ..."+Arrays.toString(oddArr));
	
	for (int i=0; i<evenArr.length+oddArr.length;i++) {
	//	newarr[evenArr[i]+1] =  oddArr[i];
		
	}
	System.out.println(" my array will be "+ Arrays.toString(newarr));
	
}
}
