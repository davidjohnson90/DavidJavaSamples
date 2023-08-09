package com.david.java.callback.time;

/**
 * The TimeUpdaterCallBack interface is offered from your OS to be implemented by clients.
 * It provides a contract for classes that want to be notified about time updates.
 * <p>
 * author David
 */
interface TimeUpdaterCallBack {
    /**
     * Method to be called when a time update occurs.
     *
     * @param time the updated time in milliseconds.
     */
    void updateTime(long time);
}

/**
 * The WebSiteTimeUpdaterCallBack class is an implementation of the TimeUpdaterCallBack interface.
 * It updates the website's time every hour by printing the updated time.
 * <p>
 * author David
 */
class WebSiteTimeUpdaterCallBack implements TimeUpdaterCallBack {

    /**
     * Update the website's time by printing the updated time.
     *
     * @param time the updated time in milliseconds.
     */
    @Override
    public void updateTime(long time) {
        // Print the updated time anywhere in your website's example
        System.out.println(time);
    }
}
