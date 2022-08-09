package com.demo.fileIO;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/*
 *  example of file handling in this program we can create file , check whether it exist , write context in file ,
 *  read file , making an directory.
 *  all this can be done in this program
 */
public class Employee {

	public static void main(String[] args) throws IOException {
		System.out.println("main method.....");
		Employee.IO();
	}

	static void IO() throws IOException {
		File dir = new File("Name");
		dir.mkdir();
		File f1 = new File(dir, "IMS.COM.txt");

		System.out.println(f1.exists());
		f1.createNewFile();
		File f2 = new File(dir, "Students.com.txt");
		System.out.println(f2.exists());
		f2.createNewFile();

		// System.out.println("Is File......> " + dir.isFile());
		// System.out.println("Is Directory......> " + dir.isDirectory());
		// System.out.println("Is File......> " + f1.isFile());
		// System.out.println("Is Directory......> " + f1.isDirectory());

		/* For Writing into an File */

		FileWriter write = new FileWriter(f1);
		write.write("** Welcome to my newly created file ***");
		write.write(" \n How Can I help You ?");
		write.write(" \n Total Students are ");
		System.out.println("\n");
		write.flush();
		String[] list = dir.list();
		System.out.println(" \n My files ....> ");
		for (int i = 0; i < list.length; i++) {
			System.out.println("\n" + (i + 1) + " " + list[i]);

		}
		/* for reading */
		FileReader read = new FileReader(f1);
		System.out.println(read.read());
		char[] MynewFile = new char[(int) f1.length()];
		read.read(MynewFile);
		System.out.println("Content In my file is ");
		for (int i = 0; i < MynewFile.length; i++) {
			System.out.print(MynewFile[i]);
		}
	}
}
