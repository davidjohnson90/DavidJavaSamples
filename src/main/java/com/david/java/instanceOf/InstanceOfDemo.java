/**
 * 
 */
package com.david.java.instanceOf;

/**
 * @author David
 *
 */
public class InstanceOfDemo {
	public static void main(String[] args) {
		InstanceOfDemo demo = new InstanceOfDemo();
		System.out.println(demo instanceof InstanceOfDemo);

		ParentDemo parentDemo = new ParentDemo();
		Child1 child1 = new Child1();
		Child2 child2 = new Child2();

		System.out.println(child1 instanceof ParentDemo);
		System.out.println(child2 instanceof ParentDemo);
		System.out.println(parentDemo instanceof Child1);
		System.out.println(parentDemo instanceof Child2);

		parentDemo = child1;
		System.out.println(parentDemo instanceof Child1);
		System.out.println(parentDemo instanceof Child2);

		parentDemo = child2;
		System.out.println(parentDemo instanceof Child1);
		System.out.println(parentDemo instanceof Child2);
	}
}

class ParentDemo {
}

class Child1 extends ParentDemo {
}

class Child2 extends ParentDemo {
}