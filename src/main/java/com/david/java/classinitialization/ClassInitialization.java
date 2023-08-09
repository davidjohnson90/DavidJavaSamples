package com.david.java.classinitialization;

/**
 * TestJava program consists of classes. Before a Java application runs, Java's
 * class loader loads its starting class -- the class with a public static void
 * main(String [] args) method -- and Java's byte code verifier verifies the
 * class. Then that class initializes. The simplest kind of class initialization
 * is automatic initialization of class fields to default values.
 * <p>
 * In this example, we declare various static fields with different data types
 * and don't explicitly assign values to them. The Java compiler will assign
 * default values to these fields automatically.
 *
 * @author David
 */
public class ClassInitialization {
    static boolean b;
    static byte by;
    static char c;
    static double d;
    static float f;
    static int i;
    static long l;
    static short s;
    static String st;

    /**
     * The main method of the ClassInitialization class.
     *
     * @param args The command-line arguments.
     */
    public static void main(String[] args) {
        // Print the default values of the class fields.
        System.out.println("b = " + b);
        System.out.println("by = " + by);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
        System.out.println("f = " + f);
        System.out.println("i = " + i);
        System.out.println("l = " + l);
        System.out.println("s = " + s);
        System.out.println("st = " + st);
    }
}
