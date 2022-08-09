package com.IMP.Program;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ArrayToString {

	public static void main(String[] args) {
		System.out.println("main method starts here.....");
		String[] stringArray = { "My " + "Name " + "is" + " gauri !!!" };
		// 1. Using the Arrays.toString() method
		String string1 = convertArrayToStringUsingToString(stringArray);
		System.out.println("An array converted to string using Arrays.toString(): " + string1);

		// 2. Using the StringBuilder.append() method
		String string2 = convertArrayToStringUsingAppend(stringArray);
		System.out.println("An array converted to string using StringBuilder.append(): " + string2);

		// 3. Using the String.join() method
		String string3 = convertArrayToStringUsingJoin(stringArray);
		System.out.println("An array converted to string using String.join(): " + string3);

		// 4. Using the Collectors.joining() method
		String string4 = convertArrayToStringUsingJoining(stringArray);
		System.out.println("An array converted to string using Collectors.joining(): " + string4);
	}

	// 1. Using the Arrays.toString() method
	public static String convertArrayToStringUsingToString(String[] stringArray) {
		return Arrays.toString(stringArray);
	}

	// 2. Using the StringBuilder.append() method
	public static String convertArrayToStringUsingAppend(String[] stringArray) {
		StringBuilder stringBuilder = new StringBuilder();

		for (int i = 0; i < stringArray.length; i++) {
			stringBuilder.append(stringArray[i]);
		}
		return stringBuilder.toString();
	}

	// 3. Using the String.join() method
	public static String convertArrayToStringUsingJoin(String[] stringArray) {
		String str = String.join(" ", stringArray);
		return str;
	}

	// 4. Using the Collectors.joining() method
	public static String convertArrayToStringUsingJoining(String[] stringArray) {
		String str = Arrays.stream(stringArray).collect(Collectors.joining());
		return str;
	}
}
