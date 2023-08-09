/**
 * This class demonstrates the usage of HashMap in Java.
 */
package com.david.java.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * This class demonstrates the usage of HashMap in Java.
 * It creates a HashMap with keys as strings and values as integers,
 * and then prints the key-value pairs using a for-each loop.
 * The printed output will display each key-value pair in the HashMap.
 *
 * @author David
 */
public class HashMapClass {

    private static final Logger logger = Logger.getLogger(HashMapClass.class.getName());

    public static void main(String[] args) {
        // Create a HashMap with keys as strings and values as integers
        HashMap<String, Integer> hashMap = new HashMap<>();
        hashMap.put("Arun", 26);
        hashMap.put("Andrew", 18);
        hashMap.put("David", 23);

        // Get the entry set of the HashMap and print the key-value pairs
        Set<Map.Entry<String, Integer>> set = hashMap.entrySet();
        for (Map.Entry<String, Integer> entry : set) {
            String key = entry.getKey();
            int value = entry.getValue();
            logger.log(Level.INFO, key + " : " + value);
        }
    }
}
