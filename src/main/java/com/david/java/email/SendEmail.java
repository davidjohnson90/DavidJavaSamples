package com.david.java.email;

import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 * The SendEmail class demonstrates how to send an email using JavaMail API with authenticated SMTP.
 * Author: David
 */
public class SendEmail {

	private static final Logger logger = Logger.getLogger(SendEmail.class.getName());

	public static void main(String[] args) {
		// Recipient's email ID needs to be mentioned.
		String to = "davidjohnson90@gmail.com";

		// Sender's email ID needs to be mentioned.
		String from = "your-email@gmail.com"; // Replace with your Gmail address.

		// Your Gmail account credentials.
		final String username = "your-email@gmail.com"; // Replace with your Gmail address.
		final String password = "your-password"; // Replace with your Gmail password.

		// Assuming you are sending email through Gmail's SMTP server.
		String host = "smtp.gmail.com";

		// Get system properties.
		Properties properties = System.getProperties();

		// Setup mail server.
		properties.setProperty("mail.smtp.host", host);
		properties.setProperty("mail.smtp.port", "587"); // Gmail's SMTP port.
		properties.setProperty("mail.smtp.auth", "true");
		properties.setProperty("mail.smtp.starttls.enable", "true");

		// Get the default Session object with authentication.
		Session session = Session.getInstance(properties, new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication(username, password);
			}
		});

		try {
			// Create a default MimeMessage object.
			MimeMessage message = new MimeMessage(session);

			// Set From: header field of the header.
			message.setFrom(new InternetAddress(from));

			// Set To: header field of the header.
			message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));

			// Set Subject: header field.
			message.setSubject("This is the Subject Line!");

			// Now set the actual message.
			message.setText("This is the actual message.");

			// Send message.
			Transport.send(message);
			logger.log(Level.INFO, "Sent message successfully.");
		} catch (MessagingException mex) {
			logger.log(Level.SEVERE, "Error while sending email: " + mex.getMessage(), mex);
		}
	}
}
