/**
 * 
 */
package com.david.java.redis;

import java.util.HashSet;
import java.util.List;

import redis.clients.jedis.Jedis;

/**
 * @author David
 *
 */
public class RedisJava {
	public static void main(String[] args) {
		// Connecting to Redis server on localhost
		Jedis jedis = new Jedis("172.16.2.161");
		System.out.println("Connection to server sucessfully");
		// check whether server is running or not
		System.out.println("Server is running: " + jedis.ping());

		// set the data in redis string
		jedis.set("david-name", "Hi David");
		// Get the stored data and print it
		System.out.println("Stored string in redis:: "
				+ jedis.get("david-name"));

		// store data in redis list
		jedis.lpush("david-list", "Redis");
		jedis.lpush("david-list", "Mongodb");
		jedis.lpush("david-list", "Mysql");
		// Get the stored data and print it
		List<String> list = jedis.lrange("david-list", 0, 5);
		for (int i = 0; i < list.size(); i++) {
			System.out.println("Stored string in redis:: " + list.get(i));
		}

		// Get the stored data and print it
		HashSet<String> listKeys = (HashSet<String>) jedis.keys("*");
		for (int i = 0; i < listKeys.size(); i++) {
			System.out.println("List of stored keys:: " + listKeys.toString());
		}

		jedis.close();
	}
}