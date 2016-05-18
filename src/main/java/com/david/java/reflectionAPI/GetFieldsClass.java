/**
 * 
 */
package com.david.java.reflectionAPI;

import java.lang.reflect.Field;

/**
 * @author David
 *
 */
public class GetFieldsClass {
	public static void main(String[] args) {
		try {
			Class<?> c = Class.forName(TestFields.class.getName());
			Field[] field = c.getFields();
			for (int i = 0; i < field.length; i++) {
				System.out.println("The field is " + field[i]);
			}
			Field[] declaredField = c.getDeclaredFields();
			for (int i = 0; i < declaredField.length; i++) {
				System.out.println("The declared field is " + declaredField[i]);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

class TestFields {
	public String name;
	int rollNo;
}