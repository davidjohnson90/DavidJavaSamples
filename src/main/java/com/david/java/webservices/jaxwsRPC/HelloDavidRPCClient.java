/**
 * 
 */
package com.david.java.webservices.jaxwsRPC;

import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

/**
 * @author David
 *
 */
public class HelloDavidRPCClient {
	public static void main(String[] args) throws Exception {
		URL url = new URL("http://localhost:7779/ws/hello?wsdl");
		QName qName = new QName("http://jaxwsRPC.webservices.java.david.com/", "HelloDavidRPCImplService");
		Service service = Service.create(url, qName);
		HelloDavidRPC helloDavidRPC = service.getPort(HelloDavidRPC.class);
		System.out.println(helloDavidRPC.getHelloDavidAsString("Johnson RPC"));
	}
}
