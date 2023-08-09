/**
 * A package containing classes related to exception handling.
 */
package com.david.java.exceptionhandling;

import java.util.logging.Logger;

/**
 * A class to demonstrate method overriding with the same exception.
 * This example demonstrates that a subclass can override a method to throw the same checked exception
 * as the exception thrown by the overridden method in the superclass.
 *
 * @author David
 */
public class MethodOverrideWithSameException extends SuperSame {
    /**
     * The main method to demonstrate method overriding with the same exception.
     *
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args) {
        Logger logger = Logger.getLogger(MethodOverrideWithSameException.class.getName());

        try {
            SuperSame superSame = new MethodOverrideWithSameException();
            superSame.show();
        } catch (Exception e) {
            logger.severe("An exception occurred: " + e.getMessage());
        }
    }

    /**
     * Overrides the show method from the superclass.
     * Throws the same exception.
     *
     * @throws Exception A checked exception.
     */
    @Override
    void show() throws Exception {
        Logger logger = Logger.getLogger(MethodOverrideWithSameException.class.getName());
        logger.info("Child Class...");
    }
}

/**
 * A superclass demonstrating method overriding.
 */
class SuperSame {
    /**
     * Displays a message from the superclass.
     * Throws the same exception.
     *
     * @throws Exception A checked exception.
     */
    void show() throws Exception {
        Logger logger = Logger.getLogger(SuperSame.class.getName());
        logger.info("Parent Class...");
    }
}
