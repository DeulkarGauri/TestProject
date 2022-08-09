package com.Shworoom;

public class Bike {

	String Name ;
	int Bike_num;
	String Colour;
	int Prize;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bike B1 = new Bike("shine" , 1234,"black" , 90000);
		Bike B2 = new Bike("Activa ", 4567, "White", 90000);
		System.out.println(B1==B2);
		System.out.println(B1.equals(B2));
		System.out.println("Bike Name = " + B1.Name + ", Bike_num =" + B1.Bike_num + ", Colour =" + B1.Colour + ", Prize =" + B1.Prize + "");
		System.out.println("Bike Name = " + B2.Name + ", Bike_num =" + B2.Bike_num + ", Colour =" + B2.Colour + ", Prize =" + B2.Prize + "");
		
	}

	@Override
	public String toString() {
		return "Bike [Name=" + Name + ", Bike_num=" + Bike_num + ", Colour=" + Colour + ", Prize=" + Prize + "]";
	}

	public Bike(String name, int bike_num, String colour, int prize) {
		super();
		Name = name;
		Bike_num = bike_num;
		Colour = colour;
		Prize = prize;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Prize;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bike other = (Bike) obj;
		if (Prize != other.Prize)
			return false;
		return true;
	}

}
