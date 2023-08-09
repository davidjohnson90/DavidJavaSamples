/**
 * This class demonstrates the usage of Hashtable in Java.
 */
package com.david.java.collections;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * This class demonstrates the usage of Hashtable in Java.
 * It creates a Hashtable with keys as strings and values as integers,
 * and then iterates over the entries using an iterator,
 * printing the key-value pairs to the console.
 * The printed output will display each key-value pair in the Hashtable.
 * <p>
 * Note: Hashtable is synchronized and thread-safe, but it is recommended
 * to use ConcurrentHashMap or HashMap with proper synchronization in modern applications.
 *
 * @author David
 */
public class HashTableClass {

    private static final Logger logger = Logger.getLogger(HashTableClass.class.getName());

    public static void main(String[] args) {
        // Create a Hashtable with keys as strings and values as integers
        Hashtable<String, Integer> hashtable = new Hashtable<>();
        hashtable.put("Arun", 26);
        hashtable.put("Andrew", 18);
        hashtable.put("David", 23);

        // Get the entry set of the Hashtable and iterate over the entries
        Set<Entry<String, Integer>> set = hashtable.entrySet();
        Iterator<Entry<String, Integer>> iterator = set.iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();
            String key = entry.getKey();
            int value = entry.getValue();
            logger.log(Level.INFO, key + " : " + value);
        }
    }
}
