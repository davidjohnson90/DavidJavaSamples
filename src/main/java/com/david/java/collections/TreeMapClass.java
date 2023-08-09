/**
 * This class demonstrates the usage of TreeMap in Java.
 */
package com.david.java.collections;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * This class demonstrates the usage of TreeMap in Java.
 * It creates a TreeMap with keys as strings and values as integers,
 * and then prints the key-value pairs using a for-each loop.
 * The printed output will display each key-value pair in ascending order of the keys.
 * <p>
 * TreeMap stores the keys in a sorted order, making it useful for maintaining sorted maps.
 * <p>
 * Note: TreeMap is not synchronized. If you need synchronization, consider using
 * a synchronized map like Collections.synchronizedMap(new TreeMap<>());
 * or use a thread-safe map implementation in multi-threaded scenarios.
 * <p>
 * In this example, the keys are sorted in their natural order (lexicographic order for strings).
 * To customize the sorting order, you can provide a custom Comparator to the TreeMap constructor.
 *
 * @author David
 */
public class TreeMapClass {

    private static final Logger logger = Logger.getLogger(TreeMapClass.class.getName());

    public static void main(String[] args) {
        // Create a TreeMap with keys as strings and values as integers
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        treeMap.put("Arun", 26);
        treeMap.put("Andrew", 18);
        treeMap.put("David", 23);

        // Get the entry set of the TreeMap and print the key-value pairs
        Set<Map.Entry<String, Integer>> set = treeMap.entrySet();
        for (Map.Entry<String, Integer> entry : set) {
            String key = entry.getKey();
            int value = entry.getValue();
            logger.log(Level.INFO, key + " : " + value);
        }
    }
}
