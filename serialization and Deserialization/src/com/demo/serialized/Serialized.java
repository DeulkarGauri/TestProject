package com.demo.serialized;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Set;
import java.util.TreeSet;

class Showroom implements Serializable {
	String Name;
	int total_Bike;

	public Showroom(String name, int total_Bike) {
		super();
		Name = name;
		this.total_Bike = total_Bike;
	}

	@Override
	public String toString() {
		return "Showroom Name = " + Name + ", total_Bike=" + total_Bike + " ";
	}

}

public class Serialized {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		System.out.println("main method.....");
		Showroom s1 = new Showroom("Yamahha", 1000001);

		Set<Integer> set = new TreeSet<>();
		set.add(10);
		set.add(null);

		set.add(20);

		System.out.println("set element :-   " + set);

		File f1 = new File("abc.txt");
		f1.createNewFile();

		FileOutputStream fos = new FileOutputStream(f1);
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(s1);

		FileInputStream fis = new FileInputStream(f1);
		ObjectInputStream ois = new ObjectInputStream(fis);
		Showroom sh = (Showroom) ois.readObject();
		System.out.println(sh);
	}
}
