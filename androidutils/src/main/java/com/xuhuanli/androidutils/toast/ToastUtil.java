package com.xuhuanli.androidutils.toast;

import android.annotation.SuppressLint;
import android.content.Context;
import android.widget.Toast;

/**
 * The type Toast util.
 */
public class ToastUtil {

    /**
     * The constant isShow.
     */
//Toast 开关
    public static boolean isShow = true;
    private static Toast toast;

    private ToastUtil() {
        /* cannot be instantiated */
        throw new UnsupportedOperationException("Do not reflect acquisition");
    }

    /**
     * Show short.
     *
     * @param context the context
     * @param message the message
     */
    @SuppressLint("ShowToast")
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
     * Show short.
     *
     * @param context the context
     * @param resId   the res id
     */
    @SuppressLint("ShowToast")
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
     * Show long.
     *
     * @param context the context
     * @param message the message
     */
    @SuppressLint("ShowToast")
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
     * Show long.
     *
     * @param context the context
     * @param resId   the res id
     */
    @SuppressLint("ShowToast")
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