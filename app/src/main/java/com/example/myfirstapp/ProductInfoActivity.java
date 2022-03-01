package com.example.myfirstapp;


import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.text.TextUtils;
import android.util.Log;
import android.widget.TextView;

import org.jetbrains.annotations.NotNull;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;


public class ProductInfoActivity extends AppCompatActivity {
    public String barcodeData;
    public TextView product_name;
    public TextView code_barre;
    JsonAdapter jsonAdapter;

    private String url;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.paul);

        product_name = findViewById(R.id.product_name);
        barcodeData = getIntent().getExtras().getString("barcode");
        code_barre = findViewById(R.id.code_barre);
        url = "https://world.openfoodfacts.org/api/v2/product/"+barcodeData+".json";


        OkHttpClient client = new OkHttpClient();
        Request request=new Request.Builder()
                .get()
                .url(url)
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
                        }
                    } catch (Exception e) {
                        Log.e(TAG, "Exception = " + e);
                    }
                }
            }
        });

        code_barre.setText(url);
    }

    public void SetInfo (Product product){
        product_name.setText(product.getGeneric_name());
    }
}