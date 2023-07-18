package com.david.java.logs;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

public class LogFileDownloaderForOAuth {
    public static void main(String[] args) {
        String oauthToken = "YOUR_OAUTH_TOKEN";
        String logFileUrl = "URL_TO_LOG_FILE";

        try {
            // Set up the connection
            URL url = new URL(logFileUrl);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestProperty("Authorization", "Bearer " + oauthToken);
            connection.setRequestMethod("GET");

            // Get the response code
            int responseCode = connection.getResponseCode();
            if (responseCode == HttpURLConnection.HTTP_OK) {
                // Create a temporary file to store the log file
                File tempFile = File.createTempFile("log", ".txt");

                // Copy the log f   ile content to the temporary file
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
