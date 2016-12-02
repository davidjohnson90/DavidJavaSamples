package com.david.java.redis;

import redis.clients.jedis.Jedis;

public class RedisGeneral {
	public static void main(String[] args) {
		Jedis jedis = new Jedis("172.17.254.99");
		// Server IPs
		// 172.16.2.161, 172.17.254.99, 192.168.128.15
		System.out.println("Server status - Ping - " + jedis.ping());
		// set the data in redis string
		// jedis.set("eventTicketMap", "");
		System.out.println("eventTicketMap = " + jedis.get("eventTicketMap"));
		System.out.println("Stored in Redis ::: ticketingUsername = " + jedis.get(RedisProducerUtil.TICKET_USERNAME)
				+ ", ticketingPassword = " + jedis.get(RedisProducerUtil.TICKET_PASSWORD) + ", ticketingUrl = "
				+ jedis.get(RedisProducerUtil.TICKET_URL) + ", ticketingSystem = "
				+ jedis.get(RedisProducerUtil.TICKET_SYSTEM) + ", ticketingSeverity = "
				+ jedis.get(RedisProducerUtil.TICKET_SYSTEM) + ", ticketingWrite = "
				+ jedis.get(RedisProducerUtil.TICKET_WRITE) + ", ticketingRead = "
				+ jedis.get(RedisProducerUtil.TICKET_READ));
		jedis.close();
	}
}
