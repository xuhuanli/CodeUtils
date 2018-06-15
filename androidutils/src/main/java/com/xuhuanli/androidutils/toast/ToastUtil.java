package com.xuhuanli.androidutils.toast;

import android.annotation.SuppressLint;
import android.content.Context;
import android.widget.Toast;

import java.lang.ref.WeakReference;

/**
 * The type Toast util.
 */
public class ToastUtil {

    /**
     * The constant isShow.
     */
    public static boolean isShow = true;
    private static Toast mToast;

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
            if (mToast == null) {
                WeakReference<Context> weakReference = new WeakReference<>(context);
                mToast = Toast.makeText(weakReference.get(),
                        message,
                        Toast.LENGTH_SHORT);
            } else {
                mToast.setText(message);
            }
            mToast.show();
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
            if (mToast == null) {
                WeakReference<Context> weakReference = new WeakReference<>(context);
                mToast = Toast.makeText(weakReference.get(),
                        resId,
                        Toast.LENGTH_SHORT);
            } else {
                mToast.setText(resId);
            }
            mToast.show();
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
            if (mToast == null) {
                WeakReference<Context> weakReference = new WeakReference<>(context);
                mToast = Toast.makeText(weakReference.get(),
                        message,
                        Toast.LENGTH_LONG);
            } else {
                mToast.setText(message);
            }
            mToast.show();
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
            if (mToast == null) {
                WeakReference<Context> weakReference = new WeakReference<>(context);
                mToast = Toast.makeText(weakReference.get(),
                        resId,
                        Toast.LENGTH_LONG);
            } else {
                mToast.setText(resId);
            }
            mToast.show();
        }
    }
}