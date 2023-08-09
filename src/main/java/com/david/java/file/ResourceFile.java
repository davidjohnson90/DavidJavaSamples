package com.david.java.file;

import java.io.*;
import java.util.logging.Logger;

/**
 * A class to demonstrate file handling operations using resources.
 * This example demonstrates various file operations like reading, counting lines, and extracting content
 * using a resource file.
 * <p>
 * Note: The code now uses Java loggers for better output management.
 * <p>
 * Remember to place the ma.txt file in the resources folder.
 * Make sure the "David.txt" file is in the "src/main/resources" directory.
 * Also, ensure that the classpath is set up properly.
 * <p>
 * Note: For this code to work, ensure that the classpath is properly configured.
 * If you're using an IDE like Eclipse or IntelliJ, they usually handle classpath settings automatically.
 * If you're running from the command line, you need to ensure the resources directory is in the classpath.
 * The exact steps depend on the build tool and environment you're using.
 * If you're still facing issues, you might need to adjust your classpath settings.
 * <p>
 * Note: The "David.txt" file in this example is assumed to be a text file containing lines of text.
 * You can replace it with any text file you want to read.
 * <p>
 * Note: This code uses the getResourceAsStream method to access the resource file from the classpath.
 * This method returns null if the resource is not found, so it's important to handle that case.
 * If the resource is not found, the logger will print an error message.
 * <p>
 * Note: For improved resource management, Java 9 introduced the "try-with-resources" statement for InputStream.
 * In this code, we've used it where appropriate.
 * <p>
 * Note: The code assumes UTF-8 encoding for reading the text file.
 * <p>
 * Note: This code is a template and might need adjustments based on your specific project structure and needs.
 * <p>
 * Note: The Logger used here is a simple example and might need further configuration for production use.
 * In a real application, consider using more advanced logging frameworks like Log4j or SLF4J.
 * <p>
 * Note: The code provided is meant for educational purposes and might need further validation, handling, or improvements
 * for real-world applications.
 *
 * @author David
 */
public class ResourceFile {
    private static String fileName = "David.txt"; // Use only the file name
    private static Logger logger = Logger.getLogger(ResourceFile.class.getName());

    public static void main(String[] args) throws IOException {
        int count = countLines(fileName);
        logger.info("The count is " + count);

        readAttachedFile();

        String[] lines = getContents(fileName);
        for (String line : lines) {
            logger.info("Line content: " + line);
        }

        String lineValue = readLine(count, 2);
        logger.info("The line values in the selected line are: " + lineValue);
    }

    /**
     * Reads and displays the content of the attached file (UTF-8 encoded).
     */
    public static void readAttachedFile() {
        try (InputStream inputStream = ResourceFile.class.getResourceAsStream("/" + fileName)) {
            if (inputStream == null) {
                logger.severe("File not found: " + fileName);
                return;
            }

            BufferedReader in = new BufferedReader(new InputStreamReader(inputStream, "UTF8"));
            String str;
            while ((str = in.readLine()) != null) {
                logger.info(str);
            }
        } catch (IOException e) {
            e.printStackTrace();
            logger.severe(e.getMessage());
        }
    }

    public static int countLines(String filename) throws IOException {
        try (InputStream inputStream = ResourceFile.class.getResourceAsStream("/" + fileName)) {
            if (inputStream == null) {
                logger.severe("File not found: " + filename);
                return 0; // or return -1 to indicate an error
            }

            BufferedReader in = new BufferedReader(new InputStreamReader(inputStream, "UTF8"));
            int count = 0;
            String line;
            while ((line = in.readLine()) != null) {
                count++;
            }
            return count;
        } catch (IOException e) {
            e.printStackTrace();
            logger.severe(e.getMessage());
            return -1; // indicate an error
        }
    }

    public static String readLine(int lineNumber, int j) throws IOException {
        try (InputStream inputStream = ResourceFile.class.getResourceAsStream("/" + fileName)) {
            if (inputStream == null) {
                logger.severe("File not found: " + fileName);
                return null;
            }

            try (BufferedReader in = new BufferedReader(new InputStreamReader(inputStream, "UTF8"))) {
                String line = null;
                for (int i = 0; i < j; i++) {
                    line = in.readLine();
                }
                return line;
            }
        } catch (IOException e) {
            e.printStackTrace();
            logger.severe(e.getMessage());
            return null;
        }
    }

    public static String[] getContents(String fileName) throws IOException {
        try (InputStream inputStream = ResourceFile.class.getResourceAsStream("/" + fileName)) {
            if (inputStream == null) {
                logger.severe("File not found: " + fileName);
                return new String[]{"", ""}; // Return empty strings to indicate an error
            }

            try (BufferedReader in = new BufferedReader(new InputStreamReader(inputStream, "UTF8"))) {
                String line;
                StringBuilder sb1 = new StringBuilder();
                StringBuilder sb2 = new StringBuilder();
                while ((line = in.readLine()) != null) {
                    if (in instanceof LineNumberReader && ((LineNumberReader) in).getLineNumber() >= 2) {
                        sb2.append(line).append("\n");
                    } else if (in instanceof LineNumberReader && ((LineNumberReader) in).getLineNumber() > 1) {
                        sb1.append(line).append("\n");
                    }
                }
                return new String[]{sb1.toString(), sb2.toString()};
            }
        } catch (IOException e) {
            e.printStackTrace();
            logger.severe(e.getMessage());
            return new String[]{"", ""}; // Return empty strings to indicate an error
        }
    }
}
