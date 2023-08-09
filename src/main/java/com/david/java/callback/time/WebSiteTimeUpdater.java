package com.david.java.callback.time;

/**
 * The WebSiteTimeUpdater class is a client class used in our WebSite example.
 * It is responsible for updating the website's time every hour using the SystemTimer and WebSiteTimeUpdaterCallBack.
 * <p>
 * author David
 */
public class WebSiteTimeUpdater {

    public static void main(String[] args) {
        SystemTimer systemTimer = new SystemTimer();
        TimeUpdaterCallBack webSiteCallBackUpdater = new WebSiteTimeUpdaterCallBack();
        systemTimer.registerCallBackForUpdatesEveryHour(webSiteCallBackUpdater);
    }
}
