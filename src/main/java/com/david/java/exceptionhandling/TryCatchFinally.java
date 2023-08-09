/**
 * A package containing classes related to exception handling.
 */
package com.david.java.exceptionhandling;

import java.util.logging.Logger;

/**
 * A class to demonstrate the use of try-catch-finally blocks.
 * This example demonstrates the behavior of try-catch-finally blocks and the usage of loggers.
 *
 * @author David
 */
public class TryCatchFinally {
    /**
     * The main method to demonstrate the behavior of try-catch-finally blocks.
     *
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(TryCatchFinally.class.getName());

        String value = getValue(logger);
        logger.info("value : " + value);
    }

    /**
     * Simulates behavior of try-catch-finally blocks and returns a value.
     *
     * @param logger A logger for logging.
     * @return A value indicating behavior.
     */
    private static String getValue(Logger logger) {
        String data = null;
        try {
            logger.info("Am in try");
            data = "Hi David";
            System.exit(0);
        } catch (Exception e) {
            logger.severe("Am in catch");
            data = "Am in catch";
        } finally {
            logger.info("Am in finally block");
            data = "Am in finally block";
        }
        logger.info("Am after all");
        return data;
    }
}
