package com.david.java.authentication;

import org.apache.commons.codec.digest.DigestUtils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class DigestAuthenticationExample {

    public static void main(String[] args) throws IOException {
        String username = "your_username";
        String password = "your_password";
        String url = "http://example.com/protected/resource";

        // Step 1: Send an initial request to get the server's authentication parameters
        HttpURLConnection initialConnection = (HttpURLConnection) new URL(url).openConnection();
        initialConnection.setRequestMethod("GET");
        initialConnection.connect();

        // Step 2: Extract the authentication parameters from the response
        String authenticationHeader = initialConnection.getHeaderField("WWW-Authenticate");
        String realm = extractParameter(authenticationHeader, "realm");
        String nonce = extractParameter(authenticationHeader, "nonce");

        // Step 3: Calculate the response hash using the username, password, realm, and nonce
        String response = calculateResponse(username, password, realm, nonce, "GET", url);

        // Step 4: Send the authenticated request with the calculated response
        HttpURLConnection authenticatedConnection = (HttpURLConnection) new URL(url).openConnection();
        authenticatedConnection.setRequestMethod("GET");
        authenticatedConnection.setRequestProperty("Authorization", "Digest username=\"" + username + "\", realm=\"" + realm + "\", nonce=\"" + nonce + "\", uri=\"" + url + "\", response=\"" + response + "\"");

        int responseCode = authenticatedConnection.getResponseCode();
        if (responseCode == HttpURLConnection.HTTP_OK) {
            BufferedReader reader = new BufferedReader(new InputStreamReader(authenticatedConnection.getInputStream()));
            String line;
            StringBuilder responseContent = new StringBuilder();
            while ((line = reader.readLine()) != null) {
                responseContent.append(line);
            }
            reader.close();

            System.out.println("Response: " + responseContent.toString());
        } else {
            System.out.println("Authentication failed. Response Code: " + responseCode);
        }
    }

    private static String extractParameter(String header, String parameter) {
        String[] parts = header.split(", ");
        for (String part : parts) {
            if (part.startsWith(parameter + "=\"")) {
                return part.substring(parameter.length() + 2, part.length() - 1);
            }
        }
        return null;
    }

    private static String calculateResponse(String username, String password, String realm, String nonce, String method, String uri) {
        // Calculate the MD5 hash of the concatenated values
        String hash1 = DigestUtils.md5Hex(username + ":" + realm + ":" + password);
        String hash2 = DigestUtils.md5Hex(method + ":" + uri);
        return DigestUtils.md5Hex(hash1 + ":" + nonce + ":" + hash2);
    }
}
