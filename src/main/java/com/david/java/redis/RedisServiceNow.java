/**
 * 
 */
package com.david.java.redis;

import java.util.Properties;

import redis.clients.jedis.Jedis;

/**
 * @author David
 *
 */
public class RedisServiceNow {
	public static void main(String[] args) {
		// Connecting to Redis server on localhost
		// Jedis jedis = new Jedis("172.16.2.161");
		Jedis jedis = new Jedis("192.168.128.15");
		System.out.println("Connection to server sucessfully");
		// check whether server is running or not
		System.out.println("Server is running: " + jedis.ping());
		// set the data in redis string
		jedis.set(RedisConstant.TICKET_URL, "https://dev22351.service-now.com");
		jedis.set(RedisConstant.TICKET_USERNAME, "admin");
		jedis.set(RedisConstant.TICKET_PASSWORD, "Gods*Child1");
		jedis.set(RedisConstant.TICKET_SYSTEM, "serviceNow");
		jedis.set(RedisConstant.TICKET_ACTION, "start");
		jedis.set(RedisConstant.TICKET_SEVERITY, "4");
		// jedis.set("ticketURL",
		// "http://172.16.2.161:8081/api/ticket/incident/");

		String hostname = jedis.get("url");
		hostname = hostname.replaceAll("https://", "");
		
		// Get the stored data and print it
		System.out.println("Stored string in redis::: ticketingUsername = " + jedis.get(RedisConstant.TICKET_USERNAME)
				+ ", ticketingPassword = " + jedis.get(RedisConstant.TICKET_PASSWORD) + ", ticketingUrl = "
				+ jedis.get(RedisConstant.TICKET_URL) + ", ticketingSystem = " + jedis.get(RedisConstant.TICKET_SYSTEM)
				+ ", ticketingSeverity = " + jedis.get(RedisConstant.TICKET_SYSTEM) + ", ticketingAction = "
				+ jedis.get(RedisConstant.TICKET_ACTION));

		// Get the stored data and print it
		// HashSet<String> listKeys = (HashSet<String>) jedis.keys("*");
		// System.out.println("List of stored keys:: " + listKeys.size());

		// for (int i = 0; i < listKeys.size(); i++) {

		// RedisConstant redisConstant = new RedisConstant();

		// System.out.println(RedisConstant.TICKET_URL);
		// Properties prop = getProperties(jedis);
		// System.out.println(prop.toString());
		//
		// System.out.println(RedisConstant.get(RedisConstant.TICKET_URL));
		// prop = getRedisProperties();
		// System.out.println(prop.toString());

		// + " ::: "
		// + listKeys.toString());
		// }
		jedis.close();
	}

	public static Properties getProperties(Jedis jedis) {
		Properties props = new Properties();
		props.put(RedisConstant.TICKET_URL, jedis.get(RedisConstant.TICKET_URL));
		props.put(RedisConstant.TICKET_USERNAME, jedis.get(RedisConstant.TICKET_USERNAME));
		props.put(RedisConstant.TICKET_PASSWORD, jedis.get(RedisConstant.TICKET_PASSWORD));
		props.put(RedisConstant.TICKET_SYSTEM, jedis.get(RedisConstant.TICKET_SYSTEM));
		props.put(RedisConstant.TICKET_ACTION, jedis.get(RedisConstant.TICKET_ACTION));
		props.put(RedisConstant.TICKET_SEVERITY, jedis.get(RedisConstant.TICKET_SEVERITY));
		return props;
	}

	public static Properties getRedisProperties() {
		Properties props = new Properties();
		props.put(RedisConstant.TICKET_URL, RedisConstant.get(RedisConstant.TICKET_URL));
		props.put(RedisConstant.TICKET_USERNAME, RedisConstant.get(RedisConstant.TICKET_USERNAME));
		props.put(RedisConstant.TICKET_PASSWORD, RedisConstant.get(RedisConstant.TICKET_PASSWORD));
		props.put(RedisConstant.TICKET_SYSTEM, RedisConstant.get(RedisConstant.TICKET_SYSTEM));
		props.put(RedisConstant.TICKET_ACTION, RedisConstant.get(RedisConstant.TICKET_ACTION));
		props.put(RedisConstant.TICKET_SEVERITY, RedisConstant.get(RedisConstant.TICKET_SEVERITY));
		return props;
	}
}