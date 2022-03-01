package com.example.myfirstapp;

import android.app.Activity;
import android.view.LayoutInflater;

import androidx.appcompat.app.AlertDialog;

class LoadingDialog {

    private Activity activity;
    private static AlertDialog alertDialog;

    LoadingDialog(Activity myactivity) {
        activity= myactivity;
    }

    void startLoadingDialog()
    {
        androidx.appcompat.app.AlertDialog.Builder builder = new androidx.appcompat.app.AlertDialog.Builder(activity);
        LayoutInflater inflater = activity.getLayoutInflater();
        builder.setView(inflater.inflate(R.layout.loading_screen,null));
        builder.setCancelable(false);

        alertDialog = builder.create();
        alertDialog.show();
    }

    static void dismisDialog()
    {
        alertDialog.dismiss();
    }
}
