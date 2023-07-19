/**
 *
 */
package com.david.java.abstractClass;

/**
 * @author David
 */
public class AbstractClassConcreteMethod extends AbstractClassTest {

    public static void main(String[] args) {
        AbstractClassConcreteMethod method = new AbstractClassConcreteMethod();
        method.callMe();
        method.normal();
    }

    /*
     * (non-Javadoc)
     *
     * @see com.david.java.abstractClass.AbstractClassTest#callMe()
     */
    @Override
    void callMe() {
        System.out.println("This is abstract method...");
    }

}

abstract class AbstractClassTest {
    abstract void callMe();

    /**
     *
     */
    public void normal() {
        System.out.println("This is concrete method...");
    }
}