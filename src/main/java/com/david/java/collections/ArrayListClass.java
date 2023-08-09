/**
 * This class demonstrates the usage of ArrayList in Java.
 */
package com.david.java.collections;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * This class demonstrates the usage of ArrayList in Java.
 * It creates an ArrayList of strings, adds elements to it, and then prints the ArrayList.
 * The printed ArrayList will contain the elements in the order they were added.
 *
 * @author David
 */
public class ArrayListClass {

    private static final Logger logger = Logger.getLogger(ArrayListClass.class.getName());

    public static void main(String[] args) {
        // Create an ArrayList and add elements to it
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Arun");
        arrayList.add("Andrew");
        arrayList.add("David");
        arrayList.add("Johnson");
        arrayList.add("Sundarson");

        // Print the ArrayList
        logger.log(Level.INFO, "ArrayList elements: " + arrayList);
    }
}
