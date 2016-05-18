/**
 * 
 */
package com.david.java.reflectionAPI;

/**
 * @author David
 *
 */
public class ForName {

	public static void main(String[] args) throws ClassNotFoundException {
		Class<?> c = Class.forName("com.david.java.reflectionAPI.TestClass");
		System.out.println(c.getName() + " " + TestClass.class.getName());
	}
}

class TestClass {
}