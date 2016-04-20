/**
 * 
 */
package com.david.java.methodOverriding;

/**
 * @author David
 *
 */
public class MethodOverrideDemo {
	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.eat();
	}
}

class Animal {
	/**
	 * 
	 */
	public void eat() {
		System.out.println("Generic animal eating");
	}
}

class Dog extends Animal {
	/*
	 * (non-Javadoc)
	 * 
	 * @see com.david.java.methodOverriding.Animal#eat()
	 */
	@Override
	public void eat() {
		super.eat();
		System.out.println("Dog eats meat");
	}
}