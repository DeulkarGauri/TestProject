package com.String;

public class Student {
	// To String Method
	 @Override
	public String toString() {
		return "Student [id=" + id + ", roll_num=" + roll_num + "]";
	}
	int id ;             
	 int roll_num ;      
	 //create an constructor using fields 
	 public Student(int id, int roll_num) {
		super();
		this.id = id;
		this.roll_num = roll_num;
	}
    @Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		result = prime * result + roll_num;
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
		Student other = (Student) obj;
		if (id != other.id)
			return false;
		if (roll_num != other.roll_num)
			return false;
		return true;
	}
    
	// Main Method Started
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     System.out.println(" Main Started Here : ");
   Student S1 = new Student ( 101 , 1001);
   Student S2 = new Student(102 , 1003);
   System.out.println(" The Student Id Is "+(S1==S2));      
  System.out.println(" The Student Id Is "+S1.equals(S2));  
  System.out.println(" By Using toString() method We Have");
  System.out.println( "First Student id=" +S1. id + ",And  roll_num is =" + S1.roll_num + "]");
 System.out.println ("Second Student id=" + S2.id + ",And  roll_num is + " +S2. roll_num + "" );
	
	
   }

}
