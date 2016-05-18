/**
 * 
 */
package com.david.java.reflectionAPI;

import java.lang.reflect.Constructor;

/**
 * @author David
 *
 */
public class GetConstructorsClass {
	public static void main(String[] args) {
		try {
			Class<?> c = Class
					.forName("com.david.java.reflectionAPI.TestConstructor");
			Constructor<?>[] constructors = c.getConstructors();
			for (int i = 0; i < constructors.length; i++) {
				System.out.println("The constructor is " + constructors[i]);
			}

			Constructor<?>[] declaredConstructors = c.getDeclaredConstructors();
			for (int i = 0; i < declaredConstructors.length; i++) {
				System.out.println("The declared constructor is "
						+ declaredConstructors[i]);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

class TestConstructor {
	/**
	 * 
	 */
	public TestConstructor() {
	}

	public TestConstructor(String name) {
	}
}