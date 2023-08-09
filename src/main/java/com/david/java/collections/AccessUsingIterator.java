package com.david.java.collections;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * This example demonstrates how to access elements of an ArrayList using an Iterator in Java.
 * <p>
 * In this example, we have a class AccessUsingIterator. Inside the main method, we create
 * an ArrayList named 'arrayList' and add some String elements to it. Then, we obtain an Iterator
 * from the ArrayList using the 'iterator()' method. The Iterator allows us to traverse the
 * ArrayList and access its elements one by one. We use a while loop with the 'hasNext()' and 'next()'
 * methods of the Iterator to iterate through the ArrayList and print its elements.
 * <p>
 * Author: David
 */

public class AccessUsingIterator {
    public static void main(String[] args) {
        // Create an ArrayList of String type.
        ArrayList<String> arrayList = new ArrayList<String>();

        // Add elements to the ArrayList.
        arrayList.add("Arun");
        arrayList.add("Andrew");
        arrayList.add("David");
        arrayList.add("Johnson");
        arrayList.add("Sundarson");

        // Obtain an Iterator from the ArrayList.
        Iterator<String> iterator = arrayList.iterator();

        // Use the Iterator to access and print each element in the ArrayList.
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
