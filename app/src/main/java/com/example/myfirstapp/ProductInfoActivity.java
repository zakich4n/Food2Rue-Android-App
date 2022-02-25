package com.example.myfirstapp;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.util.Log;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;


public class ProductInfoActivity extends AppCompatActivity {
    public BarcodeActivity barcode;
    public String barcodeData;
    public String obj;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.paul);
        barcodeData = barcode.getBarcodeData();

        final String URL = "https://world.openfoodfacts.org/api/v2/product/"+barcodeData;

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
                        final String result = response.body().string();
                        if (!TextUtils.isEmpty(result)) {
                            obj = result;
                        }
                    } catch (Exception e) {
                        Log.e(TAG, "Exception = " + e);
                    }
                }
            }
        });
        Gson gson = new GsonBuilder().create();
        Product product = gson.fromJson( obj, Product.class);
        System.out.print(product);
    }
}