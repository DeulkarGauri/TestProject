package arrayIndexoutofboundException;

public class ArrayException {
	static int a[] = new int[5];
	static int ar[] = { 1, 2, 3 };

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// for (int i = 0; i <=ar.length; i++) {
		// System.out.print(ar[i]);
		// }
		System.out.println("first = " + ar[0]);
		System.out.println("second =  " + ar[1]);
		System.out.println("third  = " + ar[2]);

		System.out.println("resources end here");

		try {
			System.out.println("fourth= " + ar[3]);
		}

		catch (Exception e) {
			// TODO: handle exception
			System.out.println("handle the exception");
		} finally {
			System.out.println("resources end here");
		}

	}

}
