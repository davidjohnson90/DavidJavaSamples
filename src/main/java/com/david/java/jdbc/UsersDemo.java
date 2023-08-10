package com.david.java.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * A program to demonstrate fetching user data from a Microsoft Access database using JDBC.
 * This program connects to a Microsoft Access database named "UserInfo.accdb"
 * located in the resources directory and retrieves data from the "users" table.
 * <p>
 * Note: Make sure to include the UCanAccess library in your project for accessing Access databases.
 * You can download it from: http://ucanaccess.sourceforge.net/site.html
 *
 * @author David
 */
public class UsersDemo {
    // Create a logger for the class
    private static final Logger logger = Logger.getLogger(UsersDemo.class.getName());

    /**
     * The main method that serves as the entry point of the program.
     *
     * @param args Command-line arguments (not used in this program).
     */
    public static void main(String[] args) {
        // Database connection URL
        String dbUrl = "jdbc:ucanaccess://src/main/resources/UserInfo.accdb";

        try (Connection connection = DriverManager.getConnection(dbUrl)) {
            Statement statement = connection.createStatement();
            String sql = "SELECT * FROM users";
            ResultSet resultSet = statement.executeQuery(sql);

            // Process and display retrieved user data
            processAndDisplayUserData(resultSet);
        } catch (Exception e) {
            logger.log(Level.SEVERE, "An error occurred while fetching user data from the database.", e);
        }
    }

    /**
     * Processes and displays the retrieved user data from the ResultSet.
     *
     * @param resultSet The ResultSet containing the retrieved user data.
     */
    private static void processAndDisplayUserData(ResultSet resultSet) {
        try {
            while (resultSet.next()) {
                String userId = resultSet.getString(1);
                String userName = resultSet.getString(5);
                String firstName = resultSet.getString(2);
                String lastName = resultSet.getString(3);
                String email = resultSet.getString(4);

                // Log retrieved user data
                logger.log(Level.INFO, "User ID: {0}", userId);
                logger.log(Level.INFO, "Username: {0}", userName);
                logger.log(Level.INFO, "First Name: {0}", firstName);
                logger.log(Level.INFO, "Last Name: {0}", lastName);
                logger.log(Level.INFO, "Email: {0}", email);
                logger.log(Level.INFO, "");
            }
        } catch (Exception e) {
            logger.log(Level.SEVERE, "An error occurred while processing and displaying user data.", e);
        }
    }
}
