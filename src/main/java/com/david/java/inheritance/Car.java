/**
 * 
 */
package com.david.java.inheritance;

/**
 * @author David
 *
 */
public class Car extends Vehicle {
	String modelType;

	public static void main(String[] args) {
		Car car = new Car();
		car.showDetails();
	}

	/**
	 * 
	 */
	private void showDetails() {
		modelType = "Sports";
		vehicleType = "Car";
		System.out.println("The vehicle is a " + modelType + " " + vehicleType);
	}
}

class Vehicle {
	String vehicleType;
}
