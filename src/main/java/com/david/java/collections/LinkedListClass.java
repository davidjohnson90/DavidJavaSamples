/**
 * This class demonstrates the usage of LinkedList in Java.
 */
package com.david.java.collections;

import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * This class demonstrates the usage of LinkedList in Java.
 * It creates a LinkedList of strings and adds elements to it,
 * then prints the LinkedList to the console.
 * The printed output will display the elements in the LinkedList in the order they were added.
 * <p>
 * LinkedList is a doubly-linked list implementation of the List interface,
 * and it allows adding elements at the beginning or end of the list efficiently.
 * <p>
 * Note: LinkedList is not synchronized. If you need synchronization, consider using
 * a synchronized list like Collections.synchronizedList(new LinkedList<>());
 * or use a thread-safe list implementation in multi-threaded scenarios.
 *
 * @author David
 */
public class LinkedListClass {

    private static final Logger logger = Logger.getLogger(LinkedListClass.class.getName());

    public static void main(String[] args) {
        // Create a LinkedList of strings and add elements to it
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Andrew");
        linkedList.add("David");
        linkedList.add("Johnson");
        linkedList.addFirst("Arun");
        linkedList.addLast("Sundarson");

        // Print the LinkedList
        logger.log(Level.INFO, "LinkedList elements: " + linkedList);
    }
}
