package com.david.java.file;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Logger;

/**
 * A simple example demonstrating file handling operations using a PrintWriter and Java logging.
 * This example creates or appends to a log file and uses Java's built-in logging framework for logging.
 * <p>
 * Note: For this code to work, ensure that the log.txt file is in the "src/main/resources" directory.
 * Also, ensure that the classpath is set up properly.
 * <p>
 * Note: The Logger used here is a simple example and might need further configuration for production use.
 * In a real application, consider using more advanced logging frameworks like Log4j or SLF4J.
 * <p>
 * Note: This code is a template and might need adjustments based on your specific project structure and needs.
 * <p>
 * Note: The code provided is meant for educational purposes and might need further validation, handling, or improvements
 * for real-world applications.
 * <p>
 * Author: David
 */
public class PrintWriterExample {

    private static final Logger logger = Logger.getLogger(PrintWriterExample.class.getName());

    /**
     * The main method demonstrates creating or appending to a log file and using Java logging.
     *
     * @param args Command-line arguments (not used in this example).
     */
    public static void main(String[] args) {
        File log = new File("src/main/resources/log.txt");
        try {
            if (!log.exists()) {
                logger.info("Creating a new log file.");
                log.createNewFile();
            }

            FileWriter out = new FileWriter(log, true);
            out.append("******* " + System.currentTimeMillis() + "*******\n");
            out.close();

            logger.info("Log entry added successfully.");
        } catch (IOException e) {
            logger.severe("Error while logging: " + e.getMessage());
        }
    }
}
