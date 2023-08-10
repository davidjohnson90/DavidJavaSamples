package com.david.java.json;

import com.google.gson.Gson;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * A class that demonstrates converting a Java object to JSON using the GSON library.
 * This class includes a main method that creates an instance of GSONtoJSON class,
 * converts it to JSON format, and prints the JSON string.
 * <p>
 * Note: Make sure to include the GSON library in your project for JSON serialization.
 * You can add it to your project dependencies using build tools like Maven or Gradle.
 * <p>
 * Author: David
 */
public class GSONtoJSON {
    // Create a logger for the class
    private static final Logger logger = Logger.getLogger(GSONtoJSON.class.getName());

    private int data1 = 100;
    private String data2 = "hello";

    /**
     * The main method that serves as the entry point of the program.
     *
     * @param args Command-line arguments (not used in this program).
     */
    public static void main(String[] args) {
        GSONtoJSON obj = new GSONtoJSON();
        Gson gson = new Gson();

        // Convert java object to JSON format
        String json = gson.toJson(obj);

        // Log the JSON string
        logger.log(Level.INFO, "JSON representation of the object:\n{0}", json);
    }

    /**
     * @return the data1
     */
    public int getData1() {
        return data1;
    }

    /**
     * @param data1 the data1 to set
     */
    public void setData1(int data1) {
        this.data1 = data1;
    }

    /**
     * @return the data2
     */
    public String getData2() {
        return data2;
    }

    /**
     * @param data2 the data2 to set
     */
    public void setData2(String data2) {
        this.data2 = data2;
    }
}
