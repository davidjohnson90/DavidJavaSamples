package com.david.java.redis;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.Base64;
import java.util.List;
import java.util.Set;

import org.apache.log4j.Logger;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

public class RedisProducerUtil {
	final static JedisPoolConfig poolConfig;
	final static JedisPool jedisPool;
	final static int DEFAULT_REDIS_PORT = 6379;

	/*
	 * We store key value pairs in redis. To store multiple hashmaps, we use
	 * name of the hashmap as the prefix to the key to make globally unique keys
	 * String prefixes for keys to be stored in redis
	 */
	public static String redisCacheStr = "redisCache";
	public static String orgSiteHostnameToSerialNumberMapStr = "orgSiteHostnameToSerialNumberMap";
	public static String orgSiteDeviceIdToIpSetMapStr = "orgSiteDeviceIdToIpSetMap";
	public static String orgSiteIpToHostnameMapStr = "orgSiteIpToHostnameMap";
	public static String orgSiteDeviceIdConnectorIdMapStr = "orgSiteDeviceIdConnectorIdMap";
	public static final String orgSiteEventIdMapStr = "orgSiteEventIdMap";
	public static final String orgSiteAlertIdMapStr = "orgSiteAlertIdMap";

	// KSL: +
	public static final String orgSiteDeviceIfIndexToIndexMapStr = "orgSiteDeviceIfIndexToIndexMap";
	public static final String orgSiteDeviceIfIndexToOperStateMapStr = "orgSiteDeviceIfIndexToOperStateMap";
	public static final String linkIdToLinkIfxMapStr = "linkIdToLinkIfxMap";
	public static final String linkIdToLinkMapStr = "linkIdToLinkMap";
	public static final String linkIfxOperStateCacheMapStr = "linkIfxOperStateCacheMap";
	// KSL: -

	public static final String EVENT_CORRELATION_MAP = "eventCorrelationMap";
	public static final String NEW_DEVICE_MODEL = "newDeviceModel";
	public static final String NEW_DEVICE_CHILD_MODEL = "newDeviceChildModel";
	public static final String NEW_DEVICE_PARENT_MODEL = "newDeviceParentModel";
	public static final String NEW_VNET_VM_MODEL = "newVNetVMModel";
	public static final String GATEWAY_DEVICE = "gatewayDevice";
	public static final String SUBSCRIPTION_DATA_COLLECTOR = "subscriptionDataCollector";
	public static final String ORG_SITE = "orgSite";
	public static final String NEW_DEVICE_INTERFACE_DATA_MODEL = "newDeviceInterfaceDataModel";
	public static final String NEW_DEVICE_SERVICES_DATA_MODEL = "newDeviceServicesDataModel";
	public static final String NEW_DEVICE_IFX_SPLITTER_DATA_MODEL = "newDeviceIfxSplitterDataModel";
	public static final String BLOCK_LIST = "blockList";
	public static final String THRESHOLD = "threshold";
	public static final String METRIC_NAME_MAPPING = "metric_name_mapping";
	public static final String EMAIL_CONFIG_MAPPING = "email_config_mapping";
	public static final String ORG_SITE_DC_MAPPING = "org_site_dc_mapping";
	public static final String TRANSACTION_THRESHOLD = "transactionThreshold";
	public static final String orgJvmTransactionMapStr = "orgJvmTransactionMap";
	public static final String orgJvmThresholdMapStr = "orgJvmThresholdMap";
	public static final String orgJvmAppStr = "orgJvmAppMap";

	public static final String TICKET_USERNAME = "ticketingUsername";
	public static final String TICKET_PASSWORD = "ticketingPassword";
	public static final String TICKET_URL = "ticketingUrl";
	public static final String TICKET_SYSTEM = "ticketingSystem";
	public static final String TICKET_SEVERITY = "ticketingSeverity";
	public static final String TICKET_READ = "ticketingRead";
	public static final String TICKET_WRITE = "ticketingWrite";

