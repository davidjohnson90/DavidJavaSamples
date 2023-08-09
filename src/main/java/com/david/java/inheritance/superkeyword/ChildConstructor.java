package com.david.java.inheritance.superkeyword;

import java.util.logging.Logger;

/**
 * A simple example to demonstrate the use of the "super" keyword in inheritance.
 */
public class ChildConstructor extends ParentConstructor {
    private static final Logger LOGGER = Logger.getLogger(ChildConstructor.class.getName());
    private String childName;

    /**
     * Constructs a ChildConstructor object with names for both parent and child.
     *
     * @param parentName The name for the parent.
     * @param childName  The name for the child.
     */
    public ChildConstructor(String parentName, String childName) {
        super(parentName); // Call the constructor of the parent class
        this.childName = childName;
    }

    /**
     * The entry point of the program. Creates an instance of ChildConstructor and calls the details() method.
     *
     * @param args Command-line arguments (not used in this example).
     */
    public static void main(String[] args) {
        ChildConstructor childConstructor = new ChildConstructor("Parent", "Child");
        childConstructor.details();
    }

    /**
     * Displays the names from both the parent and child classes.
     */
    private void details() {
        LOGGER.info("Parent name: " + super.name);
        LOGGER.info("Child name: " + childName);
    }
}

/**
 * The ParentConstructor class has a single member variable "name".
 * It takes a name as a parameter in its constructor.
 */
class ParentConstructor {
    protected String name;

    /**
     * Constructs a ParentConstructor object with a given name.
     *
     * @param name The name for the parent.
     */
    public ParentConstructor(String name) {
        this.name = name;
    }
}
