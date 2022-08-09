package com.collection.practice.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// this is an example of arraylist in which we perform many operation
/*
 * arraylist:-
 * it allow duplicates 
 * null insertion is possible
 * insertion order is preserved 
 * best choice for fast searching s
 */
public class MyArrayList {

	public static void main(String[] args) {

		System.out.println("Welcome......");

		ArrayList<String> MyList = new ArrayList(); // creating an list
		MyList.add("pink");
		MyList.add("red");
		MyList.add("black");
		MyList.add("green");
		MyList.add("indico");

		System.out.println("My first arraylist : " + MyList);

		List<String> mylist2 = new ArrayList<String>();
		mylist2.add("A");
		mylist2.add("B");
		mylist2.add("C");
		mylist2.add("D");
		mylist2.add("E");

		System.out.println("My second arraylist : " + mylist2);
		Collections.copy(mylist2, MyList); // this is for copy one arraylist to another array list
		/*
		 * for coping an element to another list
		 */
		System.out.println(" \n after copy " + "\n list 1 : " + MyList);
		System.out.println(" \n after copy " + "\n list 2 : " + mylist2);
		MyList.add(0, "White");
		/*
		 * for adding at positioned
		 */
		MyList.set(1, "yellow"); // add at patricular positioned

		System.out.println(MyList.remove(1)); // to remove an element
		/*
		 * for seraching element
		 */
		if (MyList.contains("blue")) {// to serach an element
			System.out.println("element found.....");
		} else {
			System.out.println("element are not present in list ");
		}
		/*
		 * this code for sorting
		 */
		System.out.println(" \n before sorting an list : " + "\n" + MyList);
		Collections.sort(MyList); // to sort an mylist
		System.out.println(" \n after sorting an list : " + "\n" + MyList);
		/*
		 * for shuffle
		 */
		System.out.println(" \n before shuffle " + "\n list 1 : " + MyList);

		Collections.shuffle(MyList); // to shuffle an list

		System.out.println(" \n after shuffle " + "\n list 1 : " + MyList);
		/*
		 * for increasing an size of arraylist
		 */
		System.out.println("\n before increasing size my list size will be : " + MyList.size());
		MyList.ensureCapacity(5);
		MyList.add("violet");
		System.out.println("\n after increasing size my kist sze will be : " + MyList.size());
		/*
		 * replace second element with specified element
		 */
		System.out.println("\n my original list will be ..... " + MyList);
		String new_color = "White";
		MyList.set(1, new_color);

		int num = MyList.size();
		System.out.println("Replace second element with 'White'.");
		for (int i = 0; i < num; i++) {
			System.out.println(MyList.get(i));
		}

		/*
		 * for reversing an list
		 */
		System.out.println(" \n before reversing  " + "\n my list  : " + MyList);
		Collections.reverse(MyList);
		System.out.println(" \n after  reversing " + "\n my list  : " + MyList);

		/*
		 * extract portion of arraylist
		 */
		System.out.println(" \n before extracting  " + "\n my list  : " + MyList);
		List<String> sublist = MyList.subList(0, 3);
		System.out.println(" \n after extracting  " + "\n my list  : " + sublist);

		/*
		 * 
		 * for swapping
		 */
		System.out.println(" \n my list before swapping : " + MyList);
		Collections.swap(MyList, 1, 4);

		System.out.println(" \nmy list after swapping : " + MyList);
		/*
		 * for adding one list to another list
		 */
		System.out.println(" \n adding one list to another ...............");
		ArrayList<String> mynewlist = new ArrayList<>();
		mynewlist.addAll(MyList);
		mynewlist.addAll(mylist2);

		System.out.println(mynewlist);
		/*
		 * for trim an array....
		 */
		System.out.println("\n List before trim ");
		MyList.trimToSize();
		System.out.println("\n after trim an list ......... " + MyList);
		/*
		 * clone of arraylist
		 */
		ArrayList<String> listtt = (ArrayList<String>) MyList.clone();
		System.out.println("\n my original list is : " + "\n " + MyList);
		System.out.println(" \n after cloniing an first arraylist" + "\n " + listtt);
		/*
		 * empty arraylist
		 */

		System.out.println("empty list");
		List<Object> aa = Collections.emptyList();
		System.out.println(aa);
		/*
		 * for retriving data
		 */
		System.out.println(" \n My Element At 2 index is ......" + MyList.get(2)); // for retriving element
		/*
		 * for printing list
		 */
		for (String string : MyList) {
			System.out.println("\n MyList Of Colors : " + string);
		}

	}

}
