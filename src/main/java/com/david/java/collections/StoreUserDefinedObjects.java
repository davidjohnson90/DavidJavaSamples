/**
 * This class demonstrates how to store user-defined objects in an ArrayList in Java.
 */
package com.david.java.collections;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * This class demonstrates how to store user-defined objects in an ArrayList in Java.
 * It creates two Contacts objects, adds them to an ArrayList, and then prints the ArrayList.
 * The printed output will display each Contact's first name, last name, and phone number.
 * <p>
 * The Contacts class represents a simple contact with first name, last name, and phone number.
 * The ArrayList is used to store these contacts.
 * <p>
 * Note: For a more advanced application, consider using a proper contact management system
 * with databases for storage and retrieval of contacts.
 *
 * @author David
 */
public class StoreUserDefinedObjects {

    private static final Logger logger = Logger.getLogger(StoreUserDefinedObjects.class.getName());

    public static void main(String[] args) {
        // Create two Contacts objects
        Contacts contacts1 = new Contacts("Arun", "David", "8951199887");
        Contacts contacts2 = new Contacts("Andrew", "David", "9364206161");

        // Create an ArrayList to store the Contacts objects
        ArrayList<Contacts> arrayList = new ArrayList<>();
        arrayList.add(contacts1);
        arrayList.add(contacts2);

        // Print the ArrayList
        logger.log(Level.INFO, "Contacts: " + arrayList);
    }
}

class Contacts {
    String firstName;
    String lastName;
    String phoneNo;

    /**
     * Initializes a Contacts object with the given first name, last name, and phone number.
     *
     * @param fn The first name of the contact.
     * @param ln The last name of the contact.
     * @param pn The phone number of the contact.
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
