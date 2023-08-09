package com.david.java.classinitialization;

/**
 * There exists a situation in which you can declare a class hierarchy -- in
 * which each class has its own initializers -- and, when you construct an
 * object, no initializer executes. That situation arises when a subclass
 * constructor TestJava calls another constructor B in the same subclass (via this).
 * From a JVM perspective, that implies that a corresponding method TestJava calls
 * method B (in the same subclass). Java assumes that method B will call either
 * a method that corresponds to a superclass constructor or another subclass
 * constructor's method. As a result, method TestJava begins with byte code
 * instructions that call method B. However, following that call, method TestJava does
 * not execute byte code instructions that correspond to object field
 * initializers and object block initializers. Instead, it executes byte code
 * instructions that correspond to developer-specified Java source code. Method
 * TestJava doesn't need to execute those instructions that correspond to initializers
 * because Java expects another constructor (which calls a superclass
 * constructor) to perform that task. Without proper care, this scenario can
 * lead to something quite bizarre.
 * <p>
 * In this example, we have two classes: ImproperObjectInizializationClassHierarchies
 * (subclass) and ImproperObjectClassHierarchiesParent (superclass).
 * ImproperObjectInizializationClassHierarchies has two constructors. One constructor
 * calls another constructor using this() to construct the object. The superclass has
 * a field 'a' and an instance initializer block that prints its value.
 * <p>
 * When we create an object of ImproperObjectInizializationClassHierarchies, the constructor
 * calling chain leads to the superclass constructor execution. As a result, the object
 * field initializers and instance initializer block in the subclass do not execute.
 * <p>
 * Output:
 * a = 3
 * b = 1
 * a = 3
 * <p>
 * Author: David
 */
public class ImproperObjectInizializationClassHierarchies extends ImproperObjectClassHierarchiesParent {
    int b = 1;

    {
        System.out.println("b = " + b);
    }

    ImproperObjectInizializationClassHierarchies() {
        // this(1); // Enabling this throws error
    }

    ImproperObjectInizializationClassHierarchies(int x) {
        this();
    }

    public static void main(String[] args) {
        // Create an object of ImproperObjectInizializationClassHierarchies.
        // During object construction, constructor calling chain leads to superclass constructor execution.
        // As a result, the object field initializers and instance initializer block in the subclass do not execute.
        System.out.println(new ImproperObjectInizializationClassHierarchies().a);
    }
}

class ImproperObjectClassHierarchiesParent {
    int a = 3;

    {
        System.out.println("a = " + a);
    }
}
