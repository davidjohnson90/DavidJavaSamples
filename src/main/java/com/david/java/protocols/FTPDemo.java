package com.david.java.protocols;

import org.apache.commons.net.ftp.FTP;
import org.apache.commons.net.ftp.FTPClient;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * FTPDemo demonstrates FTP operations in Java using the Apache Commons Net library.
 * It connects to an FTP server, uploads a file, and downloads a file.
 * <p>
 * Author: David
 */
public class FTPDemo {
    private static final Logger LOGGER = Logger.getLogger(FTPDemo.class.getName());

    public static void main(String[] args) {
        String server = "127.0.0.1";
        int port = 21;
        String username = "tester";
        String password = "password";
        String remoteFile = "/test/testfile.txt";
        String localFile = "D:\\Current\\testSFTP\\testfile.txt";

        FTPClient ftpClient = new FTPClient();

        try {
            // Connect to the FTP server
            ftpClient.connect(server, port);
            LOGGER.log(Level.INFO, "Connected to FTP server: " + server);

            // Login to the FTP server
            ftpClient.login(username, password);
            LOGGER.log(Level.INFO, "Logged in to FTP server as: " + username);

            // Set binary file transfer mode
            ftpClient.setFileType(FTP.BINARY_FILE_TYPE);

            // Upload a file to the FTP server
            boolean uploaded = uploadFile(ftpClient, remoteFile, localFile);
            if (uploaded) {
                LOGGER.log(Level.INFO, "File uploaded successfully.");
            } else {
                LOGGER.log(Level.SEVERE, "File upload failed.");
            }

            // Download a file from the FTP server
            boolean downloaded = downloadFile(ftpClient, remoteFile, "testfile.txt");
            if (downloaded) {
                LOGGER.log(Level.INFO, "File downloaded successfully.");
            } else {
                LOGGER.log(Level.SEVERE, "File download failed.");
            }

            // Logout and disconnect from the FTP server
            ftpClient.logout();
            ftpClient.disconnect();
        } catch (IOException e) {
            LOGGER.log(Level.SEVERE, "Error occurred: ", e);
        }
    }

    private static boolean uploadFile(FTPClient ftpClient, String remoteFile, String localFile) throws IOException {
        return ftpClient.storeFile(remoteFile, ftpClient.retrieveFileStream(localFile));
    }

    private static boolean downloadFile(FTPClient ftpClient, String remoteFile, String localFile) throws IOException {
        return ftpClient.retrieveFile(remoteFile, ftpClient.storeFileStream(localFile));
    }
}
