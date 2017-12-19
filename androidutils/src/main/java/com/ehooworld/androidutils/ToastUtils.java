﻿package com.ehooworld.androidutils;

import android.content.Context;
import android.widget.Toast;

import static android.R.id.message;

/**
 * Toast统一管理类
 * 
 */
public class ToastUtils
{
	private static Toast toast;
	private ToastUtils()
	{
		/* cannot be instantiated */
		throw new UnsupportedOperationException("cannot be instantiated");
	}

	public static boolean isShow = true;
	

	/**
	 * 短时间显示Toast
	 * 
	 * @param context
	 * @param message
	 */
	public static void showShort(Context context, CharSequence message)
	{
		if (isShow){
			if (toast == null) {
            toast = Toast.makeText(context,
					message,
                         Toast.LENGTH_SHORT);
			}else{
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
	public static void showShort(Context context, int resId)
	{
		if (isShow){
			if (toast == null) {
				toast = Toast.makeText(context,
						resId,
						Toast.LENGTH_SHORT);
			}else{
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
	public static void showLong(Context context, CharSequence message)
	{
		if (isShow){
			if (toast == null) {
				toast = Toast.makeText(context,
						message,
						Toast.LENGTH_LONG);
			}else{
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
	public static void showLong(Context context, int resId)
	{
		if (isShow){
			if (toast == null) {
				toast = Toast.makeText(context,
						resId,
						Toast.LENGTH_LONG);
			}else{
				toast.setText(resId);
			}
			toast.show();
		}
	}

	/**
	 * 自定义显示Toast时间
	 * 
	 * @param context
	 * @param message
	 * @param duration
	 */
	public static void show(Context context, CharSequence message, int duration)
	{
		if (isShow){
			if (toast == null) {
				toast = Toast.makeText(context,
						message,
						duration);
			}else{
				toast.setText(message);
			}
			toast.show();
		}
	}

	/**
	 * 自定义显示Toast时间
	 * 
	 * @param context
	 * @param resId
	 * @param duration
	 */
	public static void show(Context context, int resId, int duration)
	{
		if (isShow){
			if (toast == null) {
				toast = Toast.makeText(context,
						resId,
						duration);
			}else{
				toast.setText(resId);
			}
			toast.show();
		}
	}

}