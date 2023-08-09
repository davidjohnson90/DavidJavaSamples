/**
 * A package containing classes related to exception handling.
 */
package com.david.java.exceptionhandling;

import java.util.logging.Logger;

/**
 * A class to demonstrate an uncaught exception.
 * This example demonstrates an uncaught exception caused by dividing by zero.
 * <p>
 * Note: Dividing by zero will cause an ArithmeticException.
 *
 * @author David
 */
public class UncaughtException {
    /**
     * The main method to demonstrate an uncaught exception.
     *
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(UncaughtException.class.getName());
        int a = 0;
        int b = 7 / a;
        logger.info("Result: " + b);
    }
}
