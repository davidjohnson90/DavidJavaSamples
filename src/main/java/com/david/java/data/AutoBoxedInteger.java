package com.david.java.data;

/**
 * @author David
 *
 */
public class AutoBoxedInteger {
	public static void main(String args[]) {
		// When we assign an integer value to an Integer object, the value is
		// autoboxed into an Integer object
		Integer x = 400, y = 400;
		if (x == y)
			System.out.println("Same");
		else
			System.out.println("Not Same");

		// In Java, values from -128 to 127 are cached, so the same objects are
		// returned. The implementation of valueOf() uses cached objects if the
		// value is between -128 to 127
		Integer a = 40, b = 40;
		if (a == b)
			System.out.println("Same");
		else
			System.out.println("Not Same");

		// If we explicitly create Integer objects using new operator, we get
		// the output as â€œNot Sameâ€?
		Integer c = new Integer(40), d = new Integer(40);
		if (c == d)
			System.out.println("Same");
		else
			System.out.println("Not Same");

		// In the above case, if we use value of, then the output is same.
		if (Integer.valueOf(c) == Integer.valueOf(d))
			System.out.println("Same");
		else
			System.out.println("Not Same");
	}
}
