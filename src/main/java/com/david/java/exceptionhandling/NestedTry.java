/**
 * A package containing classes related to exception handling.
 */
package com.david.java.exceptionhandling;

import java.util.logging.Logger;

/**
 * A class to demonstrate nested try-catch blocks in exception handling.
 * This example demonstrates using nested try-catch blocks to handle exceptions in different levels.
 *
 * @author David
 */
public class NestedTry {
    /**
     * The main method to demonstrate nested try-catch blocks.
     *
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(NestedTry.class.getName());

        try {
            int array[] = {5, 0, 1, 2};
            try {
                int x = array[3] / array[1];
                System.out.println("The result is : " + x);
            } catch (ArithmeticException ae) {
                logger.severe("Divide by zero");
            }
            array[4] = 3;
        } catch (ArrayIndexOutOfBoundsException e) {
            logger.severe("Array index out of bound exception");
        }
    }
}
