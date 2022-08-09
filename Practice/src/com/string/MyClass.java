package com.string;

public class MyClass {
    int mob_no;
static String Name ;
static String Surname;
	public static void main(String[] args) {
		  
		System.out.println("main Method Started : ");
		MyClass m1 = new MyClass(12345);
		MyClass m2 = new MyClass(12345);
		MyClass m3 = new MyClass("Shweta ", "Thakre");
		System.out.println(m1==m2);
		System.out.println(m1.equals(m2));
		System.out.println("My Name is "+Name + Surname );
		
	}

	@Override
	public String toString() {
		return "MyClass [Name=" + Name + ", Surname=" + Surname + "]";
	}

	public MyClass(int mob_no) {
		super();
		this.mob_no = mob_no;
	}

	
	public MyClass(String name, String surname) {
		super();
		Name = name;
		Surname = surname;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + mob_no;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MyClass other = (MyClass) obj;
		if (mob_no != other.mob_no)
			return false;
		return true;
	}
}
