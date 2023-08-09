package com.david.java.callback;

/**
 * The CallBack interface defines a contract for classes that want to be called back by another class.
 * It contains a single method methodToCallBack() that will be implemented by the callback classes.
 * <p>
 * author David
 */
interface CallBack {
    /**
     * Method to be called back by another class.
     */
    void methodToCallBack();
}

/**
 * The CallBackImpl class is an implementation of the CallBack interface.
 * It provides the actual implementation of the methodToCallBack() method.
 * <p>
 * author David
 */
class CallBackImpl implements CallBack {
    /**
     * Implementation of the methodToCallBack() method.
     */
    public void methodToCallBack() {
        System.out.println("I've been called back");
    }
}

/**
 * The Caller class demonstrates the registration and invocation of the callback method.
 * <p>
 * author David
 */
class Caller {
    /**
     * Main method to demonstrate the callback pattern.
     *
     * @param args command-line arguments (not used in this example).
     */
    public static void main(String[] args) {
        Caller caller = new Caller();
        CallBack callBack = new CallBackImpl();
        caller.register(callBack);
    }

    /**
     * Registers a callback and invokes its methodToCallBack() method.
     *
     * @param callback the callback object to register and invoke.
     */
    public void register(CallBack callback) {
        callback.methodToCallBack();
    }
}
