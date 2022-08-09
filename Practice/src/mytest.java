
public class mytest {

	public void m1(String s) {
		System.out.println(" String Version");
	}
	public void m1(StringBuffer s ) {
		System.out.println("Stringbuffer version ");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
mytest t1 = new mytest();
t1.m1("raju");
t1.m1("null" );

	}

}
