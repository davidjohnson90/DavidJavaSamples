package com.david.java.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * A program to demonstrate fetching data from a Microsoft Access database using JDBC.
 * This program connects to a Microsoft Access database named "DavidTest.accdb"
 * located in the resources directory and retrieves data from the "Playlist" table.
 * <p>
 * Note: Make sure to include the UCanAccess library in your project for accessing Access databases.
 * You can download it from: http://ucanaccess.sourceforge.net/site.html
 *
 * @author David
 */
public class PlaylistDemo {
    // Create a logger for the class
    private static final Logger logger = Logger.getLogger(PlaylistDemo.class.getName());

    /**
     * The main method that serves as the entry point of the program.
     *
     * @param args Command-line arguments (not used in this program).
     */
    public static void main(String[] args) {
        // Database connection URL
        String dbUrl = "jdbc:ucanaccess://src/main/resources/DavidTest.accdb";

        try (Connection connection = DriverManager.getConnection(dbUrl)) {
            Statement statement = connection.createStatement();
            String sql = "SELECT * FROM Playlist";
            ResultSet resultSet = statement.executeQuery(sql);

            // Process and display retrieved data
            processAndDisplayData(resultSet);
        } catch (Exception e) {
            logger.log(Level.SEVERE, "An error occurred while fetching data from the database.", e);
        }
    }

    /**
     * Processes and displays the retrieved data from the ResultSet.
     *
     * @param resultSet The ResultSet containing the retrieved data.
     */
    private static void processAndDisplayData(ResultSet resultSet) {
        try {
            while (resultSet.next()) {
                String songId = resultSet.getString(1);
                String songName = resultSet.getString(2);
                String artist = resultSet.getString(3);
                String album = resultSet.getString(4);

                // Log retrieved data
                logger.log(Level.INFO, "Song ID: {0}", songId);
                logger.log(Level.INFO, "Song Name: {0}", songName);
                logger.log(Level.INFO, "Artist: {0}", artist);
                logger.log(Level.INFO, "Album: {0}", album);
                logger.log(Level.INFO, "");
            }
        } catch (Exception e) {
            logger.log(Level.SEVERE, "An error occurred while processing and displaying data.", e);
        }
    }
}
