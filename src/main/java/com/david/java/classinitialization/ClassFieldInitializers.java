package com.david.java.classinitialization;

import java.util.logging.Logger;

/**
 * Explicit initialization of class fields to values. Each class field
 * explicitly initializes to a value via a class field initializer.
 * <p>
 * Author: David
 */
public class ClassFieldInitializers {

    // Logger for logging messages
    private static final Logger LOGGER = Logger.getLogger(ClassFieldInitializers.class.getName());

    // Class fields explicitly initialized to specific values
    static boolean b = true;
    static byte by = 1;
    static char c = 'A';
    static double d = 1.2;
    static float f = 3.4f;
    static int i = 2;
    static long l = 3;
    static short s = 4;
    static String st = "abc";

    public static void main(String[] args) {
        // Display the initialized values of class fields
        LOGGER.info("b = " + b);
        LOGGER.info("by = " + by);
        LOGGER.info("c = " + c);
        LOGGER.info("d = " + d);
        LOGGER.info("f = " + f);
        LOGGER.info("i = " + i);
        LOGGER.info("l = " + l);
        LOGGER.info("s = " + s);
        LOGGER.info("st = " + st);
    }
}
