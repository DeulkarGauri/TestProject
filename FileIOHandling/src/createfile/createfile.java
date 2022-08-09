package createfile;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class createfile {
	public static void main(String[] args) throws IOException {
		System.out.println("Creating an file.....");

		File f1 = new File("File.txt");

		f1.createNewFile();
		f1.exists();
		System.out.println("is file exist :- " + f1.exists());

		FileWriter fa = new FileWriter(f1);
		fa.write("hello");
		fa.flush();

		java.io.FileReader fr = new java.io.FileReader(f1);
		char[] MynewFile = new char[(int) f1.length()];
		fr.read(MynewFile);
		System.out.println("Content In my file is ");
		for (int i = 0; i < MynewFile.length; i++) {
			System.out.print(MynewFile[i]);

		}
	}
}
