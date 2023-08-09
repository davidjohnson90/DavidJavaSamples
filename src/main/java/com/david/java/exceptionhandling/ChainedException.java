/**
 * A package containing classes related to exception handling.
 */
package com.david.java.exceptionhandling;

import java.io.IOException;
import java.util.logging.Logger;

/**
 * A class to demonstrate chained exceptions in Java.
 *
 * @author David
 */
public class ChainedException {
    /**
     * The main method to demonstrate chained exceptions.
     *
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(ChainedException.class.getName());

        try {
            divide(5, 0);
        } catch (ArithmeticException ae) {
            logger.info("Caught : " + ae);
            logger.info("Actual Cause : " + ae.getCause());
        }
    }

    /**
     * Divides two numbers and handles exceptions with chained exceptions.
     *
     * @param i The dividend.
     * @param j The divisor.
     */
    private static void divide(int i, int j) {
        if (j == 0) {
            ArithmeticException arithmeticException = new ArithmeticException("Exception Caught");
            arithmeticException.initCause(new IOException("Cause of divisor 0"));
            throw arithmeticException;
        } else {
            System.out.println(i / j);
        }
    }
}
