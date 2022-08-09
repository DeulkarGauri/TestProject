package com.array;

public class LengthofArray {
	int []a = new int[] {1, 2, 3, 4, 5};
	 int sum()
    {
        int sum = 0; 
       
        for (int i = 0; i < a.length; i++)
     sum = sum+a[i];
  
        return sum;
    }
	public static void main(String[] args) {
		System.out.println("main method starts here");
		LengthofArray l1 = new LengthofArray();
		
		System.out.println("sum of array element are = "+l1.sum());
		
		
			
	}
}

