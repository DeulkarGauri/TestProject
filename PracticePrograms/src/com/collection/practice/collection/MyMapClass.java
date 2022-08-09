package com.collection.practice.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

// this is an example of map
/*
 * MAP:-
 * map is an group of key and value pair
 * in map keys  are always unique 
 * null is not possible in map 
 * it is useful if you want to search delete , update  elements on the basis of keys
 * duplicate keys are not allowed 
 * value can be duplicate
 * hashmap and inkedhashmap allow null one time but
 * treeMap doesnt allow null key or value
 * mapcannot traversed  
 * so if you want traversed you have to cnvert it into set by using keysetset and emtry set
 * entry is subinterface of map
 */
public class MyMapClass {
	public static void main(String[] args) {
		// null are allowed
		System.out.println("main method...");

		Map<Integer, String> MyMap = new HashMap();
		MyMap.put(10, "ABCD");
		MyMap.put(null, "PQRS");
		MyMap.put(30, "STUV");
		MyMap.put(null, "WXYZ");
		System.out.println(MyMap);

		System.out.println("is contain........" + MyMap.get(30));

		for (Entry<Integer, String> emp : MyMap.entrySet()) {
			System.out.println("keys are:........" + emp.getKey());
			System.out.println("values are :---------" + emp.getValue());
		}
	}

}
