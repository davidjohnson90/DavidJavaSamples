/**
 * This is the main class that demonstrates the use of abstract classes.
 */
package com.david.java.abstractclass;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * The AbstractClassDemo class extends the AbstractClass class and provides implementation
 * for the abstract method callMe().
 *
 * @author David
 */
public class AbstractClassDemo extends AbstractClass {

    private static final Logger logger = Logger.getLogger(AbstractClassDemo.class.getName());

    /**
     * Main method to demonstrate the functionality of the AbstractClassDemo class.
     *
     * @param args The command-line arguments.
     */
    public static void main(String[] args) {
        AbstractClassDemo demo = new AbstractClassDemo();
        demo.callMe();
    }

    /**
     * This method overrides the abstract method callMe() from the AbstractClass class.
     * It logs a message indicating that it is an abstract method implementation.
     */
    @Override
    void callMe() {
        logger.log(Level.INFO, "Am in CallMe method...");
    }
}

/**
 * The AbstractClass class is an abstract class that defines an abstract method callMe().
 */
abstract class AbstractClass {

    /**
     * This is an abstract method that must be implemented by subclasses.
     */
    abstract void callMe();
}
