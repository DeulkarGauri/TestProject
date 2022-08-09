package serialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Animal implements Serializable {

	String s = "Dog";
	String s1 = "cat";
	int total_animal = 2;

}

public class serializationClass {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		System.out.println("serialization.......");
		File dir = new File("Animal.Details");
		dir.mkdir();
		File fi = new File(dir, "information.txt");
		fi.createNewFile();

		Animal a1 = new Animal();

		FileOutputStream fos = new FileOutputStream(fi);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(a1);

		FileInputStream fis = new FileInputStream(fi);
		ObjectInputStream ois = new ObjectInputStream(fis);
		Animal a2 = (Animal) ois.readObject();
		System.out.println(a2.s + " \n" + a2.s1 + " \n" + a2.total_animal);

	}
}
