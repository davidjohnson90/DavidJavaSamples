/**
 * 
 */
package com.david.java.redis;

import java.util.HashSet;

import redis.clients.jedis.Jedis;

/**
 * @author David
 *
 */
public class RedisServiceNow {
	public static void main(String[] args) {
		// Connecting to Redis server on localhost
		Jedis jedis = new Jedis("172.16.2.161");
		System.out.println("Connection to server sucessfully");
		// check whether server is running or not
		System.out.println("Server is running: " + jedis.ping());
		jedis.set("ticket_severity", "3");
		// set the data in redis string
		// jedis.set("snHostName", "dev22351.service-now.com");
		// jedis.set("snUserName", "admin");
		// jedis.set("snPassword", "Gods*Child1");
		// Get the stored data and print it
		System.out.println("Stored string in redis::: snHostName = "
				+ jedis.get("ticket_hostname") + ", snUserName = "
				+ jedis.get("ticket_username") + ", snPassword = "
				+ jedis.get("ticket_password") + ", url = "
				+ jedis.get("ticket_url") + ", ticketSystem = "
				+ jedis.get("ticket_system") + ", ticketSeverity = "
				+ jedis.get("ticket_severity"));

		// Get the stored data and print it
		HashSet<String> listKeys = (HashSet<String>) jedis.keys("*");
		// // for (int i = 0; i < listKeys.size(); i++) {
		System.out.println("List of stored keys:: " + listKeys.size());
		// + " ::: "
		// + listKeys.toString());
		// }

		jedis.close();
	}
}