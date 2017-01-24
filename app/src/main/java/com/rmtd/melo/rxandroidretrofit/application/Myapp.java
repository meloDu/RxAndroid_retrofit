package com.rmtd.melo.rxandroidretrofit.application;

import android.app.Application;
import android.util.Log;

import com.rmtd.melo.rxandroidretrofit.exception.CrashHandler;

/**
 * Created by melo on 2017/1/24.
 */
public class Myapp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        CrashHandler.getInstance().init(this);
        Log.e("tag", "初始化");
    }
}
