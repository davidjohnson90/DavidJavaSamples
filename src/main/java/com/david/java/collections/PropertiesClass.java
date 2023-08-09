/**
 * This class demonstrates the usage of Properties in Java.
 */
package com.david.java.collections;

import java.util.Properties;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * This class demonstrates the usage of Properties in Java.
 * It creates a Properties object to store programming languages and their creators,
 * then prints the information to the console.
 * The printed output will display each language and its creator.
 * <p>
 * The Properties class is mainly used for storing configuration settings
 * and for internationalization purposes.
 * <p>
 * Note: Properties extends Hashtable, and it is synchronized.
 * However, for other use cases, consider using a more specific data structure
 * or Map implementation for better performance.
 *
 * @author David
 */
public class PropertiesClass {

    private static final Logger logger = Logger.getLogger(PropertiesClass.class.getName());

    public static void main(String[] args) {
        // Create a Properties object to store programming languages and their creators
        Properties properties = new Properties();
        properties.put("C", "Dennis Ritchie");
        properties.put("C++", "Bjarne Stroustrup");
        properties.put("C#", "Microsoft Inc.");
        properties.put("Java", "James Gosling");

        // Get the keys from the Properties and print the language-creator pairs
        Set<Object> set = properties.keySet();
        for (Object key : set) {
            String language = (String) key;
            String creator = properties.getProperty(language);
            logger.log(Level.INFO, language + " was created by " + creator);
        }
    }
}
