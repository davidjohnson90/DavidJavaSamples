package com.david.java.modifiers;

/**
 * @author David
 *
 */
public class StaticVariable {

	int eid;
	String name;
	static String company_name = "TechMahindra";

	public static void main(String[] args) {
		StaticVariable variable1 = new StaticVariable();
		variable1.eid = 101;
		variable1.name = "David";
		variable1.show();

		StaticVariable variable2 = new StaticVariable();
		variable2.eid = 102;
		variable2.name = "Johnson";
		variable2.show();
	}

	private void show() {
		System.out.println("ID: " + eid + ", Name: " + name + ", Company: "
				+ company_name);
	}
}
