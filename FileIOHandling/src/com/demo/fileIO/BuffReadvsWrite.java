package com.demo.fileIO;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

// program for writing an reading file using BufferedWriter and BufferedReader
public class BuffReadvsWrite {
	public static void main(String[] args) throws IOException {
		System.out.println("MyBufferredRead and BufferedWrite Program");

		File f1 = new File("Resume");
		f1.mkdir();
		System.out.println("is directory?...............> " + f1.isDirectory());
		File f2 = new File(f1, "Heading");
		f2.createNewFile();
		System.out.println("is File?.....................> " + f2.isFile());

		/*
		 * for writing file using BufferedWriter
		 */
		FileWriter fw = new FileWriter(f2);
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write("India is my country.....");
		bw.newLine();
		bw.write("Name = Gauri Deulkar");
		bw.newLine();
		bw.write("Add: pune");
		bw.newLine();
		bw.write("Education :- BCA ");
		bw.newLine();
		bw.write("mobile no  :- 8806516118 ");
		bw.flush();

		/*
		 * for reading file using BufferedReader
		 */
		FileReader fr = new FileReader(f2);
		BufferedReader br = new BufferedReader(fr);
		String mysr = br.readLine();
		while (mysr != null) {
			System.out.println(mysr);
			mysr = br.readLine();
		}

	}
}
