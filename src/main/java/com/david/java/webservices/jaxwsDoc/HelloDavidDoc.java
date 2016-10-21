/**
 * 
 */
package com.david.java.webservices.jaxwsDoc;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

/**
 * @author David
 *
 */
@WebService
@SOAPBinding(style = Style.DOCUMENT)
public interface HelloDavidDoc {
	@WebMethod
	String getHelloDavidAsString(String name);
}
