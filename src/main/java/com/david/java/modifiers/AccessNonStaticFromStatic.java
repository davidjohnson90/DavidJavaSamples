package com.david.java.modifiers;

public class AccessNonStaticFromStatic {
	int x;

	public static void main(String[] args) {
		AccessNonStaticFromStatic fromStatic = new AccessNonStaticFromStatic();
		fromStatic.x = 10;
	}
}
