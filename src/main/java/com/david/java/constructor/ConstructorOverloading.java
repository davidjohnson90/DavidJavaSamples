package com.david.java.constructor;

/**
 * @author David
 *
 */
public class ConstructorOverloading {
	private String name;
	private String team;
	private int age;

	public ConstructorOverloading() {
		name = "";
		team = "";
		age = 0;
	}

	public ConstructorOverloading(String name, String team, int age) {
		this.name = name;
		this.team = team;
		this.age = age;
	}

	public ConstructorOverloading(ConstructorOverloading cricketer2) {
		name = cricketer2.name;
		team = cricketer2.team;
		age = cricketer2.age;
	}

	public static void main(String[] args) {
		ConstructorOverloading cricketer1 = new ConstructorOverloading();
		ConstructorOverloading cricketer2 = new ConstructorOverloading(
				"Sachin", "India", 32);
		ConstructorOverloading cricketer3 = new ConstructorOverloading(
				cricketer2);

		cricketer1.name = "Virat";
		cricketer1.team = "India";
		cricketer1.age = 30;

		System.out.println("Cricketer 1 is " + cricketer1);

		System.out.println("Cricketer 2 is " + cricketer2);
		System.out.println("Cricketer 3 is " + cricketer3);

	}

	@Override
	public String toString() {
		return name + " of team " + team + " with the age of " + age;
	}
}
