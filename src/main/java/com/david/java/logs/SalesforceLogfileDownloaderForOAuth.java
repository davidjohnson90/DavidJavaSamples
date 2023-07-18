package com.david.java.logs;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

public class SalesforceLogfileDownloaderForOAuth {
    private static final String SALESFORCE_INSTANCE_URL = "YOUR_SALESFORCE_INSTANCE_URL";
    private static final String SALESFORCE_API_VERSION = "API_VERSION";
    private static final String SALESFORCE_ACCESS_TOKEN = "YOUR_ACCESS_TOKEN";
    private static final String LOG_FILE_ID = "LOG_FILE_ID";

    public static void main(String[] args) {
        String logFileUrl = SALESFORCE_INSTANCE_URL + "/services/data/" + SALESFORCE_API_VERSION + "/sobjects/ApexLog/" + LOG_FILE_ID + "/Body/";

        try {
            // Set up the connection
            URL url = new URL(logFileUrl);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestProperty("Authorization", "Bearer " + SALESFORCE_ACCESS_TOKEN);
            connection.setRequestMethod("GET");

            // Get the response code
            int responseCode = connection.getResponseCode();
            if (responseCode == HttpURLConnection.HTTP_OK) {
                // Create a temporary file to store the log file
                File tempFile = File.createTempFile("log", ".txt");

                // Copy the log file content to the temporary file
                InputStream inputStream = connection.getInputStream();
                Files.copy(inputStream, tempFile.toPath(), StandardCopyOption.REPLACE_EXISTING);
                inputStream.close();

                // Provide the path to the downloaded log file
                System.out.println("Log file downloaded successfully. Path: " + tempFile.getAbsolutePath());
            } else {
                System.out.println("Failed to download log file. Response Code: " + responseCode);
            }

            // Close the connection
            connection.disconnect();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}