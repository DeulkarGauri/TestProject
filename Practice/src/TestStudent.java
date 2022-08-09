
public class TestStudent {

	int id;
	String s1;
	
	void insertRecord(int A , String B ) {
		 id = A;
		 s1 = B ;
		
	}
	void DisplayMessage() {
		System.out.println(id + " "+ s1);
	}
	public static void main(String[] args) {
		System.out.println("main method starts ");
	TestStudent t1 = new TestStudent();
	TestStudent t2 = new TestStudent();
	t1.insertRecord(10, "Abc");
	t2.insertRecord(20, "xyz");
	t1.DisplayMessage();
	t2.DisplayMessage();
	}
}
