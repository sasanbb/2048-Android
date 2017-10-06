package com.buddybuild.a2048;

import android.app.Application;

import com.buddybuild.sdk.BuddyBuild;

/**
 * Created by sasannaderi on 2017-10-05.
 */

public class MainApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        BuddyBuild.setup(this);
    }
}
