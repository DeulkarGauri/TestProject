package com.customized.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

//Performing customized serialization using the below two methods:
// this method is executed by jvm when writeObject() on
// Account object reference in main method is
// executed by jvm.
class Student123 implements Serializable {

	String username = "gauri_deulkar";

	transient String password = "gdeulkar@123#5";

	private void writeObject(ObjectOutputStream oos) throws Exception { // to perform default serialization of Account
																		// object.
		oos.defaultWriteObject();

		String enPasswd = "12345" + password; // enPasswd (encrypted password) // writing encrypted password to the file

		oos.writeObject(enPasswd);
	}

	// this method is executed by jvm when readObject() on
	// Account object reference in main method is executed by jvm.
	private void readObject(ObjectInputStream ois) throws Exception {

		ois.defaultReadObject();// performing default deserialization of Account object

		String enPasswd = (String) ois.readObject();// deserializing the encrypted password from the file

		password = enPasswd.substring(3);// decrypting it and saving it to the original password // string starting from
		// 3rd index till the last index it read from 3rd indext to last

	}

}

public class CustomizedSerialization implements Serializable {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		System.out.println("we are creating an customized exception...");

		Student123 stdobj = new Student123();

		System.out.println("\n UserName : " + stdobj.username + "\n Password : " + stdobj.password);

		FileOutputStream fos = new FileOutputStream("User.detalis");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(stdobj);

		FileInputStream fis = new FileInputStream("User.detalis");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Student123 stud = (Student123) ois.readObject();

		System.out.println(
				"\n  after encryption " + " \n UserName : " + stud.username + " \n Password : " + stud.password);
	}
}
