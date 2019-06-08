package com.liangxiao.utils;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.DisplayMetrics;

/**
 *在Application or activity初始化
 */
public class DisplayMetricsHolder {
    private static @Nullable DisplayMetrics sWindowDisplayMetrics;

    public static void setWindowDisplayMetrics(DisplayMetrics displayMetrics) {
        sWindowDisplayMetrics = displayMetrics;
    }
    @Nullable
    public static DisplayMetrics getWindowDisplayMetrics() {
        return sWindowDisplayMetrics;
    }
    public static void initDisplayMetricsIfNotInitialized(Context context) {
        if (DisplayMetricsHolder.getWindowDisplayMetrics() != null) {
            return;
        }
        initDisplayMetrics(context);
    }

    public static void initDisplayMetrics(Context context) {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        DisplayMetricsHolder.setWindowDisplayMetrics(displayMetrics);
    }



}
