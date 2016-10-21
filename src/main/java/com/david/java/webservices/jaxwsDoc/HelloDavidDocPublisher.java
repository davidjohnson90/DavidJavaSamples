/**
 * 
 */
package com.david.java.webservices.jaxwsDoc;

import javax.xml.ws.Endpoint;

/**
 * @author David
 *
 */
public class HelloDavidDocPublisher {
	public static void main(String[] args) {
		Endpoint.publish("http://localhost:7780/ws/hello", new HelloDavidDocImpl());
	}
}
