package com.xuhuanli.androidutils;

import android.content.Context;
import android.widget.Toast;

public class ToastUtils {

    //Toast
    public static boolean isShow = true;
    private static Toast toast;

    private ToastUtils() {
        /* cannot be instantiated */
        throw new UnsupportedOperationException("cannot be instantiated");
    }

    /**
     * 短时间显示Toast
     *
     * @param context
     * @param message
     */
    public static void showShort(Context context, CharSequence message) {
        if (isShow) {
            if (toast == null) {
                toast = Toast.makeText(context.getApplicationContext(),
                        message,
                        Toast.LENGTH_SHORT);
            } else {
                toast.setText(message);
            }
            toast.show();
        }
    }

    /**
     * 短时间显示Toast
     *
     * @param context
     * @param resId
     */
    public static void showShort(Context context, int resId) {
        if (isShow) {
            if (toast == null) {
                toast = Toast.makeText(context.getApplicationContext(),
                        resId,
                        Toast.LENGTH_SHORT);
            } else {
                toast.setText(resId);
            }
            toast.show();
        }
    }

    /**
     * 长时间显示Toast
     *
     * @param context
     * @param message
     */
    public static void showLong(Context context, CharSequence message) {
        if (isShow) {
            if (toast == null) {
                toast = Toast.makeText(context.getApplicationContext(),
                        message,
                        Toast.LENGTH_LONG);
            } else {
                toast.setText(message);
            }
            toast.show();
        }
    }

    /**
     * 长时间显示Toast
     *
     * @param context
     * @param resId
     */
    public static void showLong(Context context, int resId) {
        if (isShow) {
            if (toast == null) {
                toast = Toast.makeText(context.getApplicationContext(),
                        resId,
                        Toast.LENGTH_LONG);
            } else {
                toast.setText(resId);
            }
            toast.show();
        }
    }
}