package com.david.java.inheritance.superkeyword;

import java.util.logging.Logger;

/**
 * A simple example to demonstrate the use of the "super" keyword with properties in inheritance.
 */
public class ChildProperty extends ParentProperty {
    private static final Logger LOGGER = Logger.getLogger(ChildProperty.class.getName());

    private String childName;

    /**
     * The entry point of the program. Creates an instance of ChildProperty and calls the details() method.
     *
     * @param args Command-line arguments (not used in this example).
     */
    public static void main(String[] args) {
        ChildProperty childProperty = new ChildProperty();
        childProperty.details();
    }

    /**
     * Displays the names from both the parent and child classes.
     */
    private void details() {
        super.name = "Parent";
        childName = "Child";

        LOGGER.info("Parent name: " + super.name);
        LOGGER.info("Child name: " + childName);
    }
}

/**
 * The ParentProperty class has a single member variable "name".
 * It is intended to be a base class for demonstrating inheritance.
 */
class ParentProperty {
    String name;
}
