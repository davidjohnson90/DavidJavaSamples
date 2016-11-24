package com.david.java.exceptionHandling;

public class TryCatchFinally {
	public static void main(String[] args) {
		String value = getValue();
		System.out.println("value : " + value);
	}

	private static String getValue() {
		String data = null;
		try {
			System.out.println("Am in try");
			data = "Hi David";
			System.exit(0);
		} catch (Exception e) {
			data = "Am in catch";
			System.out.println("Am in catch");
		} finally {
			data = "Am in finally block";
			System.out.println("Am in finally block");
		}
		System.out.println("Am after all");
		return data;
	}
}
