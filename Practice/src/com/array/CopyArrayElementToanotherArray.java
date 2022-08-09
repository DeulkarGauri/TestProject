package com.array;
// coping array element to another array 

public class CopyArrayElementToanotherArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int Array1 [] = {1, 2, 3, 4, 5};
int Array2 [] = new int[Array1.length];

//coping Array element to another array
for(int i =0; i<Array1.length; i++) {
	Array2  = Array1;
	
}
System.out.println(" original Array : ");
for(int i=0;i<Array1.length;i++) {
	System.out.print(Array1[i] + " ");
}
System.out.println();

System.out.println("new array will be ");

for(int i=0; i<Array2.length; i++) {
System.out.print(Array2[i] + " ");	
}
	}

}