	private static String[] redisMapNames = new String[] { orgSiteHostnameToSerialNumberMapStr,
			orgSiteDeviceIdToIpSetMapStr, orgSiteIpToHostnameMapStr, redisCacheStr, EVENT_CORRELATION_MAP,
			orgSiteDeviceIdConnectorIdMapStr, orgSiteDeviceIfIndexToIndexMapStr, orgSiteDeviceIfIndexToOperStateMapStr,
			linkIdToLinkIfxMapStr, linkIdToLinkMapStr, linkIfxOperStateCacheMapStr, NEW_DEVICE_MODEL,
			NEW_DEVICE_CHILD_MODEL, NEW_DEVICE_PARENT_MODEL, NEW_VNET_VM_MODEL, GATEWAY_DEVICE,
			SUBSCRIPTION_DATA_COLLECTOR, ORG_SITE, NEW_DEVICE_INTERFACE_DATA_MODEL, NEW_DEVICE_IFX_SPLITTER_DATA_MODEL,
			NEW_DEVICE_SERVICES_DATA_MODEL, orgSiteEventIdMapStr, orgSiteAlertIdMapStr, BLOCK_LIST, THRESHOLD,
			METRIC_NAME_MAPPING, EMAIL_CONFIG_MAPPING, ORG_SITE_DC_MAPPING, orgJvmTransactionMapStr,
			orgJvmThresholdMapStr, orgJvmAppStr, TRANSACTION_THRESHOLD };

	private static Logger logger = Logger.getLogger(RedisProducerUtil.class);
	// Initialize the resources, based on the appropriate environment
	// variables...
	static {
		// Get the <<REDIS_HOSTNAME>> Environment variable...
		String redisHostname = System.getenv("REDIS_HOSTNAME");
		String redisPort = "";
		// If the <<REDIS_HOSTNAME>> Environment variable, is not set... Log
		// appropriate message.
		if (null == redisHostname) {
			logger.warn("REDIS_HOSTNAME is not set... so please set this environment variable or "
					+ "localhost will be taken as the value for this...");
			// Set the value for "redisHostname" as <<localhost>> (By assuming
			// have
			// done this..
			// rather then leaving this as null.
			redisHostname = "localhost";
			redisPort = System.getenv("REDIS_PORT");
			poolConfig = new JedisPoolConfig();
			jedisPool = new JedisPool(poolConfig, redisHostname, stringToInt(redisPort, DEFAULT_REDIS_PORT), 0);
			;
		} else {
			logger.info("REDIS_HOSTNAME is set, get the value and initialize the resources accordingly...");
			// If the <<REDIS_HOSTNAME>> Environment variable is appropriately
			// set,
			// proceed further to initialization...
			redisPort = System.getenv("REDIS_PORT");
			poolConfig = new JedisPoolConfig();
			jedisPool = new JedisPool(poolConfig, redisHostname, stringToInt(redisPort, DEFAULT_REDIS_PORT), 0);
		}
	}

	/*
	 * Utility method which should be used by classes using redis to get value
	 * for a key already stored in redis. Redis stores everything as key-value
	 * pairs, so user class should also provide the map name
	 * 
	 * @input - String mapName, String key
	 * 
	 * @output - String value, where the following is stored in redis -
	 * "mapName,key" => "value"
	 */
	public static String get(String mapName, String key) {
		if (!Arrays.asList(redisMapNames).contains(mapName)) {
			logger.error("Error: Map - " + mapName + " not defined in redis.");
			return "";
		}

		Jedis jedis = null;
		String value = null;
		try {
			jedis = jedisPool.getResource();
			value = jedis.get(mapName + "," + key);
		} finally {
			if (jedis != null) {
				jedis.close();
			}
		}

		return value;
	}

	/*
	 * Utility method which should be used by classes using redis to get value
	 * for a key already stored in redis. Redis stores everything as key-value
	 * pairs, so user class should also provide the map name
	 * 
	 * @input - String String key
	 * 
	 * @output - String value, where the following is stored in redis -
	 * "mapName,key" => "value"
	 */
	public static String get(String key) {
		Jedis jedis = null;
		String value = null;
		try {
			jedis = jedisPool.getResource();
			value = jedis.get(key);
		} finally {
			if (jedis != null) {
				jedis.close();
			}
		}

		return value;
	}

	/*
	 * Utility method which should be used by classes using redis to get all
	 * keys for a regx key stored in redis.
	 * 
	 * @input - String mapName, String regxKey
	 * 
	 * @output - Set<String> keys, set of all the keys matched with the filter
	 * criteria
	 * 
	 */
	public static Set<String> getKeys(String mapName, String regxKey) {
		if (!Arrays.asList(redisMapNames).contains(mapName)) {
			logger.error("Error: Map - " + mapName + " not defined in redis.");
			return null;
		}

		Jedis jedis = null;
		Set<String> keys = null;
		try {
			jedis = jedisPool.getResource();
			keys = jedis.keys(mapName + "," + regxKey);
		} catch (Exception e) {
			logger.error(e.getMessage(), e);
		} finally {
			if (jedis != null) {
				jedis.close();
			}
		}

		return keys;
	}

