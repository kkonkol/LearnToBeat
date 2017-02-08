package com.example.mephysta.learntobeat.Animation;

import android.content.res.Resources;
import android.util.DisplayMetrics;

/**
 * provides helper functions
 */
public class Utils {

    /**
     * Converts dp to px.
     * Code von http://stackoverflow.com/questions/28531996/android-recyclerview-gridlayoutmanager-column-spacing/29905000
     * @param dp
     * @return
     */
    public static int convertDpToPx(int dp) {
        return Math.round(dp * (Resources.getSystem().getDisplayMetrics().xdpi / DisplayMetrics.DENSITY_DEFAULT));
    }
}