package com.david.java.protocols;

import com.jcraft.jsch.*;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * SFTPDemo demonstrates SFTP operations in Java using the JSch library.
 * It connects to an SFTP server, uploads a file, and downloads a file.
 * <p>
 * Author: David
 */
public class SFTPDemo {
    private static final Logger LOGGER = Logger.getLogger(SFTPDemo.class.getName());

    public static void main(String[] args) {
        String host = "localhost";
        int port = 22;
        String username = "tester";
        String password = "password";
        String remoteFile = "/test/testfile.txt";
        String localFile = "D:\\Current\\testSFTP\\testfile.txt";

        try {
            JSch jsch = new JSch();
            Session session = jsch.getSession(username, host, port);
            session.setPassword(password);
            session.setConfig("StrictHostKeyChecking", "no");

            session.connect();
            LOGGER.log(Level.INFO, "Connected to SFTP server: " + host);

            ChannelSftp channelSftp = (ChannelSftp) session.openChannel("sftp");
            channelSftp.connect();
            LOGGER.log(Level.INFO, "Logged in to SFTP server as: " + username);

            // Upload a file to the SFTP server
            uploadFile(channelSftp, remoteFile, localFile);
            LOGGER.log(Level.INFO, "File uploaded successfully.");

            // Download a file from the SFTP server
            downloadFile(channelSftp, remoteFile, "downloaded.txt");
            LOGGER.log(Level.INFO, "File downloaded successfully.");

            channelSftp.disconnect();
            session.disconnect();
        } catch (JSchException | SftpException e) {
            LOGGER.log(Level.SEVERE, "An error occurred: ", e);
        }
    }

    private static void uploadFile(ChannelSftp channelSftp, String remoteFile, String localFile) throws SftpException {
        channelSftp.put(localFile, remoteFile);
    }

    private static void downloadFile(ChannelSftp channelSftp, String remoteFile, String localFile) throws SftpException {
        channelSftp.get(remoteFile, localFile);
    }
}
