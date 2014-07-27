package com.koushikdutta.superuser.util;

import android.content.Context;
import android.util.Log;

public class SuHelper {
    public static String CURRENT_VERSION = "16";
    public static void checkSu(Context context) throws Exception {
        /**
         * This code snipet does not work: even with su installed, "su -v" does
         * not return version code.
         *
         * Plus, we don't really care if su binary is updated or not. We'll not
         * update Superuser.apk or su binary anyway.
         */
        /*
        Process p = Runtime.getRuntime().exec("su -v");
        String result = Settings.readToEnd(p.getInputStream());
        Log.i("Superuser", "Result: " + result);
        if (0 != p.waitFor())
            throw new Exception("non zero result");
        if (result == null)
            throw new Exception("no data");
        if (!result.contains(context.getPackageName()))
            throw new Exception("unknown su");

        String[] parts = result.split(" ");
        if (!CURRENT_VERSION.equals(parts[0]))
            throw new Exception("binary is old");
            */
    }
}
