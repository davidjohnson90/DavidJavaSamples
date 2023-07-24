package com.david.java.protocols;

import java.io.IOException;
import java.net.InetAddress;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * IPDemo demonstrates working with IP addresses using Java.
 * It retrieves the local host IP address, gets the IP address of a specific host, checks if an IP address is reachable (ping),
 * and demonstrates converting IPv4 to IPv6 address representation.
 *
 * @author David
 */
public class IPDemo {
    private static final Logger LOGGER = Logger.getLogger(IPDemo.class.getName());

    public static void main(String[] args) {
        try {
            // Get Local Host IP Address
            InetAddress localHost = InetAddress.getLocalHost();
            LOGGER.info("Local Host IP Address: " + localHost.getHostAddress());

            // Get IP Address of a Specific Host
            String hostName = "www.google.com";
            InetAddress address = InetAddress.getByName(hostName);
            LOGGER.info("IP Address of " + hostName + ": " + address.getHostAddress());

            // Check if an IP Address is Reachable (Ping)
            String ipAddress = "8.8.8.8";
            address = InetAddress.getByName(ipAddress);
            boolean isReachable = address.isReachable(5000); // Timeout in milliseconds
            LOGGER.info("Is " + ipAddress + " reachable? " + isReachable);

            // IPv4 Address
            byte[] ipv4Address = address.getAddress();
            LOGGER.info("IPv4 Address: " + toIPv6Address(ipv4Address));

            // IPv6 Address
            String ipv6Sample = "2001:0db8:85a3:0000:0000:8a2e:0370:7334";
            byte[] ipv6SampleBytes = toIPv6ByteArray(ipv6Sample);
            LOGGER.info("IPv6 Address: " + toIPv6Address(ipv6SampleBytes));
        } catch (IOException e) {
            LOGGER.log(Level.SEVERE, "Error in IPDemo", e);
        }
    }

    /**
     * Converts a byte array representing an IPv6 address to its hexadecimal format.
     *
     * @param addressBytes the byte array representing the IPv6 address.
     * @return the hexadecimal representation of the IPv6 address.
     */
    private static String toIPv6Address(byte[] addressBytes) {
        // Check if the addressBytes represent an IPv4 address
        if (addressBytes.length == 4) {
            // Convert IPv4 address to standard dotted-decimal format
            return (addressBytes[0] & 0xFF) + "." + (addressBytes[1] & 0xFF) + "." + (addressBytes[2] & 0xFF) + "." + (addressBytes[3] & 0xFF);
        } else if (addressBytes.length == 16) {
            // Convert IPv6 address to hexadecimal format
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < addressBytes.length; i += 2) {
                sb.append(Integer.toHexString((addressBytes[i] << 8) & 0xFF00 | (addressBytes[i + 1] & 0xFF)));
                if (i < addressBytes.length - 2) {
                    sb.append(":");
                }
            }
            return "[" + sb.toString() + "]";
        } else {
            return "Invalid IP address";
        }
    }

    /**
     * Converts an IPv6 address from a string representation to a byte array.
     *
     * @param ipv6Address the IPv6 address in string format.
     * @return the byte array representing the IPv6 address.
     */
    private static byte[] toIPv6ByteArray(String ipv6Address) {
        String[] parts = ipv6Address.split(":");
        byte[] result = new byte[16];
        int index = 0;

        for (String part : parts) {
            int value = Integer.parseInt(part, 16);
            result[index++] = (byte) ((value >> 8) & 0xFF);
            result[index++] = (byte) (value & 0xFF);
        }

        return result;
    }
}
