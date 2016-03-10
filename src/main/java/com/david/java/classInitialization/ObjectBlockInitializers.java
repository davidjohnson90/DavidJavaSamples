/**
 * 
 */
package com.david.java.classInitialization;

/**
 * As with class fields, some programs require object fields to refer to
 * previously declared object fields. Java supports that activity by allowing
 * you to specify the name of a previously declared object field in the
 * expression portion of a subsequently declared object field's initializer.
 * However, just as you cannot use forward references with class field
 * initializers, you cannot use forward references with object field
 * initializers
 * 
 * @author David
 *
 */
public class ObjectBlockInitializers {
	int first = 3;
	int second = 1 + first;
	// int forwardReference = first;

	public static void main(String[] args) {

		ObjectBlockInitializers objectBlockInitializers = new ObjectBlockInitializers();
		System.out.println("objectBlockInitializers.first = " + objectBlockInitializers.first);
		System.out.println("objectBlockInitializers.second = " + objectBlockInitializers.second);
	}
}
