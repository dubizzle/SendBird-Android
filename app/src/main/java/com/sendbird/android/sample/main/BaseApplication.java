package com.sendbird.android.sample.main;


import android.app.Application;

import com.sendbird.android.SendBird;
import com.sendbird.android.sample.utils.PreferenceUtils;

public class BaseApplication extends Application {

    private static final String APP_ID = "66C51FAE-1679-4148-B104-23910C5223CE";
    public static final String VERSION = "Shedd Android Stage";

    @Override
    public void onCreate() {
        super.onCreate();
        PreferenceUtils.init(getApplicationContext());

        SendBird.init(APP_ID, getApplicationContext());
    }
}
