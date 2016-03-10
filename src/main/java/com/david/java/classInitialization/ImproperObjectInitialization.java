/**
 * 
 */
package com.david.java.classInitialization;

/**
 * a superclass object field/block initializer can access a field in a subclass.
 * However, allowing that behavior is not a good idea because superclass
 * initialization occurs before subclass initialization -- and the subclass
 * fields thus contain only default values. Therefore, superclass initializer
 * access to subclass fields produces incorrect results.
 * 
 * @author David
 *
 */
public class ImproperObjectInitialization extends ImproperObjectParent {
	int a = 2;

	public static void main(String[] args) {
		new ImproperObjectInitialization();
	}
}

class ImproperObjectParent {
	{
		System.out.println("a = " + ((ImproperObjectInitialization) this).a);
	}
}