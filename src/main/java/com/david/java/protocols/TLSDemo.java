package com.david.java.protocols;

import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocketFactory;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * TLSDemo demonstrates a simple TLS connection and HTTPS GET request in Java using HttpsURLConnection.
 * It fetches data from the given URL over a secure TLS connection and prints the response.
 * <p>
 * Author: David
 */
public class TLSDemo {
    private static final Logger LOGGER = Logger.getLogger(TLSDemo.class.getName());

    public static void main(String[] args) {
        String urlStr = "https://jsonplaceholder.typicode.com/posts/1";

        try {
            // Create an SSLSocketFactory with TLS support
            SSLSocketFactory sslSocketFactory = (SSLSocketFactory) SSLSocketFactory.getDefault();

            URL url = new URL(urlStr);
            HttpsURLConnection connection = (HttpsURLConnection) url.openConnection();
            connection.setSSLSocketFactory(sslSocketFactory);

            // Set the request method to GET
            connection.setRequestMethod("GET");

            // Get the response code
            int responseCode = connection.getResponseCode();
            LOGGER.log(Level.INFO, "Response Code: " + responseCode);

            // Read the response from the server
            BufferedReader reader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String inputLine;
            StringBuilder response = new StringBuilder();
            while ((inputLine = reader.readLine()) != null) {
                response.append(inputLine);
            }
            reader.close();

            // Print the response
            LOGGER.log(Level.INFO, "Response Body: " + response.toString());

            // Disconnect the connection
            connection.disconnect();
        } catch (IOException e) {
            LOGGER.log(Level.SEVERE, "An error occurred: ", e);
        }
    }
}
