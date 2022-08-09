package com.demo.practice;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class PracticeClass {

	public static void main(String[] args) throws IOException {
		System.out.println("file handling....... practice ....set");

		File f1 = new File("Details");
		// f1.exists();
		System.out.println(f1.exists());

		f1.mkdir();
		System.out.println(f1.exists());

		File f2 = new File(f1, "Student.info");
		f2.createNewFile();

		System.out.println(f2.exists());
		FileWriter fw = new FileWriter(f2);
		fw.write(10);
		fw.write("**********welcome to our school*******");
		fw.write(2022);
		fw.flush();

		/*
		 * FileReader fr = new FileReader(f); System.out.println(fr.read()); char [] ch2
		 * = new char[(int) (f.length())]; System.out.println(ch2.length); fr.read(ch2);
		 * for(char ch1: ch2) { System.out.print(ch1); }
		 */
		FileReader fr = new FileReader(f2);
		System.out.println(fr.read());
		char[] fr11 = new char[(int) (f2).length()];

		System.out.println(fr11.length);

		fr.read(fr11);

		for (char c : fr11) {
			System.out.print(c);
		}
	}
}
