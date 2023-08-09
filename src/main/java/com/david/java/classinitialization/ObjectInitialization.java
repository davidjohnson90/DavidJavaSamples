package com.david.java.classinitialization;

/**
 * The initializers that perform object initialization mirror those initializers
 * that perform class initialization. As with class initialization, the simplest
 * kind of object initialization is automatic initialization of object fields to
 * default values.
 * <p>
 * In this example, we have a class ObjectInitialization that contains several object
 * fields of different data types. Since we haven't explicitly initialized these fields,
 * they will be automatically initialized to their respective default values.
 * <p>
 * The main method creates an instance of ObjectInitialization and prints the values
 * of all the object fields.
 * <p>
 * Author: David
 */
public class ObjectInitialization {
    boolean b;
    byte by;
    char c;
    double d;
    float f;
    int i;
    long l;
    short s;
    String st;

    /**
     * The main method of the ObjectInitialization class.
     *
     * @param args The command-line arguments.
     */
    public static void main(String[] args) {
        // Create an instance of ObjectInitialization.
        ObjectInitialization objectInitialization = new ObjectInitialization();
        // Print the values of all the object fields.
        System.out.println("objectInitialization.b = " + objectInitialization.b);
        System.out.println("objectInitialization.by = " + objectInitialization.by);
        System.out.println("objectInitialization.c = " + objectInitialization.c);
        System.out.println("objectInitialization.d = " + objectInitialization.d);
        System.out.println("objectInitialization.f = " + objectInitialization.f);
        System.out.println("objectInitialization.i = " + objectInitialization.i);
        System.out.println("objectInitialization.l = " + objectInitialization.l);
        System.out.println("objectInitialization.s = " + objectInitialization.s);
        System.out.println("objectInitialization.st = " + objectInitialization.st);
    }
}
