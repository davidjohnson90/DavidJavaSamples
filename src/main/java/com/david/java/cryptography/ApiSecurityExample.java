package com.david.java.cryptography;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

import org.apache.commons.codec.binary.Base64;

/**
 *
 * Class details
 * 
 */
public class ApiSecurityExample {

  public static void main(String[] args) {
    String secret = "secret";
    String message = "Message";
    String hash = cryptographer(secret, message);
    System.out.println(hash);
  }

  /**
   * Purpose of the Method
   * @return
   */
  public static String cryptographer(String secret, String message) {
    String hash = null;
    try {

      Mac sha256_HMAC = Mac.getInstance("HmacSHA256");
      SecretKeySpec secret_key = new SecretKeySpec(secret.getBytes(), "HmacSHA256");
      sha256_HMAC.init(secret_key);

      hash = Base64.encodeBase64String(sha256_HMAC.doFinal(message.getBytes()));
    } catch (Exception e) {
      e.printStackTrace();
    }
    return hash;
  }
}
