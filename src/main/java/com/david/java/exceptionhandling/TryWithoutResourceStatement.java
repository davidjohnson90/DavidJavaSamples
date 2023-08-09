/**
 * A package containing classes related to exception handling.
 */
package com.david.java.exceptionhandling;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Logger;

/**
 * A class to demonstrate reading from a file using BufferedReader without try-with-resources.
 * This example demonstrates reading lines from a file using a BufferedReader and handling exceptions.
 * <p>
 * Note: Using try-with-resources is recommended for resource management.
 *
 * @author David
 */
public class TryWithoutResourceStatement {
    /**
     * The main method to demonstrate reading from a file using BufferedReader without try-with-resources.
     *
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(TryWithoutResourceStatement.class.getName());

        try {
            String string;
            // opening file in read mode using BufferedReader stream
            BufferedReader bufferedReader = new BufferedReader(new FileReader("D:\\David.txt"));
            while ((string = bufferedReader.readLine()) != null) {
                logger.info(string);
            }
            bufferedReader.close(); // closing BufferedReader stream
        } catch (IOException ie) {
            logger.severe("Exception");
        }
    }
}
