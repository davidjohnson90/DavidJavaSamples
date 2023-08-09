/**
 * A package containing classes related to exception handling.
 */
package com.david.java.exceptionhandling;

import java.util.logging.Logger;

/**
 * A class to demonstrate a user-defined exception and its usage.
 * This example demonstrates creating a custom exception class and using it to handle specific cases.
 * <p>
 * Note: The code now initializes the logger properly.
 *
 * @author David
 */
public class UserDefinedExceptionSubclass {
    private static Logger logger = Logger.getLogger(UserDefinedExceptionSubclass.class.getName());

    /**
     * The main method to demonstrate a user-defined exception and its usage.
     *
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args) {
        try {
            sum(-10, 10);
        } catch (DavidException de) {
            logger.severe(de.toString());
        }
    }

    /**
     * Adds two numbers, throwing a custom exception if the first number is negative.
     *
     * @param i The first number.
     * @param j The second number.
     * @throws DavidException If the first number is negative.
     */
    private static void sum(int i, int j) throws DavidException {
        if (i < 0) {
            throw new DavidException(i);
        } else {
            logger.info(String.valueOf(i + j));
        }
    }
}

/**
 * A custom exception class.
 */
class DavidException extends Exception {
    private static final long serialVersionUID = 1L;
    private int i;

    /**
     * Constructs a DavidException with the given number.
     *
     * @param i The number causing the exception.
     */
    public DavidException(int i) {
        this.i = i;
    }

    /*
     * (non-Javadoc)
     *
     * @see java.lang.Throwable#toString()
     */
    @Override
    public String toString() {
        return "DavidException: The number " + i + " is less than 0.";
    }
}
