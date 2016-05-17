/**
 * 
 */
package com.david.java.collections;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * @author David
 *
 */
public class ComparatorInterface {
	public static void main(String[] args) {
		TreeSet<StudentCollection> treeSet = new TreeSet<StudentCollection>(
				new StudentComparator());
		treeSet.add(new StudentCollection("Arun", 1));
		treeSet.add(new StudentCollection("Sundarson", 5));
		treeSet.add(new StudentCollection("Andrew", 2));
		treeSet.add(new StudentCollection("Johnson", 4));
		treeSet.add(new StudentCollection("David", 3));
		System.out.println(treeSet);
	}
}

class StudentComparator implements Comparator<StudentCollection> {

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.util.Comparator#compare(java.lang.Object, java.lang.Object)
	 */
	@Override
	public int compare(StudentCollection student1, StudentCollection student2) {
		if (student1.rollNo == student2.rollNo) {
			return 0;
		} else if (student1.rollNo > student2.rollNo) {
			return 1;
		} else {
			return -1;
		}
	}
}

class StudentCollection {
	String name;
	int rollNo;

	/**
	 * 
	 */
	public StudentCollection(String n, int r) {
		name = n;
		rollNo = r;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return name + " " + rollNo;
	}
}