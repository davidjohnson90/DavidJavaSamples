package com.david.java.authentication;

import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Base64;

public class BasicAuthExample {
    public static void main(String[] args) throws IOException {
        String username = "myUsername";
        String password = "myPassword";

        String urlString = "https://api.example.com/resource";
        URL url = new URL(urlString);
        HttpURLConnection connection = (HttpURLConnection) url.openConnection();

        // Encode username and password
        String authString = username + ":" + password;
        String encodedAuthString = Base64.getEncoder().encodeToString(authString.getBytes());

        // Set the Authorization header
        connection.setRequestProperty("Authorization", "Basic " + encodedAuthString);

        // Send the request and read the response
        int responseCode = connection.getResponseCode();
        if (responseCode == HttpURLConnection.HTTP_OK) {
            InputStream responseStream = connection.getInputStream();
            // Process the response
        } else {
            // Handle error response
        }
    }
}
