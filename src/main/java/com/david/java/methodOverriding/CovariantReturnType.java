/**
 * 
 */
package com.david.java.methodOverriding;

/**
 * @author David
 *
 */
public class CovariantReturnType {
	public static void main(String[] args) {
		DogType dogType = new DogType();
		dogType.myType();
	}
}

class AnimalType {
	AnimalType myType() {
		System.out.println(new AnimalType());
		return new AnimalType();
	}
}

class DogType extends AnimalType {
	/*
	 * (non-Javadoc)
	 * 
	 * @see com.david.java.methodOverriding.AnimalType#myType()
	 */
	@Override
	DogType myType() {
		super.myType();
		System.out.println(new DogType());
		return new DogType();
	}
}
