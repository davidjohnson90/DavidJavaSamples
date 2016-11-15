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
public class RedisOTRS {
	public static void main(String[] args) {
		// Connecting to Redis server on localhost
		Jedis jedis = new Jedis("172.16.2.161");
		System.out.println("Connection to server sucessfully");
		// check whether server is running or not
		System.out.println("Server is running: " + jedis.ping());
		// set the data in redis string
		jedis.set("url", "http://96.82.85.69:8888/otrs/nph-genericinterface.pl/Webservice/GenericTicketConnectorREST/Ticket");
		jedis.set("username", "david.johnson@techmahindra.com");
		jedis.set("password", "1234567");
		jedis.set("ticketingSystem", "otrs");
		jedis.set("action", "start");
		jedis.set("severity", "4");
		jedis.set("allArticlesEnabled", "1");
		jedis.set("dynamicFields", "1");
		jedis.set("ticketURL", "http://172.16.2.161/api/ticket/incident/");

		// Get the stored data and print it
		System.out.println("Stored string in redis::: hostname = " + jedis.get("hostname") + ", username = "
				+ jedis.get("username") + ", password = " + jedis.get("password") + ", url = " + jedis.get("url")
				+ ", ticketingSystem = " + jedis.get("ticketingSystem") + ", severity = " + jedis.get("severity")
				+ ", action = " + jedis.get("action") + ", allArticlesEnabled = " + jedis.get("allArticlesEnabled")
				+ ", dynamicFields = " + jedis.get("dynamicFields") + ", ticketURL = " + jedis.get("ticketURL"));

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
		props.put(RedisConstant.TICKET_HOSTNAME, jedis.get(RedisConstant.TICKET_HOSTNAME));
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
		props.put(RedisConstant.TICKET_HOSTNAME, RedisConstant.get(RedisConstant.TICKET_HOSTNAME));
		return props;
	}
}