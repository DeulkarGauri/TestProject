
public class Student {
	
	static String name;  // initilisation and declaration
	int id;     // initilisation of variable
	
	public Student(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}

	public static void main(String[] args) {
		System.out.println("main method starts here: ");
		 Student s1 = new Student("abc",10);
		System.out.println("student_name is="+name);
		System.out.println("student_id is ="+s1.id);
	}
}
