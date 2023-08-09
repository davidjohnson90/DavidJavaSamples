package com.david.java.generics;

import java.util.logging.Logger;

/**
 * A class to demonstrate the use of a generic class in Java.
 * This example shows how a generic class can be used to create instances of different types.
 *
 * @author David
 */
public class GenericClass {
    private static final Logger logger = Logger.getLogger(GenericClass.class.getName());

    public static void main(String[] args) {
        // Create an instance of Gen<Integer> and use it with an Integer
        Gen<Integer> integerObject = new Gen<Integer>(100);
        int integer = integerObject.getObj();
        logger.info("Value from integerObject: " + integer);

        // Create an instance of Gen<String> and use it with a String
        Gen<String> stringObject = new Gen<String>("Hi David");
        String string = stringObject.getObj();
        logger.info("Value from stringObject: " + string);
    }
}

/**
 * A generic class that can hold an object of any type.
 *
 * @param <T> The type of the object being held.
 */
class Gen<T> {
    private static final Logger logger = Logger.getLogger(Gen.class.getName());
    private T obj;

    /**
     * Constructs a new instance of Gen with the specified object.
     *
     * @param o The object to be stored.
     */
    public Gen(T o) {
        obj = o;
    }

    /**
     * Returns the object stored in this instance.
     *
     * @return The stored object.
     */
    public T getObj() {
        return obj;
    }
}
