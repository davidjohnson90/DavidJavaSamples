package com.david.java.classinitialization;

/**
 * Object field initializers are sufficient for the initialization of object
 * fields. However, they prove inadequate for more complex object
 * initialization. To parallel class block initializers, Java supports the
 * object block initializer. An object block initializer consists of an open
 * brace character ({), initialization code, and a close brace character (}).
 * Furthermore, an object block initializer appears within a class but not
 * within any of that class's methods.
 * <p>
 * In this example, we have a class ObjectBlockComplexInitializer that contains an
 * object block initializer. The object block initializer initializes a local
 * variable and prints a message during object construction.
 * <p>
 * The main method creates two instances of ObjectBlockComplexInitializer, and each
 * object's constructor triggers the execution of the object block initializer.
 * <p>
 * Author: David
 */
@SuppressWarnings("unused")
public class ObjectBlockComplexInitializer {
    {
        // This is the object block initializer.
        System.out.println("Initializing object " + hashCode());
        int localVariable = 1;
    }

    /**
     * Constructor for ObjectBlockComplexInitializer.
     *
     * @param msg The message to be printed during object construction.
     */
    ObjectBlockComplexInitializer(String msg) {
        System.out.println(msg);
        // System.out.println(localVariable); // Uncommenting this line will cause an error.
    }

    public static void main(String[] args) {
        // Create two instances of ObjectBlockComplexInitializer.
        // Each object's constructor triggers the execution of the object block initializer.
        ObjectBlockComplexInitializer initializer1 = new ObjectBlockComplexInitializer("1");
        ObjectBlockComplexInitializer initializer2 = new ObjectBlockComplexInitializer("2");
    }
}
