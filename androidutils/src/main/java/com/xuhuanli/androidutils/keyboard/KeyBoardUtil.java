package com.xuhuanli.androidutils.keyboard;

import android.content.Context;
import android.view.View;
import android.view.inputmethod.InputMethodManager;

/**
 * The type Key board utils.
 */
public class KeyBoardUtil {

    /**
     * Display ime.
     *
     * @param view the view
     */
    public static void displayIme(View view) {
        Context context = view.getContext();
        InputMethodManager imm = (InputMethodManager) context.getSystemService(Context.INPUT_METHOD_SERVICE);
        view.requestFocus();
        assert imm != null;
        imm.showSoftInput(view, InputMethodManager.SHOW_IMPLICIT);
    }

    /**
     * Hide ime.
     *
     * @param view the view
     */
    public static void hideIme(View view) {
        Context context = view.getContext();
        InputMethodManager imm = (InputMethodManager) context.getSystemService(Context.INPUT_METHOD_SERVICE);
        assert imm != null;
        imm.hideSoftInputFromWindow(view.getWindowToken(), 0);
    }
}
