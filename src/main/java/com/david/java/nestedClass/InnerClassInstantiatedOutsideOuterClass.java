/**
 * 
 */
package com.david.java.nestedClass;

/**
 * @author David
 *
 */
public class InnerClassInstantiatedOutsideOuterClass {
	public static void main(String[] args) {
		OuterClass outerClass = new OuterClass();
		OuterClass.InnerClass innerClass = outerClass.new InnerClass();
		innerClass.show();
		outerClass.display();
	}
}

class OuterClass {
	int count;

	public void display() {
		InnerClass innerClass = new InnerClass();
		innerClass.show();
	}

	class InnerClass {
		public void show() {
			System.out.println("Inside inner " + (++count));
		}
	}
}