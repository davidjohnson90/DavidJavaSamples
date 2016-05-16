/**
 * 
 */
package com.david.java.enumeration;

/**
 * @author David
 *
 */

enum Student {
	ARUN(25), ANDREW(18), DAVID(50);
	private int age;

	Student(int age) {
		this.setAge(age);
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @param age
	 *            the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
}

public class StudentEnumeration {
	public static void main(String[] args) {
		System.out.println("Age of Arun is : " + Student.ARUN.getAge()
				+ " years");
		System.out.println("Age of Andrew is : " + Student.ANDREW.getAge()
				+ " years");
		System.out.println("Age of David is : " + Student.DAVID.getAge()
				+ " years");
	}
}