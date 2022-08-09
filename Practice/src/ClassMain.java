
class ParentClass{
	static int id;
	static String Desc;
	
	public ParentClass(int id, String desc) {
		super();
		this.id = id;
		Desc = desc;
	}
	static void PrintParentDesription() {
		System.out.println("My Parent Class id is : "+ id + " And Desc is ..> "+ Desc );	
	}
}
class childclass{
	static int id;
	static String Desc;
	public childclass(int id, String desc) {
		super();
		this.id = id;
		Desc = desc;
	}
	
	 void PrintChildDesription() {
		System.out.println("My Child Class id is : "+ id + " And Desc is ..> "+ Desc );	
	}
}
public class ClassMain {
	   ParentClass getParentDescription( int id , String Desc) {
		 ParentClass p1 = new ParentClass(id  , Desc);
		 
	     return p1 ;
		 }
	  childclass getchildDescription( int id , String Desc){
		 childclass c1 = new childclass(id, Desc);
		return c1;
		 
	 }
    public static void main(String[] args) {
	System.out.println("Main method of main class1  ");
	ClassMain p1 = new ClassMain();
	
	ParentClass  a = p1.getParentDescription(50, " STU");
 System.out.println("My id is " +a.id   + " and Description is "+  a.Desc);
 childclass b = p1.getchildDescription(60, " PQR");
 System.out.println("My id is " + b.id   +  " and Description is "+ b.Desc);
}
}
