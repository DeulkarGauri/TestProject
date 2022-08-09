
public class MyfirstArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
	System.out.println("main Method starts here : ");

	int A1 [] = {1, 2, 3, 4, 5, 7};
	int A2 [] = new int [A1.length];
	
	for(int i= 0 ; i<A1.length;i++) {
		A2 = A1;
	}
	System.out.println("original Array ");
for(int i=0;i<A1.length;i++) {
	
	System.out.print(A1[i]);
}
System.out.println();
System.out.println("new Array ");
for(int i=0;i<A1.length;i++) {
	
	System.out.print(A2[i]);
}
	}

}
