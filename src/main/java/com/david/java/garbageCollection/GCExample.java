package com.david.java.garbageCollection;

/**
 * @author David
 *
 */
public class GCExample {
	private static GCExample example;

	/**
	 * @return the example
	 */
	public static GCExample getExample() {
		return example;
	}

	/**
	 * @param example
	 *            the example to set
	 */
	public static void setExample(GCExample example) {
		GCExample.example = example;
	}

	public static void main(String[] args) {
		setExample(new GCExample());
		setExample(null);
		System.gc();
	}

	@Override
	protected void finalize() throws Throwable {
		System.out.println("Garbage Collected");
	}

}
