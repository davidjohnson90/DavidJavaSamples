/**
 * 
 */
package com.david.java.shellScript;

/**
 * @author David
 *
 */
public class EnvironmentVariable {
	public static void main(String[] args) {
		System.out.println(System.getenv("ELASTICSEARCH_HOSTNAME_PORT"));
		System.out.println(System.getenv("MERIDIAN_ES_CLUSTER_NAME"));
		System.out.println(System.getenv("ES_SHIELD_USER"));
		System.out.println(System.getenv("ES_SHIELD_PASSWORD"));
		System.out.println(System.getenv("PATH_TO_KEY_STORE"));
		System.out.println(System.getenv("KEY_STORE_PASSWORD"));
		System.out.println(System.getenv("ES_USE_SHIELD"));
	}
	
}
