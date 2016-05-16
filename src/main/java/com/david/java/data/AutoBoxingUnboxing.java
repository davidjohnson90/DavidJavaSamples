/**
 * 
 */
package com.david.java.data;

/**
 * @author David
 *
 */
public class AutoBoxingUnboxing {
	public static void main(String[] args) {
		Integer integer = 100;
		int i = integer;
		System.out.println("Autoboxed i is : " + i + " from " + integer);

		Character character = 'a';
		char c = character;
		System.out.println("Autoboxed c is : " + c + " from " + character);

		Integer iob;
		iob = 100;
		System.out.println(++iob);
	}
}
