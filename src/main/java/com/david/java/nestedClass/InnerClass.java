/**
 * 
 */
package com.david.java.nestedClass;

/**
 * @author David
 *
 */

class Outer {
	public void display() {
		Inner inner = new Inner();
		inner.show();
	}

	class Inner {
		public void show() {
			System.out.println("Inside Inner");
		}
	}
}

public class InnerClass {
	public static void main(String[] args) {
		Outer outer = new Outer();
		outer.display();
	}
}