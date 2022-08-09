package com.shallow.clonning;
/*
 * if our our class has another class field then 
 * override a clone method 
 * so seperate object will be created for seperate references 
 * so that if we change s1 name then it will not change the s2 name 
 * that process are called as deep clonning 
 * by default in our program shallow clonning will be happen 
 * 
 */
class jungle implements Cloneable{
	//creating one instance variable 
	String name ;
	//creating constructor 
	public jungle(String name) {
		super();
		this.name = name;
	}
	// overriding an clone method of object class so it call to our class method not to object class
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
}
public class Safari implements Cloneable{
	//creating  instance variable 
	int id;
	String name ;
	//add field of another class.
	jungle jun_name;
	//creating constructor 
	public Safari(int id, String name, jungle jun_name) {
		super();
		this.id = id;
		this.name = name;
		this.jun_name = jun_name;
	}
	// overriding an clone method of object class so it call to our class method not to object class
@Override
protected Object clone() throws CloneNotSupportedException {
	// TODO Auto-generated method stub
	Safari s_saf = (Safari)super.clone();

	s_saf.jun_name = (jungle)jun_name.clone();
	return s_saf;
}

	public static void main(String[] args) throws CloneNotSupportedException{
	
		System.out.println("Main method starts here: ");
		jungle j1 = new jungle("wild");
		
		Safari s1 = new Safari(10, "RAM" , j1);
		//used clone method of object class 
		/* to used clone method of object class:-
		 * first throws an exception to main method 
		 * then implement cloneable interface
		 * 
		 */
		Safari  s2 = (Safari)s1.clone();
		s2.id = 20;
		
		System.out.println("s1 ------> "+s1.id);
	    System.out.println("s2 -------> "+s2.id);
	    
	    System.out.println("s1 of jungle name --> "+s1.jun_name.name);
		s2.jun_name.name = "lion";
	    System.out.println("s1 of new jungle name --> "+s1.jun_name.name);
	   
	}
}
