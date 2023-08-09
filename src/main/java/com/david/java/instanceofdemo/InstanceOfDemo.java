package com.david.java.instanceofdemo;

import java.util.logging.Logger;

/**
 * A simple example to demonstrate the usage of the instanceof operator in Java.
 * This example showcases how to use the instanceof operator to check object types and inheritance relationships.
 * It also demonstrates the use of JavaDoc comments, inline comments, and logging.
 * <p>
 * The main class creates instances of different classes and checks their types using instanceof.
 * It demonstrates instanceof checks between parent and child classes, and when object references are reassigned.
 * <p>
 * To run this program, execute the main method.
 * Make sure to observe the output in the console.
 * <p>
 * Author: David
 */
public class InstanceOfDemo {
    private static final Logger LOGGER = Logger.getLogger(InstanceOfDemo.class.getName());

    /**
     * The entry point of the program. Creates instances and demonstrates the usage of instanceof.
     *
     * @param args Command-line arguments (not used in this example).
     */
    public static void main(String[] args) {
        InstanceOfDemo demo = new InstanceOfDemo();
        LOGGER.info(String.valueOf(demo instanceof InstanceOfDemo));

        ParentDemo parentDemo = new ParentDemo();
        Child1 child1 = new Child1();
        Child2 child2 = new Child2();

        LOGGER.info(String.valueOf(child1 instanceof ParentDemo));
        LOGGER.info(String.valueOf(child2 instanceof ParentDemo));
        LOGGER.info(String.valueOf(parentDemo instanceof Child1));
        LOGGER.info(String.valueOf(parentDemo instanceof Child2));

        parentDemo = child1;
        LOGGER.info(String.valueOf(parentDemo instanceof Child1));
        LOGGER.info(String.valueOf(parentDemo instanceof Child2));

        parentDemo = child2;
        LOGGER.info(String.valueOf(parentDemo instanceof Child1));
        LOGGER.info(String.valueOf(parentDemo instanceof Child2));
    }
}

/**
 * The ParentDemo class represents a base class.
 * <p>
 * Author: David
 */
class ParentDemo {

}

/**
 * The Child1 class represents a derived class.
 * <p>
 * Author: David
 */
class Child1 extends ParentDemo {

}

/**
 * The Child2 class represents another derived class.
 * <p>
 * Author: David
 */
class Child2 extends ParentDemo {

}
