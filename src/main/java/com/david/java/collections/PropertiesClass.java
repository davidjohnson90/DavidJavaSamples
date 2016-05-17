/**
 * 
 */
package com.david.java.collections;

import java.util.Properties;
import java.util.Set;

/**
 * @author David
 *
 */
public class PropertiesClass {
	public static void main(String[] args) {
		Properties properties = new Properties();
		properties.put("C", "Dennis Ritchie");
		properties.put("C++", "Bjarne Stroustrup");
		properties.put("C#", "Microsoft Inc.");
		properties.put("Java", "James Ghosling");

		Set<Object> set = properties.keySet();

		for (Object object : set) {
			System.out.println(object + " was created by "
					+ properties.getProperty((String) object));
		}
	}
}