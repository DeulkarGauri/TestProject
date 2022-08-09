package forLoop;

import java.util.Scanner;

public class MultiplicationTable {

	public static void process(int number) {
		for (int i = 0; i <= 10; i++) {
			System.out.println(number + " * " + i + " = " + (number * i));

		}
	}

	public static void main(String[] args) {
		System.out.println("main method......");
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a  number whose table you want");
		int num = sc.nextInt();
		new MultiplicationTable().process(num);
	}
}
