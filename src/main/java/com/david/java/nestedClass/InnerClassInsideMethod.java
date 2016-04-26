/**
 * 
 */
package com.david.java.nestedClass;

/**
 * @author David
 *
 */
public class InnerClassInsideMethod {
	public static void main(String[] args) {
		OuterMethod method = new OuterMethod();
		method.display();
	}
}

class OuterMethod {
	int count;

	public void display() {
		for (int i = 0; i < 5; i++) {

			class InnerMethod // Inner class defined inside for loop
			{
				public void show() {
					System.out.println("Inside inner " + (count++));
				}
			}

			InnerMethod innerMethod = new InnerMethod();
			innerMethod.show();
		}
	}
}