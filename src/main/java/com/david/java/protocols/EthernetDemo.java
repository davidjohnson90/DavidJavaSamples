package com.david.java.protocols;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * EthernetDemo demonstrates basic Ethernet-like communication using UDP.
 * It includes a sender that sends a message to a receiver over a simulated Ethernet network.
 * The receiver listens for incoming messages and prints the received message to the console.
 *
 * @author David
 */
public class EthernetDemo {
    private static final int DESTINATION_PORT = 8888;
    private static final int LISTENING_PORT = 8888;

    public static void main(String[] args) {
        // Start the receiver thread
        Thread receiverThread = new Thread(() -> {
            try {
                receiveData();
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
        receiverThread.start();

        // Sleep for a short time to ensure the receiver thread is ready to listen
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        sendData();

        // Wait for the receiver thread to finish
        try {
            receiverThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /**
     * Receives data over UDP and prints the received message to the console.
     *
     * @throws IOException if an I/O error occurs while receiving data.
     */
    private static void receiveData() throws IOException {
        byte[] buffer = new byte[1024];
        DatagramPacket packet = new DatagramPacket(buffer, buffer.length);

        DatagramSocket socket = new DatagramSocket(LISTENING_PORT);
        System.out.println("Receiver started. Waiting for messages...");

        socket.receive(packet);

        String receivedData = new String(packet.getData(), 0, packet.getLength());
        System.out.println("Received message: " + receivedData);

        socket.close();
    }

    /**
     * Sends data over UDP to the receiver.
     */
    private static void sendData() {
        try {
            String message = "Hello from Sender - David!";
            byte[] dataBytes = message.getBytes();

            InetAddress destinationAddress = InetAddress.getLocalHost(); // Replace with the receiver's IP address
            DatagramPacket packet = new DatagramPacket(dataBytes, dataBytes.length, destinationAddress, DESTINATION_PORT);

            DatagramSocket socket = new DatagramSocket();
            socket.send(packet);
            System.out.println("Message sent to " + destinationAddress.getHostAddress());

            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
