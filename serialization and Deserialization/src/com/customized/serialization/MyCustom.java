package com.customized.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Employee implements Serializable {

	String emp_name;
	int acc_no;
	String acc_pass;

	public Employee(String emp_name, int acc_no, String acc_pass) {
		super();
		this.emp_name = emp_name;
		this.acc_no = acc_no;
		this.acc_pass = acc_pass;
	}

	private void writeObject(ObjectOutputStream oos) throws Exception {
		oos.defaultWriteObject();
		String EnPass = "1234" + acc_pass;

		oos.writeObject(EnPass);
	}

	private void readObject(ObjectInputStream ois) throws Exception {
		ois.defaultReadObject();
		String nepass = (String) ois.readObject();
		acc_pass = nepass.substring(3);
	}
}

public class MyCustom {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		// TODO Auto-generated method stub
		System.out.println("main method......");
		Employee e1 = new Employee("RAM", 890653455, "ram@1230");

		System.out.println("Username : " + e1.emp_name + "\n Account number : " + e1.acc_no + "\n Account password : "
				+ e1.acc_pass);

		FileOutputStream fos = new FileOutputStream("employee.details");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(e1);

		FileInputStream fis = new FileInputStream("employee.details");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Employee myemp = (Employee) ois.readObject();
		System.out.println("Username : " + myemp.emp_name + "\n Account number : " + myemp.acc_no
				+ "\n Account password : " + myemp.acc_pass);

	}

}
