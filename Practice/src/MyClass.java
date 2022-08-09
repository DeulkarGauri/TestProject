//how  to accessed private method from another class
class Test123{
	int id;
	String name;
	public Test123(int id, String name) {
		super();
		this.id = id;
		this.name = name;
		
	}
	protected void TestInfo() {
		System.out.println("my Name = "+ name + "\n my id = "+id );
	}
	
	
}
public class MyClass extends Test123 {

	public MyClass(int id, String name) {
		super(id, name);
		// TODO Auto-generated constructor stub
	}
	
	
	public static void main(String[] args) {
		System.out.println("....welcome to main class....");
		Test123 t1 = new Test123(10, "ABC");
		
		t1.TestInfo();
		
		
		
		
	}
}
