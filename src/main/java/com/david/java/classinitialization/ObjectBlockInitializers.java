package com.david.java.classinitialization;

/**
 * As with class fields, some programs require object fields to refer to
 * previously declared object fields. Java supports that activity by allowing
 * you to specify the name of a previously declared object field in the
 * expression portion of a subsequently declared object field's initializer.
 * However, just as you cannot use forward references with class field
 * initializers, you cannot use forward references with object field
 * initializers.
 * <p>
 * In this example, we have a class ObjectBlockInitializers that contains two object
 * fields: 'first' and 'second'. The 'second' field is initialized using the 'first'
 * field. Since 'first' is declared before 'second', it will be assigned the value 3
 * first, and then 'second' will be initialized to 1 + 'first', which results in 'second'
 * being 4.
 * <p>
 * The main method creates an instance of ObjectBlockInitializers and prints the values of
 * 'first' and 'second'.
 * <p>
 * Author: David
 */
public class ObjectBlockInitializers {
    int first = 3;
    int second = 1 + first;
    // int forwardReference = first; // Uncommenting this line will cause an error.

    /**
     * The main method of the ObjectBlockInitializers class.
     *
     * @param args The command-line arguments.
     */
    public static void main(String[] args) {
        // Create an instance of ObjectBlockInitializers.
        ObjectBlockInitializers objectBlockInitializers = new ObjectBlockInitializers();
        // Print the values of 'first' and 'second'.
        System.out.println("objectBlockInitializers.first = " + objectBlockInitializers.first);
        System.out.println("objectBlockInitializers.second = " + objectBlockInitializers.second);
    }
}
