/**
 * 
 */
package com.david.java.interfaceImplemetation;

/**
 * @author David
 *
 */
public class InterfaceMultipleInheritance {
	public static void main(String[] args) {
		Tyre tyre = new Tyre();
		System.out.println(tyre.isMoveable());
		System.out.println(tyre.isRollable());
	}
}

interface Moveable {
	boolean isMoveable();
}

interface Rollable {
	boolean isRollable();
}

class Tyre implements Moveable, Rollable {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.david.java.interfaceImplemetation.Rollable#isRollable()
	 */
	@Override
	public boolean isRollable() {
		return true;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.david.java.interfaceImplemetation.Moveable#isMoveable()
	 */
	@Override
	public boolean isMoveable() {
		return true;
	}

}
