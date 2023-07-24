package com.david.java.protocols;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * UDPDemo demonstrates a simple UDP client-server communication in Java.
 * The server listens on a specified port and receives data from the client,
 * and the client sends a message to the server and receives a response.
 * Both the server and client run in the same class for simplicity.
 * <p>
 * Author: David
 */
public class UDPDemo {
    public static void main(String[] args) {
        Thread serverThread = new Thread(() -> runServer());
        serverThread.start();

        // Sleep for a short time to allow the server to start listening
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        runClient();
    }

    /**
     * Runs the UDP server.
     */
    private static void runServer() {
        try {
            int port = 8888;
            DatagramSocket serverSocket = new DatagramSocket(port);
            System.out.println("UDP Server: Waiting for client messages...");

            byte[] receiveData = new byte[1024];

            while (true) {
                DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
                serverSocket.receive(receivePacket);

                String receivedMessage = new String(receivePacket.getData(), 0, receivePacket.getLength());
                System.out.println("UDP Server: Received message from client: " + receivedMessage);

                // Process the received message or perform other operations as needed

                // Send a response back to the client
                String response = "Hello from Server!";
                sendDataToClient(receivePacket.getAddress(), receivePacket.getPort(), response);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Runs the UDP client.
     */
    private static void runClient() {
        try {
            String serverAddress = "localhost";
            int serverPort = 8888;

            DatagramSocket clientSocket = new DatagramSocket();
            InetAddress serverIPAddress = InetAddress.getByName(serverAddress);

            String message = "Hello from Client!";
            sendDataToServer(clientSocket, serverIPAddress, serverPort, message);

            byte[] receiveData = new byte[1024];
            DatagramPacket receivePacket = new DatagramPacket(receiveData, receiveData.length);
            clientSocket.receive(receivePacket);

            String receivedMessage = new String(receivePacket.getData(), 0, receivePacket.getLength());
            System.out.println("UDP Client: Received message from server: " + receivedMessage);

            clientSocket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Sends data to the UDP server.
     *
     * @param clientSocket The client socket.
     * @param serverIP     The server IP address.
     * @param serverPort   The server port.
     * @param message      The message to send.
     * @throws IOException if an I/O error occurs.
     */
    private static void sendDataToServer(DatagramSocket clientSocket, InetAddress serverIP, int serverPort, String message) throws IOException {
        byte[] sendData = message.getBytes();
        DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, serverIP, serverPort);
        clientSocket.send(sendPacket);
        System.out.println("UDP Client: Sent message to server: " + message);
    }

    /**
     * Sends data to the UDP client.
     *
     * @param clientIP   The client IP address.
     * @param clientPort The client port.
     * @param message    The message to send.
     * @throws IOException if an I/O error occurs.
     */
    private static void sendDataToClient(InetAddress clientIP, int clientPort, String message) throws IOException {
        DatagramSocket serverSocket = new DatagramSocket();
        byte[] sendData = message.getBytes();
        DatagramPacket sendPacket = new DatagramPacket(sendData, sendData.length, clientIP, clientPort);
        serverSocket.send(sendPacket);
        System.out.println("UDP Server: Sent response to client: " + message);
        serverSocket.close();
    }
}