	public static Object getObject(String mapName, String key) {
		String objectAsString = get(mapName, key);
		if (objectAsString != null) {

			ByteArrayInputStream byteArrayInputStream = null;
			ObjectInputStream objectInputStream = null;
			try {
				byte[] byteArray = Base64.getDecoder().decode(objectAsString);
				byteArrayInputStream = new ByteArrayInputStream(byteArray);
				objectInputStream = new ObjectInputStream(byteArrayInputStream);
				Object object = objectInputStream.readObject();
				return object;
			} catch (Exception e) {
				if (logger.isDebugEnabled())
					logger.debug(e.getMessage(), e);
			} finally {
				try {
					if (objectInputStream != null) {
						objectInputStream.close();
					}
				} catch (Exception ex) {
				}
				try {
					byteArrayInputStream.close();
				} catch (Exception ex) {
				}
			}
		}
		return null;

	}

	/*
	 * Utility method which should be used by classes using redis to store
	 * key-value pairs in a particular hashmap. Redis stores everything as
	 * key-value pairs, so user class should also provide the map name
	 * 
	 * @input - String mapName, String key, String value
	 * 
	 * This method will construct a redisKey = "mapName,key" and store "value"
	 * for this redisKey in redis
	 */
	public static void set(String mapName, String key, String value) {
		if (!Arrays.asList(redisMapNames).contains(mapName)) {
			logger.error("Error: Map - " + mapName + " not defined in redis.");
			return;
		}

		Jedis jedis = null;
		try {
			jedis = jedisPool.getResource();
			if (null != key && null != value)
				jedis.set(mapName + "," + key, value);
		} finally {
			if (jedis != null) {
				jedis.close();
			}
		}

	}

	/*
	 * Utility method which should be used by classes using redis to store
	 * key-value pairs in a particular hashmap. Redis stores everything as
	 * key-value pairs, so user class should also provide the map name
	 * 
	 * @input - String key, String value
	 * 
	 * This method will construct a redisKey = "mapName,key" and store "value"
	 * for this redisKey in redis
	 */
	public static void set(String key, String value) {

		Jedis jedis = null;
		try {
			jedis = jedisPool.getResource();
			jedis.set(key, value);
		} finally {
			if (jedis != null) {
				jedis.close();
			}
		}

	}

	public static void set(String mapName, String key, Object value) {
		if (value == null) {
			logger.error("Error: IN JEDIS, Object recieved null ");
			return;
		}
		if (!Arrays.asList(redisMapNames).contains(mapName)) {
			logger.error("Error: Map - " + mapName + " not defined in redis.");
			return;
		}

		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		ObjectOutputStream out = null;
		try {
			out = new ObjectOutputStream(bos);
			out.writeObject(value);
			byte[] byteArray = bos.toByteArray();
			String valueAsString = Base64.getEncoder().encodeToString(byteArray);

			set(mapName, key, valueAsString);

		} catch (Exception e) {
			logger.error(" Error while converting object to byteArray ", e);
		} finally {
			try {
				if (out != null) {
					out.close();
				}
			} catch (Exception ex) {
			}
			try {
				bos.close();
			} catch (Exception ex) {
			}
		}
	}

	/**
	 * Publish messages
	 * 
	 * @param channel
	 * @param message
	 */
	public static void publishMessage(String channel, String message) {
		Jedis jedis = null;
		try {
			jedis = jedisPool.getResource();
			jedis.publish(channel, message);
		} finally {
			if (jedis != null) {
				jedis.close();
			}
		}

	}

	/**
	 * Just a utility method.
	 * 
	 * @param value
	 * @param defaultRedisPort
	 * @return
	 */
	public static int stringToInt(String value, int defaultRedisPort) {
		try {
			if (null != value) {
				return Integer.parseInt(value);
			} else {
				return defaultRedisPort;
			}
		} catch (NumberFormatException e) {
			logger.error("REDIS_PORT envioronment variable is set with a improper value... "
					+ "It should be an INT... So set the default value..." + e);
			return defaultRedisPort;
		}
	}

	public static long clearCache(String mapName) {
		try (Jedis jedis = jedisPool.getResource()) {
			Set<String> keySet = jedis.keys(mapName + ",*");
			return (clearCache(mapName, (String[]) keySet.toArray(new String[keySet.size()])));
		}
	}

