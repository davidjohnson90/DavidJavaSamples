/**
 * 
 */
package com.david.java.classInitialization;

/**
 * Object field initializers are sufficient for the initialization of object
 * fields. However, they prove inadequate for more complex object
 * initialization. To parallel class block initializers, Java supports the
 * object block initializer. An object block initializer consists of an open
 * brace character ({), initialization code, and a close brace character (}).
 * Furthermore, an object block initializer appears within a class but not
 * within any of that class's methods
 * 
 * @author David
 *
 */
@SuppressWarnings("unused")
public class ObjectBlockComplexInitializer {
	{
		System.out.println("Initializing object " + hashCode());
		int localVariable = 1;
	}

	ObjectBlockComplexInitializer(String msg) {
		System.out.println(msg);
		// System.out.println(localVariable);
	}

	public static void main(String[] args) {
		ObjectBlockComplexInitializer initializer1 = new ObjectBlockComplexInitializer("1");
		ObjectBlockComplexInitializer initializer2 = new ObjectBlockComplexInitializer("2");
	}
}
