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
    public TextView product_energy_as_sold_for_100;
    public TextView product_energy_as_sold_per_serving;
    public TextView product_fat_as_sold_for_100;
    public TextView product_fat_as_as_sold_per_serving;
    public TextView product_saturated_fat_as_sold_for_100;
    public TextView product_saturated_fat_as_sold_per_serving;
    public TextView product_protein_as_sold_for_100;
    public TextView product_protein_as_sold_per_serving;
    public TextView product_salt_as_sold_for_100;
    public TextView product_salt_as_sold_per_serving;
    public TextView product_carbohydrates_as_sold_for_100;
    public TextView product_carbohydrates_as_sold_per_serving;



    public Product prod;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.article_form2);

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
        product_energy_as_sold_for_100 = findViewById(R.id.energy_as_sold_for_100);
        product_energy_as_sold_per_serving = findViewById(R.id.energy_as_sold_per_serving);
        product_fat_as_sold_for_100 = findViewById(R.id.fat_as_sold_for_100);
        product_fat_as_as_sold_per_serving = findViewById(R.id.fat_as_sold_per_serving);
        product_saturated_fat_as_sold_for_100 = findViewById(R.id.saturated_fat_as_sold_for_100);
        product_saturated_fat_as_sold_per_serving = findViewById(R.id.saturated_fat_as_sold_per_serving);
        product_protein_as_sold_for_100 = findViewById(R.id.protein_as_sold_for_100);
        product_protein_as_sold_per_serving = findViewById(R.id.protein_as_sold_per_serving);
        product_salt_as_sold_for_100 = findViewById(R.id.salt_as_sold_for_100);
        product_salt_as_sold_per_serving = findViewById(R.id.salt_as_sold_per_serving);
        product_carbohydrates_as_sold_for_100 = findViewById(R.id.carbohydrates_as_sold_for_100);
        product_carbohydrates_as_sold_per_serving = findViewById(R.id.carbohydrates_as_sold_per_serving);



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
                product_name.setText((product.getGeneric_name()==null) ? "unknown" : product.getGeneric_name());
                product_brand.setText((product.getBrands()==null) ? "unknown" : product.getBrands());
                product_quantity.setText((product.getProduct_quantity()==null) ? "unknown" : product.getProduct_quantity());
                product_desc.setText((product.getCategories()==null) ? "unknown" : product.getCategories());
                product_packaging.setText((product.getPackaging()==null) ? "unknown" : product.getPackaging());
                product_labels.setText((product.getLabels()==null) ? "unknown" :product.getLabels() );
                product_traces.setText((product.getTrace()==null) ? "unknown" : product.getTrace());
                product_allergens.setText((product.getAllergens()==null) ? "unknown" : product.getAllergens());
                ingredients.setText((product.getIngredients_text()==null) ? "unknown" : product.getIngredients_text());
                product_energy_as_sold_for_100.setText((product.nutriments.getEnergyKcal100g() == null) ? "unknown" : String.valueOf(product.nutriments.getEnergyKcal100g()));
                product_energy_as_sold_per_serving.setText((product.nutriments.getEnergy_serving()==null) ? "unknown" : String.valueOf(product.nutriments.getEnergy_serving()));
                product_fat_as_sold_for_100.setText((product.nutriments.getFat_100g()==null) ? "unknown" : String.valueOf(product.nutriments.getFat_100g()));
                product_fat_as_as_sold_per_serving.setText((product.nutriments.getFat_serving()==null) ? "unknown" : String.valueOf(product.nutriments.getFat_serving()));
                product_saturated_fat_as_sold_for_100.setText((product.nutriments.getSaturatedFat100g() != null) ? String.valueOf(product.nutriments.getSaturatedFat100g()) : "unknown");
                product_saturated_fat_as_sold_per_serving.setText((product.nutriments.getSaturatedFatServing()==null) ? "unknown" : String.valueOf(product.nutriments.getSaturatedFatServing()));
                product_protein_as_sold_for_100.setText((product.nutriments.getProteins_100g() == null) ? "unknown" : (String.valueOf(product.nutriments.getProteins_100g()) + ""));
                product_protein_as_sold_per_serving.setText((product.nutriments.getProteins_serving()==null) ? "unknown" : String.valueOf(product.nutriments.getProteins_serving())+"");
                product_salt_as_sold_for_100.setText((product.nutriments.getSalt_100g()==null) ? "unknown" : String.valueOf(product.nutriments.getSalt_100g())+"");
                product_salt_as_sold_per_serving.setText((product.nutriments.getSalt_serving()==null) ? "unknown" : String.valueOf(product.nutriments.getSalt_serving())+"");
                product_carbohydrates_as_sold_for_100.setText((product.nutriments.getCarbohydrates_100g()==null) ? "unknown" : String.valueOf(product.nutriments.getCarbohydrates_100g())+"");
                product_carbohydrates_as_sold_per_serving.setText((product.nutriments.getCarbohydrates_serving()==null) ? "unknown" : String.valueOf(product.nutriments.getCarbohydrates_serving())+"");
                Picasso.get().load(product.getImage_url()).fit().into(product_image);

                //( ==null) ? "unknown" : String.valueOf(product.nutriments.getEnergyKcal100g())
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