package com.david.java.modifiers;

/**
 * @author David
 *
 */
public class StaticVsInstanceVariable {
	static int x = 100;
	int y = 100;

	public void increment() {
		x++;
		y++;
	}

	public static void main(String[] args) {
		StaticVsInstanceVariable si1 = new StaticVsInstanceVariable();
		StaticVsInstanceVariable si2 = new StaticVsInstanceVariable();
		si1.increment();
		si2.increment();
		System.out.println(si2.y);
		System.out.println(StaticVsInstanceVariable.x);
	}
}
