package com.custom.markerinterface;

public class Entity implements Deletable {
	// implementation Details
	int id;

	public Entity(int id) {
		super();
		this.id = id;
	}

	public static void main(String[] args) {
		System.out.println("here we start");

		Entity e1 = new Entity(10);
		System.out.println("id is " + e1.id);

		System.out.println();
		ShapeDao s1 = new ShapeDao();
		s1.Delete(e1);
		System.out.println("id is " + e1.id);

		System.out.println("end...");

	}

}
