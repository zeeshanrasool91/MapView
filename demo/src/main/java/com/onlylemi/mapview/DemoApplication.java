package com.onlylemi.mapview;

import android.app.Application;
import android.content.Context;

import leakcanary.LeakCanary;


/**
 * DemoApplication
 *
 * @author: onlylemi
 * @time: 2016-05-14 12:07
 */
public class DemoApplication extends Application {
    private static Context context;

    public static Context getContext() {
        return context;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        context = getApplicationContext();
    }
}
