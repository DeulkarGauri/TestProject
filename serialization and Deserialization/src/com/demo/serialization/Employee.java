package com.demo.serialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/*
 * program to serialized  deserialized an object
 */
class College implements Serializable {

	int id;

	public College(int id) {
		this.id = id;

	}

}

public class Employee {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		System.out.println("welcome to serialization");

		College c1 = new College(1011);

		File myFile = new File("student.info.txt");
		myFile.createNewFile();
		System.out.println("My File is .................> " + myFile.exists());

		FileOutputStream fos = new FileOutputStream(myFile);// serialization
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(c1);
		System.out.println(c1.id);

		FileInputStream fis = new FileInputStream(myFile); // deserialization
		ObjectInputStream ois = new ObjectInputStream(fis);
		College clg = (College) ois.readObject();
		System.out.println(clg.id);
	}

}
