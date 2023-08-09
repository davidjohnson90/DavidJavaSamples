/**
 * This class demonstrates the usage of the Comparator interface to sort elements in a TreeSet.
 */
package com.david.java.collections;

import java.util.Comparator;
import java.util.TreeSet;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * This class demonstrates the usage of the Comparator interface to sort elements in a TreeSet.
 * It creates a TreeSet of StudentCollection objects and uses a custom StudentComparator
 * to sort the elements based on their roll numbers.
 * The sorted set is then printed to the console.
 *
 * @author David
 */
public class ComparatorInterface {

    private static final Logger logger = Logger.getLogger(ComparatorInterface.class.getName());

    public static void main(String[] args) {
        // Create a TreeSet with a custom comparator to sort based on roll number
        TreeSet<StudentCollection> treeSet = new TreeSet<>(new StudentComparator());
        treeSet.add(new StudentCollection("Arun", 1));
        treeSet.add(new StudentCollection("Sundarson", 5));
        treeSet.add(new StudentCollection("Andrew", 2));
        treeSet.add(new StudentCollection("Johnson", 4));
        treeSet.add(new StudentCollection("David", 3));

        // Print the sorted TreeSet
        logger.log(Level.INFO, "Sorted Students: " + treeSet);
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
     * Initializes a StudentCollection object with the given name and roll number.
     *
     * @param name   The name of the student.
     * @param rollNo The roll number of the student.
     */
    public StudentCollection(String name, int rollNo) {
        this.name = name;
        this.rollNo = rollNo;
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
