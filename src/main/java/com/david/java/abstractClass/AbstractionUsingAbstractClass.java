/**
 * 
 */
package com.david.java.abstractClass;

/**
 * @author David
 *
 */
public class AbstractionUsingAbstractClass {
	public static void main(String[] args) {
		Vehicle vehicle = new Car();
		vehicle.engine();
	}
}

abstract class Vehicle {
	public abstract void engine();
}

class Car extends Vehicle {
	/*
	 * (non-Javadoc)
	 * 
	 * @see com.david.java.abstractClass.Vehicle#engine()
	 */
	@Override
	public void engine() {
		System.out.println("Car Engine");
	}
}