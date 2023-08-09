/**
 * A package containing classes related to exception handling.
 */
package com.david.java.exceptionhandling;

import java.util.logging.Logger;

/**
 * A class to demonstrate the use of the "throws" keyword to declare exceptions.
 * This example demonstrates declaring an exception using the "throws" keyword in a method signature.
 * The method then throws an ArithmeticException.
 *
 * @author David
 */
public class ThrowsKeyword {
    /**
     * The main method to demonstrate declaring and catching exceptions using the "throws" keyword.
     *
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(ThrowsKeyword.class.getName());

        try {
            check();
        } catch (ArithmeticException e) {
            logger.severe("Caught: " + e);
        }
    }

    /**
     * Throws an ArithmeticException and declares it using the "throws" keyword.
     *
     * @throws ArithmeticException An arithmetic exception.
     */
    private static void check() throws ArithmeticException {
        Logger logger = Logger.getLogger(ThrowsKeyword.class.getName());
        logger.info("Inside check function");
        throw new ArithmeticException("demo");
    }
}
