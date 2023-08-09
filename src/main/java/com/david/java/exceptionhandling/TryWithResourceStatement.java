/**
 * A package containing classes related to exception handling.
 */
package com.david.java.exceptionhandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Logger;

/**
 * A class to demonstrate reading from a file using BufferedReader with try-with-resources.
 * This example demonstrates reading lines from a file using a BufferedReader and the try-with-resources statement.
 * <p>
 * Note: Using try-with-resources is recommended for resource management.
 *
 * @author David
 */
public class TryWithResourceStatement {
    /**
     * The main method to demonstrate reading from a file using BufferedReader with try-with-resources.
     *
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(TryWithResourceStatement.class.getName());

        try (BufferedReader br = new BufferedReader(new FileReader("D:\\David.txt"))) {
            String str;
            while ((str = br.readLine()) != null) {
                logger.info(str);
            }
        } catch (IOException ie) {
            logger.severe("Exception");
        }
    }
}
