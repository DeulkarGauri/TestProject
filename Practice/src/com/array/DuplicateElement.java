package com.array;
//program to print duplicate element from an array
import java.util.Arrays;

public class DuplicateElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int arr[] = new int[] {1,2,3,4,5,2,3,4,1};

System.out.println("original Array :- "+"\n" +Arrays.toString(arr));
System.out.println("Duplicate array element : ");
for (int i=0; i<arr.length;i++) {
	for(int j=i+1; j<arr.length;j++) {
		if(arr[i] == arr[j]) {
			
			System.out.print(arr[j] +", ");
		}
	}
	
}
	}

}
