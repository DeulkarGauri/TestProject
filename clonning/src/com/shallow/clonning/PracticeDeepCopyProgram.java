package com.shallow.clonning;

class DeepCopy implements Cloneable {

	String name;

	public DeepCopy(String name) {
		super();

		this.name = name;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

}

public class PracticeDeepCopyProgram implements Cloneable {
	int id;
	String name;
	DeepCopy d1;

	public PracticeDeepCopyProgram(int id, String name, DeepCopy d1) {
		super();
		this.id = id;
		this.name = name;
		this.d1 = d1;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		PracticeDeepCopyProgram pdp = (PracticeDeepCopyProgram) super.clone();
		pdp.d1 = (DeepCopy) d1.clone();
		return pdp;
	}

	public static void main(String[] args) throws CloneNotSupportedException {
		System.out.println(" *** inside PracticeDeepCopyProgram *** ");
		DeepCopy dp = new DeepCopy("Deulkar");

		PracticeDeepCopyProgram p1 = new PracticeDeepCopyProgram(101, "Sakshi", dp);
		PracticeDeepCopyProgram p2 = (PracticeDeepCopyProgram) p1.clone();

		System.out.println("before changing ");
		System.out.println("p1 id before changing " + p1.id);
		p2.id = 1001;

		System.out.println("after changing ");
		System.out.println("p1 id  " + p1.id);

		System.out.println("************");
		System.out.println("before changing ");
		System.out.println("p1 name " + p1.d1.name);
		p2.d1.name = "thakre";
		System.out.println("after changing ");
		System.out.println("p1 name " + p1.d1.name);

	}

}
