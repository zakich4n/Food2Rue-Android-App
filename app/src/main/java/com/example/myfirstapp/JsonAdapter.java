package com.example.myfirstapp;

import com.google.gson.Gson;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;

public class JsonAdapter {

    public Product importJson(JSONObject json) throws JSONException {
        Product current_product = new Product(
                json.getString("product_name"));

        current_product.setCategories(json.getString("categories"));
        current_product.setTrace(json.getString("traces"));
        current_product.setBarcode(json.getString("code"));
        current_product.setBrands(json.getString("brands"));
        current_product.setLabels(json.getString("labels"));
        current_product.setIngredients_text(json.getString("ingredients_text"));
        current_product.setProduct_quantity(json.getString("quantity"));
        current_product.setAllergens(json.getString("allergens"));
        current_product.setPackaging(json.getString("packaging"));

        Product.Nutriments nutriments;
        Gson gson = new Gson();
        nutriments = gson.fromJson(json.getJSONObject("nutriments").toString(), Product.Nutriments.class);
        current_product.setNutriments(nutriments);
        current_product.setImage_url(json.getString("image_url"));

        Product.NutrientLevels nutrient_levels;
        Gson gson2 = new Gson();
        nutrient_levels = gson2.fromJson(json.getJSONObject("nutrient_levels").toString(), Product.NutrientLevels.class);
        current_product.setNutrient_levels(nutrient_levels);

        return current_product;
    }

    public Product newProduct(String data) throws JSONException, IOException, InterruptedException {
        JSONObject jsObj = new JSONObject(data);
        jsObj=jsObj.getJSONObject("product");
        Product product = importJson(jsObj);
        return product;
    }
}
