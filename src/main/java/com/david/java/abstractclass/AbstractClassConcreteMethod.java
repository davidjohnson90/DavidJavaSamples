/**
 * This is the main class that demonstrates the use of abstract classes and concrete methods.
 */
package com.david.java.abstractclass;

import java.util.logging.Logger;

/**
 * The AbstractClassConcreteMethod class extends the AbstractClassTest class and provides implementation
 * for the abstract method callMe(). It also contains a concrete method named normal().
 *
 * @author David
 */
public class AbstractClassConcreteMethod extends AbstractClassTest {

    private static final Logger logger = Logger.getLogger(AbstractClassConcreteMethod.class.getName());

    /**
     * Main method to demonstrate the functionality of the AbstractClassConcreteMethod class.
     *
     * @param args The command-line arguments.
     */
    public static void main(String[] args) {
        AbstractClassConcreteMethod method = new AbstractClassConcreteMethod();
        method.callMe();
        method.normal();
    }

    /**
     * This method overrides the abstract method callMe() from the AbstractClassTest class.
     * It logs a message indicating that it is an abstract method implementation.
     */
    @Override
    void callMe() {
        logger.info("This is abstract method...");
    }

}

/**
 * The AbstractClassTest class is an abstract class that defines an abstract method callMe()
 * and a concrete method named normal().
 */
abstract class AbstractClassTest {

    private static final Logger logger = Logger.getLogger(AbstractClassTest.class.getName());

    /**
     * This is an abstract method that must be implemented by subclasses.
     */
    abstract void callMe();

    /**
     * This is a concrete method that provides a default implementation.
     * It logs a message indicating that it is a concrete method.
     */
    public void normal() {
        logger.info("This is concrete method...");
    }
}
