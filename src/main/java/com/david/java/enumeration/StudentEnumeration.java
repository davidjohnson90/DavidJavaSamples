package com.david.java.enumeration;

import java.util.logging.Logger;

/**
 * An enumeration of students with their corresponding ages.
 *
 * @author David
 */
enum Student {
    ARUN(25), ANDREW(18), DAVID(50);

    private int age;

    /**
     * Constructs a new Student with the given age.
     *
     * @param age The age of the student.
     */
    Student(int age) {
        this.setAge(age);
    }

    /**
     * Gets the age of the student.
     *
     * @return The age of the student.
     */
    public int getAge() {
        return age;
    }

    /**
     * Sets the age of the student.
     *
     * @param age The age to set.
     */
    public void setAge(int age) {
        this.age = age;
    }
}

/**
 * A class to demonstrate the usage of the Student enumeration.
 */
public class StudentEnumeration {
    /**
     * The main method to demonstrate enumeration usage.
     *
     * @param args Command line arguments (not used).
     */
    public static void main(String[] args) {
        // Using loggers instead of println
        Logger logger = Logger.getLogger(StudentEnumeration.class.getName());

        logger.info("Age of Arun is : " + Student.ARUN.getAge() + " years");
        logger.info("Age of Andrew is : " + Student.ANDREW.getAge() + " years");
        logger.info("Age of David is : " + Student.DAVID.getAge() + " years");
    }
}
