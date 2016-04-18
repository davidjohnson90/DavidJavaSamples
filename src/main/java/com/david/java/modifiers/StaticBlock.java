package com.david.java.modifiers;

public class StaticBlock {
	int eid;
	String name;
	static String company;

	static {
		company = "Tech Mahindra";
	}

	public static void main(String[] args) {
		StaticBlock block = new StaticBlock();
		block.eid = 101132;
		block.name = "Arun David Johnson";
		block.show();
	}

	private void show() {
		System.out.println(eid + " - " + name + " - " + company);
	}
}
