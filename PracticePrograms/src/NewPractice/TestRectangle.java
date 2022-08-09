package NewPractice;

import java.util.Scanner;

class Rectangle {
	int nextint;
	int nextint2;

	public Rectangle(int nextint, int nextint2) {
		// TODO Auto-generated constructor stub
	}

	public int area() {
		// TODO Auto-generated method stub
		int area = (nextint * nextint2);
		return area;
	}

	public String perimeter() {
		// TODO Auto-generated method stub
		return null;
	}

	public Object digonal() {
		// TODO Auto-generated method stub
		return null;
	}

}

public class TestRectangle {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("\nEnter length and bredth of Rectangle : ");

		// Rectangle r1 = new Rectangle(sc.nextint(), sc.nextint());
		Rectangle r1 = new Rectangle(sc.nextInt(), sc.nextInt());

		System.out.println("Area of Rectangle	:  " + r1.area());
		System.out.println("Perimeter of rectangle	:  " + r1.perimeter());
		System.out.println("Digonal of rectangle	:  " + String.format("%.4f", r1.digonal()));

		sc.close();
	}
}
