/**
 * 
 */
package com.david.java.collections;

import java.util.ArrayList;

/**
 * @author David
 *
 */
public class StoreUserDefinedObjects {
	public static void main(String[] args) {
		Contacts contacts1 = new Contacts("Arun", "David", "8951199887");
		Contacts contacts2 = new Contacts("Andrew", "David", "9364206161");

		ArrayList<Contacts> arrayList = new ArrayList<Contacts>();
		arrayList.add(contacts1);
		arrayList.add(contacts2);
		System.out.println(arrayList);
	}
}

class Contacts {
	String firstName;
	String lastName;
	String phoneNo;

	/**
	 * 
	 */
	public Contacts(String fn, String ln, String pn) {
		firstName = fn;
		lastName = ln;
		phoneNo = pn;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return firstName + " " + lastName + " - " + phoneNo;
	}
}