/**
 * 
 */
package com.david.java.email;

import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 * @author David
 *
 */
public class SendMailSSL {
	public static void main(String[] args) {

		String to = "davidjohnson90@gmail.com";// change accordingly

		// Get the session object
		Properties props = new Properties();
		props.put("mail.smtp.host", "smtp.gmail.com");
		props.put("mail.smtp.socketFactory.port", "465");
		props.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
		props.put("mail.smtp.auth", "true");
		props.put("mail.smtp.port", "465");

		Session session = Session.getDefaultInstance(props, new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication("davidjohnson90@gmail.com", "");// change
				// accordingly
			}
		});

		// compose message
		try {
			MimeMessage message = new MimeMessage(session);
			message.setFrom(new InternetAddress("davidjohnson90@gmail.com"));// change
																				// accordingly
			message.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
			message.setSubject("Hello");
			message.setText("Testing.......");

			// send message
			Transport.send(message);

			System.out.println("message sent successfully");

		} catch (MessagingException e) {
			throw new RuntimeException(e);
		}

	}
}
