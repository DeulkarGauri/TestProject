package com.collection.college.info;

class College123 implements Cloneable {
	String Add;

	public College123(String add) {
		super();
		Add = add;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
}

public class MyStudentClass implements Cloneable {
	int id;
	String name;
	College123 my_add;

	public MyStudentClass(int id, String name, College123 add) {
		super();
		this.id = id;
		this.name = name;
		this.my_add = add;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {

		MyStudentClass my_stud = (MyStudentClass) super.clone();
		my_stud.my_add = (College123) my_add.clone();
		return my_stud;
	}

	public static void main(String[] args) throws CloneNotSupportedException {
		System.out.println("**...Welcome here...**");
		College123 c1 = new College123("pune");

		MyStudentClass m1 = new MyStudentClass(101, "Ram", c1);

		MyStudentClass m2 = (MyStudentClass) m1.clone();
		m2.id = 102;
		System.out.println(m1.my_add.Add);
		System.out.println(m1.id); // here id will different for both object
		m2.my_add.Add = "mumbai";
		System.out.println(m1.my_add.Add);
		System.out.println(m2.my_add.Add);
	}
}
