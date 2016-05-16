/**
 * 
 */
package com.david.java.generics;

/**
 * @author David
 *
 */
public class GenericClass {
	public static void main(String[] args) {
		Gen<Integer> iob = new Gen<Integer>(100);
		int i = iob.getObj();
		System.out.println(i);

		Gen<String> sob = new Gen<String>("Hi David");
		String s = sob.getObj();
		System.out.println(s);
	}
}

class Gen<T> {
	T obj;

	/**
	 * 
	 */
	public Gen(T o) {
		obj = o;
	}

	public T getObj() {
		return obj;
	}
}