package com.collection.college.info;

public class MainClass {

	static Student[] info() { // create an method to store information of student , marks and subjects

		Subject sub1 = new Subject("math", 50);
		Subject sub2 = new Subject("english", 20);
		Subject sub3 = new Subject("computer", 20);

		Student ram = new Student("Ram", sub1, sub2, sub3);

		Subject M_sub1 = new Subject("math", 55);
		Subject M_sub2 = new Subject("english", 48);
		Subject M_sub3 = new Subject("computer", 45);

		Student Mahesh = new Student("Mahesh", M_sub1, M_sub2, M_sub3);

		Subject S_sub1 = new Subject("math", 30);
		Subject S_sub2 = new Subject("english", 50);
		Subject S_sub3 = new Subject("computer", 65);

		Student Sham = new Student("Sham", S_sub1, S_sub2, S_sub3);
		Student[] MyStud = { ram, Mahesh, Sham };
		return MyStud;

	}

	public static void main(String[] args) {
		System.out.println(" ** Welcome To MainClass ** ");

		Student[] students = MainClass.info(); // call a info method using main class name

		College c1 = new College("com", students); // creating am constructor of college which have two fields branch
													// name and total students
		Student a = c1.getTopper(); // call a topper method of college class
		// System.out.println(a);
		System.out.println(a.name + a.getTotalMarks()); // printing topper student name and marks

	}
}

class College {
	String Branch_Name; // declaring variables
	Student[] students = new Student[3]; // array of student

	public College(String branch_Name, Student[] students) { // creating an constructor to initialize value
		super();
		Branch_Name = branch_Name;
		this.students = students;
		System.out.println(" Branch Name = " + branch_Name);
	}

	Student getTopper() { // create an topper method to get topper from the computer branch

		int max = 0; // initialize an max marks =0

		Student TopStud = new Student(); // create an dummy object of student class
		Student[] a = students; // create an arrays of student which have student
		for (int i = 0; i < students.length; i++) {
			Student obj = students[i]; // it will give individual student one by one
			int maxmarks = obj.getTotalMarks(); // call an gettotalmarks() method
			if (maxmarks > max) { // checking condition if maxmarks is grater than max mark
				max = maxmarks;
				TopStud = obj;
			}

		}

		System.out.println("**** Topper Student will be **** ");
		return TopStud;
	}

}

class Student {
	String name; // declaring a variable roll number

	Subject Math;
	Subject English;
	Subject Computer;

	public Student(String name, Subject Math, Subject English, Subject Computer) { // constructor
		System.out.println("my name is " + name);
		this.name = name;
		this.Math = Math;
		this.English = English;
		this.Computer = Computer;

	}

	public Student() { // no arg constructor

	}

	Student[] Total_Student = new Student[3]; // creating an array for total student

	int getTotalMarks() {

		int Result = Math.Sub_Marks + English.Sub_Marks + Computer.Sub_Marks;
		// System.out.println(name + " total marks = " + Result);
		return Result;

	}
}

class Subject {
	String Sub_name;
	int Sub_Marks;

	public Subject(String sub_name, int sub_Marks) { // creating an constructor to initialize value

		Sub_name = sub_name;
		Sub_Marks = sub_Marks;
		System.out.println(" subject name is : " + sub_name + " \n Subject Mark =  " + sub_Marks);
	}

}