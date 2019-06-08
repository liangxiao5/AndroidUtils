package com.liangxiao.utils;

import android.os.Handler;
import android.os.Looper;


public class UiThreadUtil {
    private static Handler sMainHandler;

    public static void runOnUiThread(Runnable runnable) {
        synchronized (UiThreadUtil.class) {
            if (sMainHandler == null) {
                sMainHandler = new Handler(Looper.getMainLooper());
            }
        }
        sMainHandler.post(runnable);
    }
}
