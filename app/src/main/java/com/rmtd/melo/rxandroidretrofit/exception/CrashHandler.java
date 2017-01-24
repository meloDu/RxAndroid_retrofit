package com.rmtd.melo.rxandroidretrofit.exception;


import android.content.Context;
import android.util.Log;

/**
 * 全局Crash捕获处理
 * Created by melo on 2017/1/24.
 */
public class CrashHandler implements Thread.UncaughtExceptionHandler {

//    public final Logger mLogger = Logger.getLogger(getClass());

    private static CrashHandler INSTANCE = new CrashHandler();
    private Thread.UncaughtExceptionHandler mDefaultUEH;
    private Context mContext;

    private CrashHandler() {
        mDefaultUEH = Thread.getDefaultUncaughtExceptionHandler();
    }

    public static CrashHandler getInstance() {
        return INSTANCE;
    }

    public void init(Context ctx) {
        Thread.setDefaultUncaughtExceptionHandler(this);
        mContext = ctx;
    }

    @Override
    public void uncaughtException(Thread thread, Throwable ex) {
        Log.e("CrashHandler", ex.getMessage(), ex);
        mDefaultUEH.uncaughtException(thread, ex);
    }

}
