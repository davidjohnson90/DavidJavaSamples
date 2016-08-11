/**
 * 
 */
package com.david.java.webservices.jaxwsDoc;

import javax.jws.WebService;

/**
 * @author David
 *
 */
@WebService(endpointInterface = "com.david.java.webservices.jaxwsDoc.HelloDavidDoc")
public class HelloDavidDocImpl implements HelloDavidDoc {

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.david.java.webservices.jaxwsDoc.HelloDavidDoc#getHelloDavidAsString(
	 * java.lang.String)
	 */
	@Override
	public String getHelloDavidAsString(String name) {
		return "Hello David JAX-WS " + name;
	}

}
