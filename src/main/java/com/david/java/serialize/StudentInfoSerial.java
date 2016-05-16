/**
 * 
 */
package com.david.java.serialize;

import java.io.Serializable;

/**
 * @author David
 *
 */
public class StudentInfoSerial implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	String name;
	int sid;
	String contact;

	/**
	 * 
	 */
	public StudentInfoSerial(String n, int s, String c) {
		this.name = n;
		this.sid = s;
		this.contact = c;
	}
}
