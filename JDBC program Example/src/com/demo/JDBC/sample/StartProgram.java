package com.demo.JDBC.sample;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
// demoprogram,

public class StartProgram {
	public static void main(String[] args) throws IOException {
		System.out.println(" welcome to management app");

		// for giving an choice from user
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while (true) {

			System.out.println("\n PRESS 1 TO ADD STUDENT");
			System.out.println("\n PRESS 2 TO DELETE STUDENT");
			System.out.println("\n PRESS 3 TO DISPLAY STUDENT");
			System.out.println("\n PRESS 4 TO EXIT");

			int choice = Integer.parseInt(br.readLine());
			if (choice == 1) {
				// add
				System.out.println("enter user name ");

				String name = br.readLine();

				System.out.println("enter user phone ");
				String phone_no = br.readLine();

				System.out.println("enter user city name  ");

				String city = br.readLine();

				StudentInfo st = new StudentInfo(name, phone_no, city);

				System.out.println("\n " + st);

				boolean ans = StudentDao.insertStudentToDB(st); // call an method of studentdao

				if (ans) {
					System.out.println("added succesfully...");
				} else {
					System.out.println("something went wrong please try again later....");
				}

			} else if (choice == 2) {
				// delete
				System.out.println("enter student id which you want to delete....");

				int id = Integer.parseInt(br.readLine());

				boolean f = StudentDao.deletestudent(id);

				if (f) {
					System.out.println("deleted successfully....");
				} else {
					System.out.println("something went wrong please try again later....");
				}

			} else if (choice == 3) {
				// DISPLAY

				StudentDao.displayAllStudent();

				// if (b) {
				// System.out.println("displaying information successfully....");
				// } else {
				// System.out.println("something went wrong please try again later....");
				// }

				System.out.println("display");
			} else if (choice == 4) {
				// exits
				System.out.println("exits");
				break;
			} else {

			}

			System.out.println(" \n thank you for using my application");
			System.out.println("see you soon agian.....");
		}
	}
}
