package com.david.java.constructor;

/**
 * @author David
 *
 */
public class CarExampleConstructor {
	String name;
	String model;

	CarExampleConstructor() // Constructor
	{
		name = "Fiat";
		model = "Palio";
	}

	public static void main(String[] args) {
		CarExampleConstructor carExampleConstructor = new CarExampleConstructor();
		System.out.println("The name and model of the car is : "
				+ carExampleConstructor.name + " "
				+ carExampleConstructor.model);
	}
}
