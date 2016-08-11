/**
 * 
 */
package com.david.java.webservices.jaxrsJersey;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 * @author David
 *
 */
@Path("/helloDavid")
public class HelloDavidJersey {

	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String sayPlainTextHello() {
		return "Hello David Jersey Plain";
	}

	@GET
	@Produces(MediaType.TEXT_XML)
	public String sayXMLHello() {
		return "<?xml version=\"1.0\"?>" + "<hello> Hello David Jersey" + "</hello>";
	}

	@GET
	@Produces(MediaType.TEXT_HTML)
	public String sayHtmlHello() {
		return "<html> " + "<title>" + "Hello David Jersey" + "</title>" + "<body><h1>" + "Hello David Jersey HTML"
				+ "</h1></body>" + "</html> ";
	}
}
