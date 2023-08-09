/**
 * A package containing classes related to exception handling.
 */
package com.david.java.exceptionhandling;

import java.util.logging.Logger;

/**
 * A class to demonstrate multiple catch blocks in exception handling.
 * This example demonstrates catching specific exceptions using separate catch blocks.
 *
 * @author David
 */
public class MultipleCatchBlock {
    /**
     * The main method to demonstrate multiple catch blocks.
     *
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(MultipleCatchBlock.class.getName());

        try {
            int array[] = {1, 2};
            array[2] = 3 / 0;
        } catch (ArrayIndexOutOfBoundsException e) {
            logger.severe("Array index out of bound exception");
        } catch (ArithmeticException ae) {
            logger.severe("Divide by zero");
        }
    }
}
