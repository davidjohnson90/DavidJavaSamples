package com.david.java.callback.observer;

import java.util.Observable;
import java.util.Observer;

/**
 * The DavidObserver class is an example of the Observer pattern in Java.
 * It demonstrates how to create an observer that listens for changes in an EventSource and responds to those changes.
 * <p>
 * author David
 */
public class DavidObserver {
    public static void main(String[] args) {
        System.out.println("Enter Text: ");
        EventSource eventSource = new EventSource();

        eventSource.addObserver(new Observer() {
            public void update(Observable obj, Object arg) {
                System.out.println("Received response: " + arg);
            }
        });

        new Thread(eventSource).start();
    }
}
