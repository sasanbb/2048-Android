package com.buddybuild.a2048;

import android.app.Application;
import android.support.multidex.MultiDex;
import android.support.multidex.MultiDexApplication;

import com.buddybuild.sdk.BuddyBuild;

/**
 * Created by sasannaderi on 2017-10-05.
 */

public class MainApp extends MultiDexApplication {

    @Override
    public void onCreate() {
        super.onCreate();
        MultiDex.install(this);
        BuddyBuild.setup(this);
    }
}
