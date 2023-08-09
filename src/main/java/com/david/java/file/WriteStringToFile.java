package com.david.java.file;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;

/**
 * This class demonstrates how to write a string to a file using FileUtils from Apache Commons IO.
 * <p>
 * Note: Make sure to provide the correct path and file name.
 *
 * @author David
 */
public class WriteStringToFile {
    public static void main(String[] args) {
        String string = "This is\na test";
        File file = new File("src/main/resources/test.txt");
        try {
            FileUtils.writeStringToFile(file, string);
            System.out.println("Written to file");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
