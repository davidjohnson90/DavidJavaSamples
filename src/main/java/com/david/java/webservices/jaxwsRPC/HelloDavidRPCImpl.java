/**
 * 
 */
package com.david.java.webservices.jaxwsRPC;

import javax.jws.WebService;

/**
 * @author David
 *
 *         Service Implementation
 */
@WebService(endpointInterface = "com.david.java.webservices.jaxwsRPC.HelloDavidRPC")
public class HelloDavidRPCImpl implements HelloDavidRPC {

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.david.java.webservices.jaxwsRPC.HelloDavidRPC#getHelloDavidAsString(
	 * java.lang.String)
	 */
	@Override
	public String getHelloDavidAsString(String name) {
		return "Hello David JAX-WS " + name;
	}

}