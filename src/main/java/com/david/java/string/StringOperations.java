/**
 * 
 */
package com.david.java.string;

/**
 * @author David
 *
 */
public class StringOperations {
	static String string = "Hello";
	static String string1 = "Hello";
	static String string2 = "David";

	public static void main(String[] args) {
		concatenationString();
		plusOperator();
		equalsMethod();
		equalToMethod();
		compareToMethod();
		stringClassFunction();
	}

	/**
	 * 
	 */
	private static void concatenationString() {
		String string3 = string1.concat(string2);
		String string4 = "Hello".concat("David");
		System.out.println("The concatenated strings are: " + string3 + " and "
				+ string4);
	}

	/**
	 * 
	 */
	private static void plusOperator() {
		String string5 = string1 + string2;
		String string6 = "Hello" + "David";
		System.out.println("The plus operated strings are: " + string5
				+ " and " + string6);
	}

	/**
	 * 
	 */
	private static void equalsMethod() {
		System.out.println(string.equals(string1));
		System.out.println(string.equals(string2));
	}

	/**
	 * 
	 */
	private static void equalToMethod() {
		System.out.println(string == string1);
		System.out.println(string == string2);
	}

	/**
	 * 
	 */
	private static void compareToMethod() {
		System.out.println(string.compareTo(string2));
		System.out.println(string.compareTo(string1));
		System.out.println(string2.compareTo(string));
	}

	/**
	 * 
	 */
	private static void stringClassFunction() {
		System.out.println(string.charAt(0));
		System.out.println(string.compareToIgnoreCase("HELLO"));
		System.out.println(string.length());
		System.out.println(string.replace("H", "h"));
		System.out.println(string.substring(2));
		System.out.println(string.substring(1, 2));
		System.out.println(string.toLowerCase());
		System.out.println(string2);
		System.out.println(string.toString());
		System.out.println(string.toUpperCase());
		System.out.println(string.trim());
	}

}