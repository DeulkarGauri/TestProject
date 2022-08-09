package com.lambda.ex;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

class Test {

	int id;
	String Name;
	int Age;

	public Test(int id, String name, int age) {
		super();
		this.id = id;
		Name = name;
		Age = age;

	}
}

public class LambdaComparator {
	public static void main(String[] args) {
		System.out.println("Example for comparator...");

		List<Test> list = new ArrayList<Test>();
		list.add(new Test(101, "priti", 18));
		list.add(new Test(102, "switi", 25));
		list.add(new Test(103, "manuu", 23));
		list.add(new Test(104, "ruchi", 34));
		list.add(new Test(105, "praju", 12));
		list.add(new Test(106, "aysha", 27));

		// sorting on the basis of age..

		// Collections.sort(t1, (p1,p2)->{
		// return p1.Age.compar
		//
		// });
		// Collections.sort(list, (p1, p2) -> {
		// return p1.Name.compareTo(p2.Name);
		// });
		// for (Test test : list) {
		// System.out.println(test.id + " " + test.Name + " " + test.Age);
		// }

		Stream<Test> filtered_data = list.stream().filter(p -> p.Age > 20);

		// filtered_data.forEach(product -> System.out.println(product.name+":
		// "+product.price));
		filtered_data.forEach(product -> System.out.println("\n " + product.Name + ": " + product.Age));
	}

}
