package com.david.java.classinitialization;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * This class demonstrates class initialization in a class hierarchy.
 * <p>
 * When a class hierarchy is involved, the compiler creates a separate method
 * for each class in that hierarchy. At runtime, the JVM loads all hierarchy
 * classes and calls their methods in a top-to-bottom order. That means the
 * highest superclass's method (which is Object's method) executes first. After
 * Object's method completes, the next highest superclass's method executes. The
 * process continues in a top-down fashion until the class with the main()
 * method (if present) executes.
 * <p>
 * In this example, ClassHierarchyInitializer is the child class, and ClassParent
 * is the parent class in the hierarchy.
 *
 * @author David
 */
public class ClassHierarchyInitializer extends ClassParent {

    // Static variable b is initialized using a static initializer block.
    static int b = 2 + a;

    /**
     * This static initializer block is executed when the class is loaded by the JVM.
     * It initializes the static variable b and logs the output using java.util.logging.
     */
    static {
        // Using java.util.logging for logging.
        Logger logger = Logger.getLogger(ClassHierarchyInitializer.class.getName());
        logger.log(Level.INFO, "b = " + b);
        logger.log(Level.INFO, "Child initializer");
        logger.log(Level.INFO, "a = " + a);
    }

    /**
     * The main method of the ClassHierarchyInitializer class.
     *
     * @param args The command-line arguments.
     */
    public static void main(String[] args) {
        // Using java.util.logging for logging.
        Logger logger = Logger.getLogger(ClassHierarchyInitializer.class.getName());
        logger.log(Level.INFO, "am in main");
    }
}

/**
 * The parent class in the class hierarchy.
 */
class ClassParent {
    // Static variable a is initialized using a static initializer block.
    static int a = 1;

    /**
     * This static initializer block is executed when the class is loaded by the JVM.
     * It initializes the static variable a and logs the output using java.util.logging.
     */
    static {
        // Using java.util.logging for logging.
        Logger logger = Logger.getLogger(ClassParent.class.getName());
        logger.log(Level.INFO, "a = " + a);
        logger.log(Level.INFO, "Parent initializer");
    }
}
