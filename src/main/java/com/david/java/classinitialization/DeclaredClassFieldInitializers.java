package com.david.java.classinitialization;

/**
 * Some programs require class fields to refer to previously declared class
 * fields. Java supports that activity by letting you specify the name of a
 * previously declared class field in the expression portion of a subsequently
 * declared class field's class field initializer.
 * <p>
 * In this example, we have two static fields: 'first' and 'second'. The value of
 * 'second' is initialized using 'first'. Since 'first' is declared before 'second',
 * it will be assigned the value 3 first, and then 'second' will be initialized to
 * 1 + 'first', which results in 'second' being 4.
 * <p>
 * The main method prints the values of 'first' and 'second'.
 *
 * @author David
 */
public class DeclaredClassFieldInitializers {
    static int first = 3;
    static int second = 1 + first;

    /**
     * The main method of the DeclaredClassFieldInitializers class.
     *
     * @param args The command-line arguments.
     */
    public static void main(String[] args) {
        System.out.println("first = " + first);
        System.out.println("second = " + second);
    }
}
