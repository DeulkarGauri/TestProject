package com.array;

public class PrimeNumber {

	public static void main(String[] args) {
		int num = 7;
		int count=0;
		for(int i=2; i<num-1;i++) {
			if(num%i==0) {
				count++;
			}
		}
		if(count==0) {
			System.out.println(num +" num is  prime ");
		}else {
			System.out.println(num +" num is not prime ");
		}
		}
	
}
