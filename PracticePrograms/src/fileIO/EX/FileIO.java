package fileIO.EX;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileIO {

	public static void main(String[] args) throws IOException {

		System.out.println("file io example....");

		File f1 = new File("Student.info.txt");

		// System.out.println(f1.exists());

		f1.mkdir(); // creating an directory

		System.out.println(f1.exists());

		File file1 = new File(f1, "Student.data");

		System.out.println(f1.exists());
		file1.createNewFile(); // create new file in directory

		System.out.println(f1.exists());

		// writing an data into newly created file

		FileWriter fw = new FileWriter(file1);
		fw.write(" \n   Student Information");
		fw.write(10);
		fw.write(" \n Student Name -  Gauri Deulkar");
		fw.write(" \n Student address -  amravati");
		fw.write(" \n Student percentage -  89");

		fw.flush();

		// System.out.println("Reading student information...");

		FileReader fr = new FileReader(file1);

		char[] ch1 = new char[(int) (file1.length())];

		fr.read(ch1);

		System.out.println(ch1);
		for (char c : ch1) {
			System.out.print(c);
		}

		BufferedWriter bfw = new BufferedWriter(fw);
		bfw.write(" \n Hello everyone my name is gauri ..... \n I am From amravati..");
		bfw.newLine();
		bfw.write("i am - ");
		// bfw.newLine();
		bfw.write(" " + 21);
		bfw.newLine();
		bfw.flush();
		bfw.close();

		BufferedReader bfr = new BufferedReader(fr);
		String s = bfr.readLine();
		while (s != null) {
			System.out.println(s);
			s = bfr.readLine();
		}
		bfr.close();

	}
}
