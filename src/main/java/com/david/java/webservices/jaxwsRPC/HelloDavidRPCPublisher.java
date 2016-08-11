/**
 * 
 */
package com.david.java.webservices.jaxwsRPC;

import javax.xml.ws.Endpoint;

/**
 * @author David
 *
 *         Endpoint publisher
 */
public class HelloDavidRPCPublisher {
	public static void main(String[] args) {
		Endpoint.publish("http://localhost:7779/ws/hello", new HelloDavidRPCImpl());
	}
}
