package com.thewizrd.simplewear.preferences;

import android.content.SharedPreferences;
import android.preference.PreferenceManager;

import com.thewizrd.simplewear.App;

public class Settings {
    public static final String TAG = "Settings";

    public static final String KEY_LAYOUTMODE = "key_layoutmode";
    public static final String KEY_AUTOLAUNCH = "key_autolaunchmediactrls";

    public static boolean useGridLayout() {
        SharedPreferences preferences =
                PreferenceManager.getDefaultSharedPreferences(App.getInstance().getAppContext());
        return preferences.getBoolean(KEY_LAYOUTMODE, true);
    }

    public static void setGridLayout(boolean value) {
        SharedPreferences.Editor editor =
                PreferenceManager.getDefaultSharedPreferences(App.getInstance().getAppContext())
                        .edit();
        editor.putBoolean(KEY_LAYOUTMODE, value);
        editor.apply();
    }

    public static boolean isAutoLaunchMediaCtrlsEnabled() {
        SharedPreferences preferences =
                PreferenceManager.getDefaultSharedPreferences(App.getInstance().getAppContext());
        return preferences.getBoolean(KEY_AUTOLAUNCH, true);
    }

    public static void setAutoLaunchMediaCtrls(boolean enabled) {
        SharedPreferences.Editor editor =
                PreferenceManager.getDefaultSharedPreferences(App.getInstance().getAppContext())
                        .edit();
        editor.putBoolean(KEY_AUTOLAUNCH, enabled);
        editor.apply();
    }
}
