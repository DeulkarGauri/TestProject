package Com.Array;

public class SecondSmallElement {
	public static void main(String[] args) {

		System.out.println("second small element...");
		int a[] = { 22, 5, 6, 88, 9 };
		int min = a[0];
		int secmin = a[0];
		int max = a[0];
		int SecMax = a[0];

		System.out.println("array elemnts are : ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " , ");
		}
		for (int i = 0; i < a.length; i++) {
			if (a[i] < min) {
				secmin = min;
				min = a[i];
			} else if (a[i] < secmin) {
				secmin = a[i];

			}
		}
		System.out.println("\n smallest vale --------->" + min);
		System.out.println("second samll value ----->" + secmin);

		for (int i = 0; i < a.length; i++) {
			if (a[i] > max) {
				SecMax = max;
				max = a[i];

			} else if (a[i] > SecMax) {
				SecMax = a[i];
			}
		}
		System.out.println("\n Maximum value ---------> " + max);
		System.out.println("Second highest value is----->  " + SecMax);
	}
}
