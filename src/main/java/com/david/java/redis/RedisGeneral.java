package com.david.java.redis;

import redis.clients.jedis.Jedis;

public class RedisGeneral {
  public static void main(String[] args) {
    Jedis jedis = new Jedis("localhost");
    // Server IPs
    // 172.16.2.161, 172.17.254.99, 192.168.128.15
    System.out.println("Server status - Ping - " + jedis.ping());
    // set the data in redis string
    // jedis.set("eventTicketMap", "");
    System.out.println("bootstrap.servers = " + jedis.get("bootstrap.servers"));
    System.out.println("zookeeper.connect = " + jedis.get("zookeeper.connect"));
    System.out.println("postRequestUrl = " + jedis.get("postRequestUrl"));
    jedis.close();
  }
}
