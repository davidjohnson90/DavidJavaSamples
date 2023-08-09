package com.david.java.email;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * The SendMailSSL class demonstrates how to send an email using JavaMail API with SSL authentication.
 * Author: David
 */
public class SendMailSSL {

    private static final Logger logger = Logger.getLogger(SendMailSSL.class.getName());

    public static void main(String[] args) {
        String to = "davidjohnson90@gmail.com"; // Replace with the recipient's email address.

        // Load Gmail credentials from an external configuration file.
        Properties credentials = new Properties();
        try {
            credentials.load(new FileInputStream("gmail_credentials.properties"));
        } catch (IOException e) {
            logger.log(Level.SEVERE, "Error while reading Gmail credentials: " + e.getMessage(), e);
            return;
        }

        String username = credentials.getProperty("username");
        String password = credentials.getProperty("password");

        // Get the session object.
        Properties props = new Properties();
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.socketFactory.port", "465");
        props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.port", "465");

        Session session = Session.getDefaultInstance(props, new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username, password);
            }
        });

        // Compose the message.
        try {
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress(username));
            message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
            message.setSubject("Hello");
            message.setText("Testing.......");

            // Send the message.
            Transport.send(message);
            logger.log(Level.INFO, "Message sent successfully.");
        } catch (MessagingException e) {
            logger.log(Level.SEVERE, "Error while sending email: " + e.getMessage(), e);
        }
    }
}
