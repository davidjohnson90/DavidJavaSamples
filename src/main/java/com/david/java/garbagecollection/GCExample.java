package com.david.java.garbagecollection;

import java.util.logging.Logger;

/**
 * A class to demonstrate garbage collection behavior in Java.
 * This example shows how objects are garbage collected when their references are removed and the garbage collector is invoked.
 *
 * @author David
 */
public class GCExample {
    private static final Logger LOGGER = Logger.getLogger(GCExample.class.getName());
    private static GCExample example;

    /**
     * Returns the instance of GCExample.
     *
     * @return The example instance.
     */
    public static GCExample getExample() {
        return example;
    }

    /**
     * Sets the instance of GCExample.
     *
     * @param example The example instance to set.
     */
    public static void setExample(GCExample example) {
        GCExample.example = example;
    }

    /**
     * The main method to demonstrate garbage collection.
     *
     * @param args Command-line arguments (unused).
     */
    public static void main(String[] args) {
        LOGGER.info("Creating an instance and assigning it to 'example'");
        setExample(new GCExample());

        LOGGER.info("Removing the reference to the instance");
        setExample(null);

        LOGGER.info("Requesting garbage collection");
        System.gc();
    }

    /**
     * The finalize method, which is automatically called by the garbage collector before an object is reclaimed.
     * This method logs a message indicating that the object is being garbage collected.
     *
     * @throws Throwable If an exception occurs during finalization.
     */
    @Override
    protected void finalize() throws Throwable {
        LOGGER.info("Garbage Collected");
    }
}
