/**
 * 
 */
package com.david.java.abstractClass;

/**
 * @author David
 *
 */
public class AbstractClassConcreteMethod extends AbstractClassTest {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.david.java.abstractClass.AbstractClassTest#callMe()
	 */
	@Override
	void callMe() {
		System.out.println("This is abstract method...");
	}

	public static void main(String[] args) {
		AbstractClassConcreteMethod method = new AbstractClassConcreteMethod();
		method.callMe();
		method.normal();
	}

}

abstract class AbstractClassTest {
	abstract void callMe();

	/**
	 * 
	 */
	public void normal() {
		System.out.println("This is concrete method...");
	}
}