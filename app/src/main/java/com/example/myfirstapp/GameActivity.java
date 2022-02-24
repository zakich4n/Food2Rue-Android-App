package com.example.myfirstapp;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.jetbrains.annotations.NotNull;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class GameActivity extends AppCompatActivity {

    final LoadingDialog loadingDialog=new LoadingDialog(GameActivity.this);

    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.game);
        final LoadingDialog loadingDialog=new LoadingDialog(GameActivity.this);

        loadingDialog.startLoading();

        Handler handler= new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                loadingDialog.stopLoading();
            }
        }, 5000);
    }
    @Override
    protected void onStart() {
        super.onStart();

    }

    @Override
    protected void onResume() {
        super.onResume();

    }




    private void setText(final String data, final int layout, final int textView) {
        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                setContentView(layout);
                TextView my_data = (TextView) findViewById(textView);
                my_data.setText(data);
            }
        });
    }

    private String HTTPRequestGET(String URL) {
        final String data = "";
        OkHttpClient client = new OkHttpClient();
        Request request=new Request.Builder()
                .get()
                .url(URL)
                .build();
        client.newCall(request).enqueue(new Callback() {
            private final String TAG = null;

            @Override
            public void onFailure(@NotNull Call call, @NotNull IOException e) {

            }

            @Override
            public void onResponse(@NotNull Call call, @NotNull Response response) throws IOException {
                if (response.isSuccessful()) {
                    try {
                        String result = response.body().string();
                        if (!TextUtils.isEmpty(result)) {
                            result=data;
                        }
                    } catch (Exception e) {
                        Log.e(TAG, "Exception = " + e);
                    }
                }

            }
        });
        return data;
    }

}
