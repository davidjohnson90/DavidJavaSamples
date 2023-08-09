package com.david.java.classinitialization;

import java.io.File;

/**
 * Although sufficient for class field initialization, class field initializers
 * prove inadequate for more complex class initialization. For example, suppose
 * you need to read a file's contents into a buffer before the main() method
 * executes. What do you do? Java meets that challenge by providing the class
 * block initializer. The class block initializer consists of the keyword static
 * followed by an open brace character ({), initialization code, and a close
 * brace character (}). Furthermore, a class block initializer appears within a
 * class, but not within any of that class's methods.
 * <p>
 * author David
 */
public class ClassBlockInitializers {
    // Static String array to store filenames
    static String[] filenames;

    // Class block initializer
    static {
        // Perform complex class initialization
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
