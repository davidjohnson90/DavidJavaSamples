/**
 * A simple example to demonstrate method overriding and the use of the "super" keyword in inheritance.
 */
package com.david.java.inheritance.superkeyword;

import java.util.logging.Logger;

/**
 * The ChildMethods class extends the ParentMethods class and demonstrates method overriding and the "super" keyword.
 * It showcases how to override a method from the parent class and use "super" to call the parent method.
 * <p>
 * In this example, ChildMethods inherits from ParentMethods. It overrides the details() method of the parent class
 * and uses the "super" keyword to call the parent class method. The overridden method displays names from both
 * parent and child classes.
 * <p>
 * Note: The method details() is overridden in ChildMethods, and the "super" keyword is used to call the method
 * details() of the parent class, providing the ability to extend functionality while reusing the parent's behavior.
 *
 * @author David
 */
public class ChildMethods extends ParentMethods {
    private static final Logger logger = Logger.getLogger(ChildMethods.class.getName());
    String name;

    /**
     * The entry point of the program. Creates an instance of ChildMethods and calls the details() method.
     *
     * @param args Command-line arguments (not used in this example).
     */
    public static void main(String[] args) {
        ChildMethods childMethods = new ChildMethods();
        childMethods.details();
    }

    /**
     * Overrides the details() method of the parent class.
     * Calls the parent class details() method using the "super" keyword.
     * Sets the child's name and logs it.
     */
    @Override
    public void details() {
        super.details(); // calling Parent class details() method
        name = "Child";
        logger.info(name);
    }
}

/**
 * The ParentMethods class has a single member variable "name" and a method "details()".
 * The details() method sets the name to "Parent" and logs it.
 */
class ParentMethods {
    private static final Logger logger = Logger.getLogger(ParentMethods.class.getName());
    String name;

    /**
     * Sets the name to "Parent" and logs it.
     */
    public void details() {
        name = "Parent";
        logger.info(name);
    }
}
