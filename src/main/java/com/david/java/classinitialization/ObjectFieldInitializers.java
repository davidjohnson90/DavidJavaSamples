package com.david.java.classinitialization;

/**
 * The explicit initialization of object fields to values. Each object field
 * explicitly initializes to a value via an object field initializer.
 * <p>
 * In this example, we have a class ObjectFieldInitializers that contains several object
 * fields of different data types. Each object field is explicitly initialized with a
 * specific value directly in its declaration.
 * <p>
 * The main method creates an instance of ObjectFieldInitializers and prints the values
 * of all the object fields.
 * <p>
 * Author: David
 */
public class ObjectFieldInitializers {
    boolean b = true;
    byte by = 1;
    char c = 'A';
    double d = 1.2;
    float f = 3.4f;
    int i = 2;
    long l = 3;
    short s = 4;
    String st = "abc";

    /**
     * The main method of the ObjectFieldInitializers class.
     *
     * @param args The command-line arguments.
     */
    public static void main(String[] args) {
        // Create an instance of ObjectFieldInitializers.
        ObjectFieldInitializers objectFieldInitializers = new ObjectFieldInitializers();
        // Print the values of all the object fields.
        System.out.println("objectFieldInitializers.b = " + objectFieldInitializers.b);
        System.out.println("objectFieldInitializers.by = " + objectFieldInitializers.by);
        System.out.println("objectFieldInitializers.c = " + objectFieldInitializers.c);
        System.out.println("objectFieldInitializers.d = " + objectFieldInitializers.d);
        System.out.println("objectFieldInitializers.f = " + objectFieldInitializers.f);
        System.out.println("objectFieldInitializers.i = " + objectFieldInitializers.i);
        System.out.println("objectFieldInitializers.l = " + objectFieldInitializers.l);
        System.out.println("objectFieldInitializers.s = " + objectFieldInitializers.s);
        System.out.println("objectFieldInitializers.st = " + objectFieldInitializers.st);
    }
}
