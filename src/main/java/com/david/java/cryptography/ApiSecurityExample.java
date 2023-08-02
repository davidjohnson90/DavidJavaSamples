package com.david.java.cryptography;

import org.apache.commons.codec.binary.Base64;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * The ApiSecurityExample class demonstrates how to create a cryptographic hash using the HMAC-SHA256 algorithm for a given message and secret key.
 * Author: David
 */
public class ApiSecurityExample {

    private static final Logger logger = Logger.getLogger(ApiSecurityExample.class.getName());

    public static void main(String[] args) {
        String secret = "secret";
        String message = "Message";
        String hash = cryptographer(secret, message);
        logger.log(Level.INFO, "Generated Hash: {0}", hash);
    }

    /**
     * The cryptographer method creates a cryptographic hash using the HMAC-SHA256 algorithm.
     *
     * @param secret  The secret key used for hashing.
     * @param message The message to be hashed.
     * @return The resulting hash as a Base64-encoded string.
     */
    public static String cryptographer(String secret, String message) {
        String hash = null;
        try {
            Mac sha256HMAC = Mac.getInstance("HmacSHA256");
            SecretKeySpec secretKey = new SecretKeySpec(secret.getBytes(), "HmacSHA256");
            sha256HMAC.init(secretKey);

            byte[] hashBytes = sha256HMAC.doFinal(message.getBytes());
            hash = Base64.encodeBase64String(hashBytes);
        } catch (Exception e) {
            logger.log(Level.SEVERE, "Error while generating cryptographic hash: " + e.getMessage(), e);
        }
        return hash;
    }
}
