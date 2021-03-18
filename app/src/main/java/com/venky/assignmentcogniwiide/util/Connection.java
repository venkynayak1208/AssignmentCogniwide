package com.venky.assignmentcogniwiide.util;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.ConnectivityManager;

public class Connection {

    @SuppressLint("MissingPermission")
    public static boolean isNetworkAvailable(Context context) {
        final ConnectivityManager connectivityManager
                = ((ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE));
        return connectivityManager.getActiveNetworkInfo() != null && connectivityManager.getActiveNetworkInfo().isConnected();
    }
}
