package com.array;

public class PrintArrayInReverse {
	
public static void main(String[] args) {
	int arr[] = new int[] {1,2,3,4,5};
	
	System.out.println("original array element are : ");
	for(int i=0; i<arr.length; i++) {
		System.out.print(arr[i]+" , ");
	}
	System.out.println();
	System.out.println("reversed array element are: ");
for(int j=arr.length-1; j>=0;j--) {
	System.out.print(arr[j] + " , ");
}
	
}
}
