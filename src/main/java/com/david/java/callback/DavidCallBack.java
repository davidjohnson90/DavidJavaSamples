package com.david.java.callback;

/**
 * The Callable interface defines a contract for classes that can be called back.
 * It contains a single method callBackMethod() that will be implemented by the callback classes.
 * <p>
 * author David
 */
interface Callable {
    /**
     * Method to be called back by other classes.
     */
    public void callBackMethod();
}

/**
 * The DavidCallBack class contains the main method to demonstrate the callback pattern.
 * It creates a Boss object and calls its directMethod.
 * <p>
 * author David
 */
public class DavidCallBack {
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.directMethod();
    }
}

/**
 * The Worker class is an example class that demonstrates the callback pattern.
 * It gets a handle to the boss object via the Callable interface.
 * There's no way this worker class can call any other method other than the one in Callable.
 * <p>
 * author David
 */
class Worker {
    /**
     * Worker does some work and calls the callBackMethod of the boss.
     *
     * @param myBoss the callback object (boss) to call back.
     */
    public void doSomeWork(Callable myBoss) {
        myBoss.callBackMethod();
        // ERROR!
        // myBoss.directMethod();
    }
}

/**
 * The Boss class is an example class that implements the Callable interface and acts as the callback object.
 * It creates a worker object and tells it to do some work, passing itself as a callback.
 * <p>
 * author David
 */
class Boss implements Callable {
    /**
     * Boss constructor.
     * It creates a worker object and passes itself as a callback to the worker.
     */
    public Boss() {
        Worker w1 = new Worker();
        // Notice, we're passing a reference of the boss to the worker.
        w1.doSomeWork(this);
    }

    /**
     * Implementation of the callBackMethod() method from the Callable interface.
     * It prints a message "What do you want?" as a callback response.
     */
    public void callBackMethod() {
        System.out.println("What do you want?");
    }

    /**
     * Direct method of the boss class.
     * It prints a message "I'm out for coffee."
     */
    public void directMethod() {
        System.out.println("I'm out for coffee.");
    }
}
