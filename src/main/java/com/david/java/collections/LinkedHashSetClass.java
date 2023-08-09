/**
 * This class demonstrates the usage of LinkedHashSet in Java.
 */
package com.david.java.collections;

import java.util.LinkedHashSet;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * This class demonstrates the usage of LinkedHashSet in Java.
 * It creates a LinkedHashSet of strings and adds elements to it,
 * then prints the LinkedHashSet to the console.
 * The printed output will display the elements in the LinkedHashSet in the order they were inserted.
 * <p>
 * LinkedHashSet maintains the insertion order of elements.
 * <p>
 * Note: LinkedHashSet is not synchronized. If you need synchronization, consider using
 * a synchronized set like Collections.synchronizedSet(new LinkedHashSet<>());
 * or use ConcurrentHashMap in multi-threaded scenarios.
 *
 * @author David
 */
public class LinkedHashSetClass {

    private static final Logger logger = Logger.getLogger(LinkedHashSetClass.class.getName());

    public static void main(String[] args) {
        // Create a LinkedHashSet of strings and add elements to it
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("Arun");
        linkedHashSet.add("Andrew");
        linkedHashSet.add("David");
        linkedHashSet.add("Johnson");
        linkedHashSet.add("Sundarson");

        // Print the LinkedHashSet
        logger.log(Level.INFO, "LinkedHashSet elements: " + linkedHashSet);
    }
}
