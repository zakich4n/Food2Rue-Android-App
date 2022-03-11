package com.example.myfirstapp;

import android.app.Activity;
import android.app.AlertDialog;
import android.view.LayoutInflater;

class LoadingDialog {
     private Activity act;
     private AlertDialog dialog;

     LoadingDialog(Activity currentAct) {
         act= currentAct;
     }

     void startLoading() {
         AlertDialog.Builder builder = new AlertDialog.Builder(act);

         LayoutInflater inflater = act.getLayoutInflater();
         builder.setView(inflater.inflate(R.layout.loading_dialog, null));

         builder.setCancelable(false);
         dialog = builder.create();
         dialog.show();

     }

     void stopLoading() {
         dialog.dismiss();
     }


}
