package com.david.java.typeCasting;

/**
 * Explicit or Narrowing type casting take place, when you are assigning a
 * larger type value to a variable of smaller type
 * 
 * @author David
 *
 */
public class ExplicitTypeCasting {
	public static void main(String[] args) {
		double d = 100.04;
		long l = (long) d; // explicit type casting required
		int i = (int) l; // explicit type casting required
		System.out.println("Double value " + d);
		System.out.println("Long value " + l);
		System.out.println("Int value " + i);
	}
}
