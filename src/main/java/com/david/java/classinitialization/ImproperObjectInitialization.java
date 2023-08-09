package com.david.java.classinitialization;

/**
 * A superclass object field/block initializer can access a field in a subclass.
 * However, allowing that behavior is not a good idea because superclass
 * initialization occurs before subclass initialization -- and the subclass
 * fields thus contain only default values. Therefore, superclass initializer
 * access to subclass fields produces incorrect results.
 * <p>
 * In this example, we have a superclass ImproperObjectParent with an instance initializer block.
 * The initializer block attempts to access the 'a' field in the subclass ImproperObjectInitialization.
 * Since superclass initialization occurs before subclass initialization, the 'a' field in ImproperObjectInitialization
 * contains its default value, which is 0 (since it's an int).
 * <p>
 * The main method creates a new instance of ImproperObjectInitialization, triggering the object initialization
 * process and printing the output from the superclass initializer.
 * <p>
 * Note: This behavior is not recommended, and accessing subclass fields from a superclass initializer can lead to
 * unexpected and incorrect results.
 * <p>
 * Output:
 * a = 0
 * <p>
 * Author: David
 */
public class ImproperObjectInitialization extends ImproperObjectParent {
    int a = 2;

    /**
     * The main method of the ImproperObjectInitialization class.
     *
     * @param args The command-line arguments.
     */
    public static void main(String[] args) {
        new ImproperObjectInitialization();
    }
}

class ImproperObjectParent {
    {
        // This instance initializer block attempts to access the 'a' field in the subclass
        // ImproperObjectInitialization, which is not a good idea as explained in the comments.
        System.out.println("a = " + ((ImproperObjectInitialization) this).a);
    }
}
