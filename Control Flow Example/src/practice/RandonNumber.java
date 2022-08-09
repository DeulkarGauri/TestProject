package practice;

import java.io.Serializable;

public class RandonNumber implements Serializable {

	public static void main(String[] args) {
		System.out.println("here programs starts ......");

		RandonNumber rn = new RandonNumber();

		// System.out.println("1st number:----" + Math.addExact(10, 20));
		// System.out.println("2st number:----" + Math.PI);
		// System.out.println("3st number:----" + Math.random());
		// System.out.println("4st number:----" + Math.random());

		System.out.println("my numbers are ");
		for (int i = 0; i <= 10; i++) {
			System.out.print(i+"    ");
		}

	}
}
