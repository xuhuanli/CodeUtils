package com.xuhuanli.androidutils.appinfo;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;

/**
 * The type App util.
 */
public class AppUtil {

    private AppUtil() {
        throw new UnsupportedOperationException("Do not reflect acquisition");
    }

    private static String getPackageName(Context context) {
        return context.getPackageName();
    }

    /**
     * Get app name string.
     *
     * @param context the context
     * @return the string
     */
    public static String getAppName(Context context) {
        PackageManager pm = context.getPackageManager();
        try {
            PackageInfo packageInfo = pm.getPackageInfo(getPackageName(context), 0);
            return packageInfo.applicationInfo.loadLabel(pm).toString();
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * Get app version name string.
     *
     * @param context the context
     * @return the string
     */
    public static String getAppVersionName(Context context){
        PackageManager pm = context.getPackageManager();
        try {
            PackageInfo packageInfo = pm.getPackageInfo(getPackageName(context), 0);
            return packageInfo.versionName;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * Get app version code int.
     *
     * @param context the context
     * @return the int
     */
    public static int getAppVersionCode(Context context){
        PackageManager pm = context.getPackageManager();
        try {
            PackageInfo packageInfo = pm.getPackageInfo(getPackageName(context), 0);
            return packageInfo.versionCode;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
        }
        return 0;
    }
}
