/**
 * 
 */
package com.david.java.reflectionAPI;

import java.lang.reflect.Method;

/**
 * @author David
 *
 */
public class GetMethodsClass {
	public static void main(String[] args) {
		try {
			Class<?> c = Class
					.forName("com.david.java.reflectionAPI.TestMethod");
			Method[] method = c.getMethods();
			for (int i = 0; i < method.length; i++) {
				System.out.println("The method is " + method[i]);
			}
			Method[] declaredMethod = c.getDeclaredMethods();
			for (int i = 0; i < declaredMethod.length; i++) {
				System.out.println("The declared method is "
						+ declaredMethod[i]);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

class TestMethod {
	public void show() {
	}

	void display() {
	}
}
