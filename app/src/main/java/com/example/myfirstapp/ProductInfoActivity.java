package com.example.myfirstapp;


import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.text.TextUtils;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

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
    public TextView product_brand;
    public TextView product_quantity;
    public TextView product_desc;
    public TextView product_packaging;
    public TextView product_labels;
    public TextView product_traces;
    public TextView product_allergens;
    public TextView ingredients;
    public ImageView product_image;

    public Product prod;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.paul);

        barcodeData = getIntent().getExtras().getString("barcode");
        product_brand = findViewById(R.id.product_brands);
        product_name = findViewById(R.id.product_name);
        product_quantity = findViewById(R.id.product_quantity);
        product_desc = findViewById(R.id.product_description);
        product_packaging = findViewById(R.id.product_packagings);
        product_labels = findViewById(R.id.product_labels);
        product_traces = findViewById(R.id.product_traces);
        product_allergens = findViewById(R.id.product_allergens);
        ingredients = findViewById(R.id.product_ingredients);
        product_image = findViewById(R.id.product_image);

        String url = "https://world.openfoodfacts.org/api/v2/product/" + barcodeData + ".json";

        try {
            get_product_as_Product(url);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        
    }

    public void updateUI(final Product product){
        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                product_name.setText(product.getGeneric_name());
                product_brand.setText(product.getBrands());
                product_quantity.setText(product.getProduct_quantity());
                product_desc.setText(product.getCategories());
                product_packaging.setText(product.getPackaging());
                product_labels.setText(product.getLabels());
                product_traces.setText(product.getTrace());
                product_allergens.setText(product.getAllergens());
                ingredients.setText(product.getIngredients_text());
                Picasso.get().load(product.getImage_url()).fit().into(product_image);
            }
        });

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