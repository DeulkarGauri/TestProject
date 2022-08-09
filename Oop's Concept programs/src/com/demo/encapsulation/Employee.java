package com.demo.encapsulation;

/*encapsulation:- 
 * in java encapsulation is a mechanism of  wrapping up data and code acting on the data 
 * together in single unit is known as encapsulation.
 * There are two way to achieve encapsulation:-
 * A) keep the variable private.
 * B) and use the getter() and setter() method to modify and view the data.
 * Data Hiding :- Making an variable private of the class 
 * i.e hiding that variable from other class is known as data hiding.
 * A Data hidning play an important role in encapsulation.
 * 
 * */
public class Employee {

	 private static  int emp_id;
	 private String name;
	 
	 public static void setemp_id(int emp_id1) {
		 emp_id = emp_id1;
	 }
	 public static  int  getemp_id() {
		 return emp_id;
		 
	 }
	 
	 public  void setname(String name1) {
		 name = name1;
	 }
	 public   String  getname() {
		 return name;
		 
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("main method starts");
Employee e1 = new Employee();
e1.setname("ERA");
setemp_id(101);

System.out.println("employee name is = "+e1.getname());
System.out.println("employee id is = "+getemp_id());

	}

}
