/**
 * 
 */
package com.david.java.interfaceImplemetation;

/**
 * @author David
 *
 */
public class InterfaceDemo {
	public static void main(String[] args) {
		Vehicle vehicle = new Vehicle();
		vehicle.move();
	}
}

interface MoveableInterface {
	int AVG_SPEED = 40;

	void move();
}

class Vehicle implements MoveableInterface {
	/*
	 * (non-Javadoc)
	 * 
	 * @see com.david.java.interfaceImplemetation.Moveable#move()
	 */
	@Override
	public void move() {
		System.out.println("The average speed is : " + AVG_SPEED);
	}
}