package com.david.java.collections;

/**
 * This example demonstrates how to access elements of an ArrayList using a foreach loop in Java.
 * <p>
 * In this example, we have a class AccessUsingForEachLoop. Inside the main method, we create
 * an ArrayList named 'arrayList' and add some String elements to it. Then, we use a foreach loop
 * to iterate through each element in the ArrayList and print its value.
 * <p>
 * Author: David
 */

import java.util.ArrayList;

public class AccessUsingForEachLoop {
    public static void main(String[] args) {
        // Create an ArrayList of String type.
        ArrayList<String> arrayList = new ArrayList<String>();

        // Add elements to the ArrayList.
        arrayList.add("Arun");
        arrayList.add("Andrew");
        arrayList.add("David");
        arrayList.add("Johnson");
        arrayList.add("Sundarson");

        // Use a foreach loop to access and print each element in the ArrayList.
        for (String string : arrayList) {
            System.out.println(string);
        }
    }
}
