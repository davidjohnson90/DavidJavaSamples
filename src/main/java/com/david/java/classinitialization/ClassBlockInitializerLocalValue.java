package com.david.java.classinitialization;

/**
 * When working with class block initializers, keep in mind two more items:
 * First, any variable that you declare in a class block initializer is local to
 * that block. No code outside the block can access the variable.
 * Second, Java permits you to declare a constant class field without a class field
 * initializer as long as you explicitly initialize that constant in a class
 * block initializer. Furthermore, within the class block initializer, you must
 * initialize the constant before you attempt to read its value.
 * <p>
 * author David
 */
public class ClassBlockInitializerLocalValue {
    // Constant class field declaration
    final static double PI;

    // Class block initializer
    static {
        // Initializing the constant class field PI
        PI = 3.14159;

        // Example of using a local variable within the class block initializer
        int i;
        for (i = 0; i < 5; i++)
            System.out.println(i);
    }

    // Static int j = i; // Error: i is a local variable and cannot be accessed outside the block

    public static void main(String[] args) {
        System.out.println("PI = " + PI);
    }
}
