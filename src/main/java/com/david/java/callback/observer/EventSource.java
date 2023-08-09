package com.david.java.callback.observer;

import java.util.Observable;
import java.util.Scanner;

/**
 * The EventSource class is an example of the Observable pattern in Java.
 * It extends Observable and continuously reads input from the user.
 * When new input is received, it notifies its observers.
 * <p>
 * author David
 */
public class EventSource extends Observable implements Runnable {

    /**
     * Continuously reads input from the user and notifies observers when new input is received.
     */
    public void run() {
        while (true) {
            @SuppressWarnings("resource") String response = new Scanner(System.in).next();
            setChanged();
            notifyObservers(response);
        }
    }
}
