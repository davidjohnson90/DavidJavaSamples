/**
 * This class demonstrates the usage of HashSet in Java.
 */
package com.david.java.collections;

import java.util.HashSet;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * This class demonstrates the usage of HashSet in Java.
 * It creates a HashSet of strings and adds elements to it,
 * then prints the HashSet to the console.
 * The printed output will display the elements in the HashSet.
 *
 * @author David
 */
public class HashSetClass {

    private static final Logger logger = Logger.getLogger(HashSetClass.class.getName());

    public static void main(String[] args) {
        // Create a HashSet of strings and add elements to it
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Arun");
        hashSet.add("Andrew");
        hashSet.add("David");
        hashSet.add("Johnson");
        hashSet.add("Sundarson");

        // Print the HashSet
        logger.log(Level.INFO, "HashSet elements: " + hashSet);
    }
}
