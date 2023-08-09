/**
 * A package containing classes related to exception handling.
 */
package com.david.java.exceptionhandling;

import java.util.logging.Logger;

/**
 * A class to demonstrate the use of a try-catch block to handle an exception.
 * This example demonstrates catching an exception caused by dividing by zero.
 *
 * @author David
 */
public class TryCatch {
    /**
     * The main method to demonstrate the use of a try-catch block.
     *
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(TryCatch.class.getName());

        int a = 0;
        int b = 7;
        int c;
        try {
            c = b / a;
            logger.info("This line won't be executed..." + c);
        } catch (Exception e) {
            logger.severe("Divided by Zero.");
        }
        logger.info("After the exception is handled.");
    }
}
