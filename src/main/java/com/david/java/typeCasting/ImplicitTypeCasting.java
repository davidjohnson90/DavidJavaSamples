package com.david.java.typeCasting;

/**
 * Automatic or Widening Type casting take place when, the two types are compatible the
 * target type is larger than the source type
 * 
 * @author David
 *
 */
public class ImplicitTypeCasting {
	public static void main(String[] args) {
		int i = 100;
		long l = i; // no explicit type casting required
		float f = l; // no explicit type casting required
		System.out.println("Int value " + i);
		System.out.println("Long value " + l);
		System.out.println("Float value " + f);
	}
}
