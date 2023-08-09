/**
 * A package containing classes related to exception handling.
 */
package com.david.java.exceptionhandling;

import java.util.logging.Logger;

/**
 * A class to demonstrate the use of the "throw" keyword to manually throw an exception.
 * This example demonstrates throwing an ArithmeticException using the "throw" keyword.
 *
 * @author David
 */
public class ThrowKeyWord {
    /**
     * The main method to demonstrate throwing an exception using the "throw" keyword.
     *
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(ThrowKeyWord.class.getName());

        try {
            avg();
        } catch (ArithmeticException ae) {
            logger.severe("Exception caught");
        }
    }

    /**
     * Throws an ArithmeticException using the "throw" keyword.
     */
    private static void avg() {
        Logger logger = Logger.getLogger(ThrowKeyWord.class.getName());
        logger.info("Throwing an exception using the \"throw\" keyword");
        throw new ArithmeticException("testException");
    }
}
