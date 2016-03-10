/**
 * 
 */
package com.david.java.classInitialization;

import java.io.File;

/**
 * Although sufficient for class field initialization, class field initializers
 * prove inadequate for more complex class initialization. For example, suppose
 * you need to read a file's contents into a buffer before the main() method
 * executes. What do you do? Java meets that challenge by providing the class
 * block initializer. A class block initializer consists of keyword static
 * followed by an open brace character ({), initialization code, and a close
 * brace character (}). Furthermore, a class block initializer appears within a
 * class, but not within any of that class's methods
 * 
 * @author David
 *
 */
public class ClassBlockInitializers {
	static String[] filenames;

	static {
		System.out.println("Acquiring filenames");
		filenames = new File(".").list();
		System.out.println("Filenames acquired");
	}

	public static void main(String[] args) {
		System.out.println("Displaying filenames\n");
		for (int i = 0; i < filenames.length; i++)
			System.out.println(filenames[i]);
	}
}
