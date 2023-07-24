package com.david.java.protocols;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * TCPDemo demonstrates a simple TCP server-client communication in Java.
 * The server listens on a specified port and receives data from the client,
 * and the client connects to the server and sends a message.
 * Both the server and client run in separate threads to allow concurrent execution.
 * <p>
 * Author: David
 */
public class TCPDemo {
    public static void main(String[] args) {
        // Run the server in a separate thread
        Thread serverThread = new Thread(TCPDemo::runServer);
        serverThread.start();

        // Sleep for a short time to allow the server to start listening
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Run the client
        runClient();
    }

    /**
     * Runs the TCP server.
     */
    private static void runServer() {
        try {
            int port = 8888;
            ServerSocket serverSocket = new ServerSocket(port);
            System.out.println("TCP Server: Waiting for client connection...");

            Socket clientSocket = serverSocket.accept();
            System.out.println("TCP Server: Client connected.");

            BufferedReader in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
            PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);

            // Read data from the client
            String receivedData = in.readLine();
            System.out.println("TCP Server: Received data from client: " + receivedData);

            // Process data or perform actions based on the received data
            String response = "Hello from Server!";
            out.println(response);
            System.out.println("TCP Server: Sent response to client: " + response);

            clientSocket.close();
            serverSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Runs the TCP client.
     */
    private static void runClient() {
        try {
            String serverAddress = "localhost";
            int port = 8888;

            Socket socket = new Socket(serverAddress, port);
            System.out.println("TCP Client: Connected to server.");

            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

            // Send data to the server
            String message = "Hello from Client!";
            out.println(message);
            System.out.println("TCP Client: Sent data to server: " + message);

            // Receive response from the server
            String response = in.readLine();
            System.out.println("TCP Client: Received response from server: " + response);

            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
