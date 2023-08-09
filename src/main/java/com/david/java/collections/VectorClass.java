/**
 * This class demonstrates the usage of Vector in Java.
 */
package com.david.java.collections;

import java.util.Enumeration;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * This class demonstrates the usage of Vector in Java.
 * It creates a Vector of strings and adds elements to it,
 * then prints the elements using an Enumeration.
 * The printed output will display each element in the Vector.
 * <p>
 * Note: Vector is a synchronized collection, but it is recommended to use
 * ArrayList or LinkedList in most cases, as they provide better performance.
 * If synchronization is needed, consider using Collections.synchronizedList(new ArrayList<>());
 * or use a thread-safe list implementation in multi-threaded scenarios.
 * <p>
 * In Java 5 and later, using a foreach loop (enhanced for loop) is preferred over Enumeration
 * for iterating over collections, as it is more concise and less error-prone.
 *
 * @author David
 */
public class VectorClass {

    private static final Logger logger = Logger.getLogger(VectorClass.class.getName());

    public static void main(String[] args) {
        // Create a Vector of strings and add elements to it
        Vector<String> vector = new Vector<>();
        vector.add("Arun");
        vector.add("Andrew");
        vector.add("David");
        vector.add("Johnson");
        vector.add("Sundarson");

        // Use Enumeration to iterate over the Vector and print the elements
        Enumeration<String> enumeration = vector.elements();
        while (enumeration.hasMoreElements()) {
            String element = enumeration.nextElement();
            logger.log(Level.INFO, element);
        }
    }
}
