package com.xuhuanli.androidutils.Density;

import android.content.Context;
import android.util.TypedValue;

/**
 * The type Density util.
 */
public class DensityUtil {

    /**
     * Dp 2 px int.
     *
     * @param context the context
     * @param dp      the dp
     * @return the int
     */
    public static int dp2px(Context context, float dp) {
        return (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, dp, context.getResources().getDisplayMetrics());
    }

    /**
     * Sp 2 px int.
     *
     * @param context the context
     * @param sp      the sp
     * @return the int
     */
    public static int sp2px(Context context, float sp) {
        return (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_SP, sp, context.getResources().getDisplayMetrics());
    }

    /**
     * Px 2 dp float.
     *
     * @param context the context
     * @param px      the px
     * @return the float
     */
    public static float px2dp(Context context, float px){
        float density = context.getResources().getDisplayMetrics().density;
        return (px/density);
    }

    /**
     * Sp 2 dp float.
     *
     * @param context the context
     * @param px      the px
     * @return the float
     */
    public static float sp2dp(Context context, float px){
        float scaledDensity = context.getResources().getDisplayMetrics().scaledDensity;
        return (px/scaledDensity);
    }
}
