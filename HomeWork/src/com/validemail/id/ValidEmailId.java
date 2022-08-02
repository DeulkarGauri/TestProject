package com.validemail.id;

// homework : date 06/04/2022  
import java.util.Scanner;

public class ValidEmailId {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(" Enter your emailid");
		Scanner sc = new Scanner(System.in);
		String UserId = sc.next();

		System.out.println("The User-id is:- " + "\n" + UserId);
		String Result = validemail(UserId);

		System.out.println("\n" + Result);

		System.out.println("enter your  password ");
		Scanner sc1 = new Scanner(System.in);
		String userpassword = sc1.next();
		System.out.println("user password is:- " + userpassword);
		String Result2 = PasswordValidation(userpassword);
		System.out.println("\n" + Result2);
	}

	static String validemail(String UserId) {

		int a = UserId.length(); // to check length of mail id
		boolean b = UserId.endsWith(".com"); // to check user-id end with.com or not
		boolean c = UserId.matches("^[A-Za-z0-9+_.-]+@(.+)+[.com||.uk||.biz||.in]$"); // it check is user follow all the
																						// rules or not

		System.out.println("length of User-id is:- " + "\n" + a);
		System.out.println("user-id ends with .com:- " + "\n" + b);
		System.out.println("User-id follow all the rules:-");

		if (a > 10 && a < 20 && c == true) {

			return "valid userid";
		} else
			return "invalid userid";
	}

	static String PasswordValidation(String userpassword) {
		int a = userpassword.length();
		// System.out.println("length of user password is :- "+a);

		boolean b = userpassword
				.matches("^(?=.*[0-9])" + "(?=.*[a-z])" + "(?=.*[A-Z]) " + "(?=.*[@#$%^&-+=()])" + "$ ");

		System.out.println("password  :- " + b);

		if (a > 8 && a < 15 && b == true) {

			return "valid Password";

		} else
			return "invalid Password";

	}
}
