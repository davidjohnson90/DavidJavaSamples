package com.david.java.classinitialization;

/**
 * If a subclass does not declare a constructor, the compiler produces a
 * corresponding method that explicitly calls its superclass's default
 * no-argument method. Furthermore, for each subclass constructor that
 * explicitly calls a superclass constructor, the compiler inserts a call to the
 * superclass constructor's equivalent method at the start of the subclass's
 * method.
 * <p>
 * Following the call to a superclass's method, a subclass's method executes
 * byte code instructions for each subclass object field initializer and object
 * block initializer. Those byte code instructions execute the initializers in
 * the same order as they appear in the source code. Furthermore, the byte code
 * instructions duplicate in each subclass constructor that calls a superclass
 * constructor.
 * <p>
 * In this example, we have a class ObjectInitializationClassHierarchies (subclass) and
 * ObjectParent (superclass). ObjectInitializationClassHierarchies contains two constructors:
 * one with no arguments and one with a String argument. The no-argument constructor
 * calls the superclass constructor via super(), and the constructor with a String
 * argument calls its superclass constructor and prints the provided message.
 * <p>
 * The superclass ObjectParent contains an object block initializer that increments
 * the field 'x', and its constructor prints a message.
 * <p>
 * During the object creation process, the byte code instructions for the object field
 * initializers and object block initializers execute in the order they appear in the
 * source code. The subclass constructor calls the superclass constructor, and the
 * superclass's initializers execute first.
 * <p>
 * Output:
 * x = 2
 * Executing superclass constructor
 * a = 3
 * Executing subclass constructor
 * x = 4
 * Executing superclass constructor
 * Executing other subclass constructor
 * <p>
 * Author: David
 */
@SuppressWarnings("unused")
public class ObjectInitializationClassHierarchies extends ObjectParent {

    int a = 2;

    {
        // This is an object block initializer in the subclass.
        System.out.println("a = " + ++a);
    }

    /**
     * The no-argument constructor of ObjectInitializationClassHierarchies.
     */
    ObjectInitializationClassHierarchies() {
        // The no-argument constructor calls the superclass constructor via super().
        System.out.println("Executing subclass constructor");
    }

    /**
     * The constructor of ObjectInitializationClassHierarchies that takes a String argument.
     *
     * @param msg The message to be printed during object construction.
     */
    ObjectInitializationClassHierarchies(String msg) {
        // The constructor with a String argument calls its superclass constructor and prints the provided message.
        super();
        System.out.println(msg);
    }

    public static void main(String[] args) {
        // Create instances of ObjectInitializationClassHierarchies.
        ObjectInitializationClassHierarchies hierarchies1 = new ObjectInitializationClassHierarchies();
        ObjectInitializationClassHierarchies hierarchies2 = new ObjectInitializationClassHierarchies("Executing other subclass constructor");
    }
}

class ObjectParent {
    int x = 1;

    {
        // This is an object block initializer in the superclass.
        System.out.println("x = " + ++x);
    }

    /**
     * The constructor of ObjectParent.
     */
    ObjectParent() {
        // The constructor of the superclass prints a message.
        System.out.println("Executing superclass constructor");
    }
}
