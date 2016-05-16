/**
 * 
 */
package com.david.java.collections;

import java.util.LinkedList;

/**
 * @author David
 *
 */
public class LinkedListClass {
	public static void main(String[] args) {
		LinkedList<String> linkedList = new LinkedList<String>();
		linkedList.add("Andrew");
		linkedList.add("David");
		linkedList.add("Johnson");
		linkedList.addFirst("Arun");
		linkedList.addLast("Sundarson");
		System.out.println(linkedList);
	}
}
