/**
 * 
 */
package com.david.java.webservices.jaxwsRPC;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

/**
 * @author David
 * 
 *         Service Endpoint Interface
 *
 */
@WebService
@SOAPBinding(style = Style.RPC)
public interface HelloDavidRPC {
	@WebMethod
	String getHelloDavidAsString(String name);
}
