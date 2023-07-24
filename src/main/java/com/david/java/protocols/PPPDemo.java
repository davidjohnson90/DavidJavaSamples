package com.david.java.protocols;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * PPPDemo demonstrates a simplified PPP-like communication using Java sockets.
 * It includes a PPP server and a PPP client that establish a point-to-point connection and perform basic authentication.
 * For illustrative purposes, this example shows basic PPP link establishment and data transmission.
 *
 * @author David
 */
public class PPPDemo {
    private static final Logger LOGGER = Logger.getLogger(PPPDemo.class.getName());

    public static void main(String[] args) {
        Thread serverThread = new Thread(() -> {
            try {
                startServer();
            } catch (IOException e) {
                LOGGER.log(Level.SEVERE, "Error in PPP server", e);
            }
        });
        serverThread.start();

        Thread clientThread = new Thread(() -> {
            try {
                startClient();
            } catch (IOException e) {
                LOGGER.log(Level.SEVERE, "Error in PPP client", e);
            }
        });
        clientThread.start();
    }

    /**
     * Starts the PPP server to listen for client connections.
     *
     * @throws IOException if an I/O error occurs while accepting client connections.
     */
    private static void startServer() throws IOException {
        ServerSocket serverSocket = new ServerSocket(8888);
        LOGGER.info("PPP Server: Waiting for connection...");
        Socket socket = serverSocket.accept();
        LOGGER.info("PPP Server: Client connected.");

        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

        // Simulated PPP authentication
        String username = "client";
        String password = "pass123";
        out.println("Username: " + username);
        out.println("Password: " + password);

        String response;
        while ((response = in.readLine()) != null) {
            LOGGER.info("PPP Server: Received data from client: " + response);
            // Process the received data or perform PPP operations as needed
        }

        socket.close();
        serverSocket.close();
    }

    /**
     * Starts the PPP client to connect to the server.
     *
     * @throws IOException if an I/O error occurs while connecting to the server.
     */
    private static void startClient() throws IOException {
        Socket socket = new Socket("localhost", 8888);
        LOGGER.info("PPP Client: Connected to server.");

        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));

        // Simulated PPP authentication
        String username = in.readLine();
        String password = in.readLine();
        LOGGER.info("PPP Client: Received authentication data: ");
        LOGGER.info("Username: " + username);
        LOGGER.info("Password: " + password);

        // Simulated PPP data transmission
        String message = "Hello from client!";
        out.println(message);
        LOGGER.info("PPP Client: Sent data to server: " + message);

        socket.close();
    }
}
