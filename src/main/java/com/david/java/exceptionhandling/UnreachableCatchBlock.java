/**
 * A package containing classes related to exception handling.
 */
package com.david.java.exceptionhandling;

import java.util.logging.Logger;

/**
 * A class to demonstrate an unreachable catch block and handling of exceptions.
 * This example demonstrates the concept of unreachable catch blocks and handling exceptions.
 * <p>
 * Note: The order of catch blocks matters; more specific exceptions should be caught before generic ones.
 *
 * @author David
 */
public class UnreachableCatchBlock {
    /**
     * The main method to demonstrate an unreachable catch block and handling of exceptions.
     *
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(UnreachableCatchBlock.class.getName());

        try {
            int array[] = {1, 2};
            array[2] = 3 / 0;
        } catch (ArrayIndexOutOfBoundsException e) // This block is unreachable if it is listed below the next block
        {
            logger.severe("array index out of bound exception");
        } catch (Exception e) // This block handles all Exception
        {
            logger.severe("Generic exception");
        }
    }
}
