package com.david.java.callback;

import java.util.ArrayList;
import java.util.List;

/**
 * The MyListener interface defines a contract for classes that want to be notified when something happens.
 * It contains a single method somethingHappened() that will be implemented by the listener classes.
 * <p>
 * author David
 */
interface MyListener {
    /**
     * Method to be called when something happens.
     */
    void somethingHappened();
}

/**
 * The DavidListenerClass contains the main method to demonstrate the Listener pattern.
 * It creates a MyForm object and calls its somethingHappened method.
 * <p>
 * author David
 */
public class DavidListenerClass {
    public static void main(String[] args) {
        MyForm myForm = new MyForm();
        myForm.somethingHappened();
    }
}

/**
 * The MyForm class is an example class that implements the MyListener interface and acts as a listener.
 * It gets a handle to the MyClass object and registers itself as a listener.
 * <p>
 * author David
 */
class MyForm implements MyListener {
    /**
     * MyForm constructor.
     * It creates a MyClass object and registers itself as a listener.
     */
    public MyForm() {
        System.out.println("Am in MyForm constructor");
        MyClass myClass = new MyClass();
        myClass.addListener(this);
    }

    /**
     * Implementation of the somethingHappened() method from the MyListener interface.
     * It prints a message "Called me!" as a notification response.
     */
    public void somethingHappened() {
        System.out.println("Called me!");
    }
}

/**
 * The MyClass class is an example class that maintains a list of MyListener objects and notifies them when something happens.
 * It provides methods to add listeners and notify them of the event.
 * <p>
 * author David
 */
class MyClass {
    private List<MyListener> listeners = new ArrayList<MyListener>();

    /**
     * Adds a listener to the list of listeners.
     *
     * @param listener the listener object to add.
     */
    public void addListener(MyListener listener) {
        listeners.add(listener);
    }

    /**
     * Notifies all registered listeners that something has happened.
     */
    void notifySomethingHappened() {
        for (MyListener listener : listeners) {
            listener.somethingHappened();
        }
    }
}
