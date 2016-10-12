/**
 * 
 */
package com.david.java.string;

/**
 * @author David
 *
 */
public class StringRemoveBeforeCharacter {
	public static void main(String[] args) {
		String value = "https://dev22351.service-now.com/api/now/table/incident/d01b9382db1922007707711ebf961939";
		value = value.replaceAll(".*/incident/", "");
		System.out.println(value);
	}
}
