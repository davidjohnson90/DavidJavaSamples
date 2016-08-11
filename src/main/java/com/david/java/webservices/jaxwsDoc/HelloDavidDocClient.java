/**
 * 
 */
package com.david.java.webservices.jaxwsDoc;

import java.net.URL;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

/**
 * @author David
 *
 */
public class HelloDavidDocClient {
	public static void main(String[] args) throws Exception {
		URL url = new URL("http://localhost:7780/ws/hello?wsdl");
		QName qName = new QName("http://jaxwsDoc.webservices.java.david.com/", "HelloDavidDocImplService");
		Service service = Service.create(url, qName);
		HelloDavidDoc helloDavidDoc = service.getPort(HelloDavidDoc.class);
		System.out.println(helloDavidDoc.getHelloDavidAsString("Johnson Doc"));
	}
}
