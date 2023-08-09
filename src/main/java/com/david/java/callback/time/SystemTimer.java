package com.david.java.callback.time;

import java.util.ArrayList;
import java.util.List;

/**
 * The SystemTimer class represents a hypothetical system timer implemented by your Operating System (OS).
 * You don't know the actual implementation of this timer, but this example shows how it could look like.
 * It supports callback functionality by allowing clients to register callbacks to be called every hour.
 * <p>
 * author David
 */
class SystemTimer {

    // List to store registered TimeUpdaterCallBack objects
    List<TimeUpdaterCallBack> callbacks = new ArrayList<TimeUpdaterCallBack>();

    /**
     * Registers a TimeUpdaterCallBack to be called for updates every hour.
     *
     * @param timerCallBack the TimeUpdaterCallBack to register.
     */
    public void registerCallBackForUpdatesEveryHour(TimeUpdaterCallBack timerCallBack) {
        callbacks.add(timerCallBack);
    }

    // ... This SystemTimer may have more logic here, but we don't know ...

    /**
     * Simulates the passage of one hour. At some point of the implementation of this SystemTimer (you don't know),
     * this method will be called, and every registered timerCallBack will be called.
     * Every registered timerCallBack may have a totally different implementation of the method updateTime()
     * and may be used in different ways by different clients.
     */
    public void oneHourHasBeenExpired() {
        for (TimeUpdaterCallBack timerCallBack : callbacks) {
            // Call updateTime() for each registered TimeUpdaterCallBack
            timerCallBack.updateTime(System.currentTimeMillis());
        }
    }
}
