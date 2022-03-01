package com.example.myfirstapp;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.util.Log;
import android.widget.TextView;

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
    public JsonAdapter jsonAdapter;
    public TextView product_name;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.paul);
        product_name = findViewById(R.id.product_name);
        barcodeData = barcode.getBarcodeData();


        final String URL = "https://world.openfoodfacts.org/api/v2/product/"+barcodeData+".json";

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
                            Product prod = jsonAdapter.newProduct(result);
                            SetInfo(prod);
                        }
                    } catch (Exception e) {
                        Log.e(TAG, "Exception = " + e);
                    }
                }
            }
        });
    }

    public void SetInfo (Product product){
        product_name.setText(product.getGeneric_name());
    }
}