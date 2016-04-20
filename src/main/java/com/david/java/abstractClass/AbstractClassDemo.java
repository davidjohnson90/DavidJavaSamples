/**
 * 
 */
package com.david.java.abstractClass;

/**
 * @author David
 *
 */
public class AbstractClassDemo extends AbstractClass {

	/*
	 * (non-Javadoc)
	 * 
	 * @see com.david.java.abstractClass.AbstractClass#callMe()
	 */
	@Override
	void callMe() {
		System.out.println("Am in CallMe method...");
	}

	public static void main(String[] args) {
		AbstractClassDemo demo = new AbstractClassDemo();
		demo.callMe();
	}

}

abstract class AbstractClass {
	abstract void callMe();
}
