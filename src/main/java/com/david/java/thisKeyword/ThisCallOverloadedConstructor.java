package com.david.java.thisKeyword;

/**
 * @author David
 *
 */
public class ThisCallOverloadedConstructor {
	private String name;

	public ThisCallOverloadedConstructor() {
		this("BMW"); // oveloaded constructor is called.
	}

	public ThisCallOverloadedConstructor(String n) {
		this.name = n; // member is initialized using this.
		System.out.println("The name of car is " + this.name);
	}

	public static void main(String[] args) {
		new ThisCallOverloadedConstructor();
	}
}