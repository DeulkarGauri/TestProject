import java.io.IOException;
import java.util.Arrays;
// returning an array from  a method  
import com.array.MyArray;

public class College {

  int[] array () {
     int [] a = new int[100];
     
		for(int i =0;i<a.length;i++) {
		if(a[i]%10 == 0) {
			System.out.println(a);
		}else {
			System.out.println("no are not divisible");
		}
		}
    return a;
	}
  
	public static void main(String[] args)throws IOException{
		// TODO Auto-generated method stub
System.out.println("main method");
College c1 = new College();

System.out.println("given array is " +Arrays.toString(c1.array()) );
System.out.println("my class object = "+ c1.getCollegeObject());
	}

	public College getCollegeObject() {
		College c1 = new College();
		return c1;
		
		
	}

}
