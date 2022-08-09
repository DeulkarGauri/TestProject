package com.collection.college.info;

class Automobile {
	private String Driver() {
		return "Driving vehical";

	}
}

class car extends Automobile {
	protected String Driver() {
		return "Driving car ... ";

	}
}

public class ElectricCar extends car {

	@Override
	public final String Driver() {
		// TODO Auto-generated method stub
		return "driving Electric Car ";
	}

	public static void main(String[] args) {
		final car car1 = new ElectricCar();
		System.out.print(car1.Driver());
	}
}