	public static long clearCache(String mapName, String... keys) {
		logger.info("clearCache called: " + mapName + " KEY: " + keys);

		if (keys.length > 0) {
			if (!hasMapName(mapName)) {
				logger.error("mapName: " + mapName + " not found");
			}
			try (Jedis jedis = jedisPool.getResource()) {
				logger.info("clearCache called: " + mapName + " Key Length: " + keys.length);
				return jedis.del(keys);
			} catch (Exception e) {
				logger.error(e.getMessage(), e);
			}
		}

		return 0;
	}

	private static boolean hasMapName(String mapName) {
		if (!Arrays.asList(redisMapNames).contains(mapName)) {
			logger.error("Error: Map - " + mapName + " not defined in redis.");
			return false;
		} else {
			return true;
		}
	}

	public static void lset(String mapName, String key, long index, String value) {
		if (logger.isDebugEnabled())
			logger.debug("IN JEDIS, SET CALLED: " + mapName + " KEY: " + key + "INDEX: " + index);
		if (!hasMapName(mapName)) {
			return;
		}
		try (Jedis jedis = jedisPool.getResource()) {
			jedis.lset(mapName + "," + key, index, value);
		}

	}

	public static void lpush(String mapName, String key, String value) {
		if (logger.isDebugEnabled())
			logger.debug("IN JEDIS, PUSH CALLED: " + mapName + " KEY: " + key);
		if (!hasMapName(mapName)) {
			return;
		}
		try (Jedis jedis = jedisPool.getResource()) {
			jedis.lpush(mapName + "," + key, value);
		}

	}

	public static void sadd(String mapName, String key, String... value) {
		if (logger.isDebugEnabled())
			logger.debug("IN JEDIS, SADD CALLED: " + mapName + " KEY: " + key);
		if (!hasMapName(mapName)) {
			return;
		}
		try (Jedis jedis = jedisPool.getResource()) {
			jedis.sadd(mapName + "," + key, value);
		}

	}

	public static Set<String> smembers(String mapName, String key) {
		if (logger.isDebugEnabled())
			logger.debug("IN JEDIS, SADD CALLED: " + mapName + " KEY: " + key);
		if (!hasMapName(mapName)) {
			return null;
		}
		try (Jedis jedis = jedisPool.getResource()) {
			return jedis.smembers(mapName + "," + key);
		}

	}

	public static Long srem(String mapName, String key, String member) {
		if (logger.isDebugEnabled())
			logger.debug("IN JEDIS, SREM CALLED: " + mapName + " KEY: " + key);
		if (!hasMapName(mapName)) {
			return null;
		}
		try (Jedis jedis = jedisPool.getResource()) {
			return jedis.srem(mapName + "," + key, member);
		}
	}

	public static String type(String mapName, String key) {
		if (logger.isDebugEnabled())
			logger.debug("IN JEDIS, TYPE CALLED: " + mapName + " KEY: " + key);
		if (!hasMapName(mapName)) {
			return "none";
		}
		try (Jedis jedis = jedisPool.getResource()) {
			return jedis.type(mapName + "," + key);
		}
	}

	public static void lrem(String mapName, String key, long count, String value) {
		if (logger.isDebugEnabled())
			logger.debug("IN JEDIS, LREM  CALLED: " + mapName + " KEY: " + key + "COUNT: " + count);
		if (!hasMapName(mapName)) {
			return;
		}
		try (Jedis jedis = jedisPool.getResource()) {
			jedis.lrem(mapName + "," + key, count, value);
		}

	}

	public static void del(String mapName, String key) {
		if (logger.isDebugEnabled())
			logger.debug("IN JEDIS, Delete CALLED: " + mapName + " KEY: " + key);
		if (!hasMapName(mapName)) {
			return;
		}
		try (Jedis jedis = jedisPool.getResource()) {
			jedis.del(mapName + "," + key);
		}
	}

	public static void del(String key) {
		if (logger.isDebugEnabled())
			logger.debug("IN JEDIS, Delete KEY: " + key);
		try (Jedis jedis = jedisPool.getResource()) {
			jedis.del(key);
		}
	}

	public static List<String> lrange(String mapName, String key, long start, long end) {
		if (logger.isDebugEnabled())
			logger.debug("IN JEDIS, LRANGE CALLED: " + mapName + " KEY: " + key + " START: " + start + " END: " + end);
		if (!hasMapName(mapName)) {
			return null;
		}
		List<String> resultList = null;
		try (Jedis jedis = jedisPool.getResource()) {
			resultList = jedis.lrange(mapName + "," + key, start, end);
		}
		if (logger.isDebugEnabled())
			logger.debug("returning list: " + resultList);
		return resultList;
	}
}
