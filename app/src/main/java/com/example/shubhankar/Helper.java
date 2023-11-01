package com.example.shubhankar;

import android.accessibilityservice.AccessibilityService;
import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Environment;
import android.preference.PreferenceManager;
import android.util.Log;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

public class Helper {
    public static SharedPreferences.Editor editor;
    public static SharedPreferences sha;
    public static ProgressDialog dialog;

    public static boolean isAppRunning(final Context context, final String packageName) {
        final ActivityManager activityManager = (ActivityManager) context.getSystemService(Context.ACTIVITY_SERVICE);
        final List<ActivityManager.RunningAppProcessInfo> procInfos = activityManager.getRunningAppProcesses();
        if (procInfos != null) {
            for (final ActivityManager.RunningAppProcessInfo processInfo : procInfos) {
                if (processInfo.processName.equals(packageName)) {
                    return true;
                }
            }
        }
        return false;
    }




    public static void dismissProgressDialog() {
        try {
            if (dialog != null && dialog.isShowing()) {
                dialog.dismiss();
                dialog = null;
            }
        } catch (final IllegalArgumentException e) {
            Log.e("Helper: ", "Exception: " + e.getMessage());
        } catch (final Exception e) {
            Log.e("Helper: ", "Exception: " + e.getMessage());
        } finally {
            dialog = null;
        }
    }

    public static void saveQRCodeArrayList(ArrayList<String> list, String key, Context context) {
        if (context != null) {
            SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
            SharedPreferences.Editor editor = prefs.edit();
            Gson gson = new Gson();
            String json = gson.toJson(list);
            editor.putString(key, json);
            editor.apply();
        }
    }

    public static ArrayList<String> getQRCodeArrayList(String key, Context context) {
        SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(context);
        Gson gson = new Gson();
        String json = prefs.getString(key, null);
        Type type = new TypeToken<ArrayList<String>>() {
        }.getType();
        return gson.fromJson(json, type);
    }

    @SuppressLint("CommitPrefEdits")
    public static void saveBooleanPreferenceData(Context context, String key, boolean value) {
        if (context != null) {
            editor = PreferenceManager.getDefaultSharedPreferences(context).edit();
            editor.putBoolean(key, value);
            editor.commit();
        }
    }

    public static boolean getBooleanPreferenceData(Context context, String key) {
        if (context != null) {
            sha = PreferenceManager.getDefaultSharedPreferences(context);
            return sha.getBoolean(key, false);
        } else {
            return true;
        }
    }

    @SuppressLint("CommitPrefEdits")
    public static void saveIntPreferenceData(Context context, String key, Integer value) {
        if (context != null) {
            editor = PreferenceManager.getDefaultSharedPreferences(context).edit();
            editor.putInt(key, value);
            editor.commit();
        }
    }

    @SuppressLint("CommitPrefEdits")
    public static void savePreferenceData(Context context, String key, String value) {
        if (context != null) {
            editor = PreferenceManager.getDefaultSharedPreferences(context).edit();
            editor.putString(key, value);
            editor.commit();
        }
    }

    public static void showProgressDialog(Context context, String message) {
        if (context != null) {
            dialog = new ProgressDialog(context, R.style.MyProgressDialogStyle);
            dialog.setMessage(message);
            dialog.setCancelable(false);
            dialog.setCanceledOnTouchOutside(false);
            dialog.show();
        }

    }

    public static boolean isNetworkAvailable(Context context) {
        if (context == null) return false;
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        if (connectivityManager != null) {
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
                NetworkCapabilities capabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
                if (capabilities != null) {
                    if (capabilities.hasTransport(NetworkCapabilities.TRANSPORT_CELLULAR)) {
                        return true;
                    } else if (capabilities.hasTransport(NetworkCapabilities.TRANSPORT_WIFI)) {
                        return true;
                    } else if (capabilities.hasTransport(NetworkCapabilities.TRANSPORT_ETHERNET)) {
                        return true;
                    }
                }
            } else {
                try {
                    NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                    if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                        Log.i("update_statut", "Network is available : true");
                        return true;
                    }
                } catch (Exception e) {
                    Log.i("update_statut", "" + e.getMessage());
                }
            }
        }
        return false;
    }

    public static String getPreferenceData(Context context, String key) {
        if (context != null) {
            sha = PreferenceManager.getDefaultSharedPreferences(context);
            return sha.getString(key, "");
        } else {
            return "";
        }
    }

    public static Integer getIntPreferenceData(Context context, String key) {
        if (context != null) {
            sha = PreferenceManager.getDefaultSharedPreferences(context);
            return sha.getInt(key, 0);
        } else {
            return 0;
        }
    }

    //method for check whether serice is running or not public static boolean isMyServiceRunning(Class<?> serviceClass, Context context) {
//    ActivityManager manager = (ActivityManager) context.getSystemService(Context.ACTIVITY_SERVICE);
//    for (ActivityManager.RunningServiceInfo service : manager.getRunningServices(Integer.MAX_VALUE)) {
//        if (serviceClass.getName().equals(service.service.getClassName())) {
//            return true;
//        }
//    }
//    return false;
}