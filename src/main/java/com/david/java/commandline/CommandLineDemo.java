/**
 * This class demonstrates how to access and print command-line arguments in Java.
 */
package com.david.java.commandline;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * This class demonstrates how to access and print command-line arguments in Java.
 * It prints each command-line argument passed to the program.
 * <p>
 * Command-line arguments are the values passed to the program when it is executed from the command line.
 * These arguments are stored in the args array of the main method.
 * <p>
 * To run this program from the command line and pass arguments, use the following format:
 * java com.david.java.commandLine.CommandLineDemo arg1 arg2 arg3 ...
 * <p>
 * For example, if you run the program using:
 * java com.david.java.commandLine.CommandLineDemo apple banana orange
 * The output will be:
 * apple
 * banana
 * orange
 * <p>
 * Note: Command-line arguments are passed as strings. If you need to parse them as other data types,
 * you need to convert them accordingly.
 * <p>
 * Additionally, consider using a logging framework like java.util.logging or log4j
 * for more robust and configurable logging in larger applications.
 *
 * @author David
 */
public class CommandLineDemo {

    private static final Logger logger = Logger.getLogger(CommandLineDemo.class.getName());

    public static void main(String[] args) {
        for (String arg : args) {
            logger.log(Level.INFO, arg);
        }
    }
}
