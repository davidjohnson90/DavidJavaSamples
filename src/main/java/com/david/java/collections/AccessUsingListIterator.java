/**
 * This class demonstrates how to access elements of an ArrayList using ListIterator.
 */
package com.david.java.collections;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * This class demonstrates how to access elements of an ArrayList using ListIterator.
 * It prints the elements in forward and reverse order using the ListIterator.
 *
 * @author David
 */
public class AccessUsingListIterator {

    private static final Logger logger = Logger.getLogger(AccessUsingListIterator.class.getName());

    public static void main(String[] args) {
        // Create an ArrayList and add elements to it
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Arun");
        arrayList.add("Andrew");
        arrayList.add("David");
        arrayList.add("Johnson");
        arrayList.add("Sundarson");

        // Print the elements in forward order using ListIterator
        ListIterator<String> iterator = arrayList.listIterator();
        while (iterator.hasNext()) {
            String element = iterator.next();
            logger.log(Level.INFO, element);
        }

        // Print the elements in reverse order using ListIterator
        while (iterator.hasPrevious()) {
            String element = iterator.previous();
            logger.log(Level.INFO, element);
        }
    }
}
