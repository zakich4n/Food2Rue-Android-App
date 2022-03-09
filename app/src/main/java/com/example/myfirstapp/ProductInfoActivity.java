package com.example.myfirstapp;


import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.text.TextUtils;
import android.util.Log;
import android.widget.TextView;

import org.jetbrains.annotations.NotNull;

import java.io.IOException;
import java.util.concurrent.CountDownLatch;

import okhttp3.Call;
import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;


public class ProductInfoActivity extends AppCompatActivity {
    public String barcodeData;
    public TextView product_name;
    public TextView code_barre;
    public Product prod;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.paul);

        barcodeData = getIntent().getExtras().getString("barcode");
        product_name = findViewById(R.id.product_name);
        code_barre = findViewById(R.id.code_barre);

        String url = "https://world.openfoodfacts.org/api/v2/product/" + barcodeData + ".json";

        try {
            get_product_as_Product(url);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        
    }

    public void updateUI(Product product){
        code_barre.setText(barcodeData);
        product_name.setText(product.getGeneric_name());
        Log.d("Pierre",product.getBrands());
    }

    public void get_product_as_Product(String url_product) throws InterruptedException {

        OkHttpClient client = new OkHttpClient();
        Request request=new Request.Builder()
                .get()
                .url(url_product)
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
                           prod = JsonAdapter.getInstance().newProduct(result);
                            updateUI(prod);
                        }

                    } catch (Exception e) {
                        Log.e(TAG, "Exception = " + e);
                    }
                }
            }
        });
    }

}