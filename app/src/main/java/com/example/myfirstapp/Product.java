package com.example.myfirstapp;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

public class Product {
    protected String generic_name;                  //the short generic name of the product
    protected String barcode;                       //the id|barcode of the product
    protected String product_quantity;              //quantity of one sold unit
    protected String packaging;         //an array list of the packaging materials
    protected String brands;                        //string value of the products brand
    protected String labels;                        //string value of important labels describing the product

    protected String ingredients_text ;             //string values of the listed ingredients
    protected Nutriments nutriments;         //An array of all the nutriments (energy value per kcal, kJ ect.)
    protected NutrientLevels nutrient_levels;   //An array of the of nutrients levels for 100
    //contains "fat", "salt", "saturated-fat", "sugars"
    protected String trace;                         //the string list of all traces in the product
    protected String allergens;          //array list of allergens in the product
    protected String categories;                    //string containing the product's categories
    protected String image_url;    //array with different pictures of the product from different countries (front, back, ingredients etc.)

    public Product(String _generic_name){           //simple constructor
        this.generic_name=_generic_name;
    }

    public Product(                                 //complete constructor
                                                    String _generic_name,
                                                    String _barcode,
                                                    String _product_quantity,
                                                    String _packaging,
                                                    String _brands,
                                                    String _labels,

                                                    String _ingredients_text,
                                                    Nutriments _nutriments,
                                                    NutrientLevels _nutrient_levels,
                                                    String _trace,
                                                    String _allergens,
                                                    String _categories,
                                                    String _image_url){
        this.generic_name=_generic_name;
        this.barcode=_barcode;
        this.product_quantity=_product_quantity;
        this.packaging=_packaging;
        this.brands=_brands;
        this.labels=_labels;
        this.ingredients_text=_ingredients_text;
        this.nutriments=_nutriments;
        this.nutrient_levels=_nutrient_levels;
        this.trace=_trace;
        this.allergens=_allergens;
        this.categories=_categories;
        this.image_url=_image_url;
    }

    @Override
    public String toString() {                          //toString method
        return generic_name;
    }

    public String getGeneric_name() {
        return generic_name;
    }

    public void setGeneric_name(String generic_name) {
        this.generic_name = generic_name;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public String getProduct_quantity() {
        return product_quantity;
    }

    public void setProduct_quantity(String product_quantity) {
        this.product_quantity = product_quantity;
    }

    public String getPackaging() {
        return packaging;
    }

    public void setPackaging(String packaging) {
        this.packaging = packaging;
    }

    public String getBrands() {
        return brands;
    }

    public void setBrands(String brands) {
        this.brands = brands;
    }

    public String getLabels() {
        return labels;
    }

    public void setLabels(String labels) {
        this.labels = labels;
    }

    public String getIngredients_text() {
        return ingredients_text;
    }

    public void setIngredients_text(String ingredients_text) {
        this.ingredients_text = ingredients_text;
    }

    public Nutriments getNutriments() {
        return nutriments;
    }

    public void setNutriments(Nutriments nutriments) {
        this.nutriments = nutriments;
    }

    public NutrientLevels getNutrient_levels() {
        return nutrient_levels;
    }

    public void setNutrient_levels(NutrientLevels nutrient_levels) {
        this.nutrient_levels = nutrient_levels;
    }

    public String getTrace() {
        return trace;
    }

    public void setTrace(String trace) {
        this.trace = trace;
    }

    public String getAllergens() {
        return allergens;
    }

    public void setAllergens(String allergens) {
        this.allergens = allergens;
    }

    public String getCategories() {
        return categories;
    }

    public void setCategories(String categories) {
        this.categories = categories;
    }

    public String getImage_url() {
        return image_url;
    }

    public void setImage_url(String image_url) {
        this.image_url = image_url;
    }

    public static class Nutriments{
        public Double carbohydrates;
        public Double carbohydrates_100g;
        public Double carbohydrates_serving;
        public String carbohydrates_unit;
        public Double carbohydrates_value;
        @JsonProperty("carbon-footprint-from-known-ingredients_product")
        public Integer carbonFootprintFromKnownIngredientsProduct;
        @JsonProperty("carbon-footprint-from-known-ingredients_serving")
        public Double carbonFootprintFromKnownIngredientsServing;
        public Integer energy;
        @JsonProperty("energy-kcal")
        public Integer energyKcal;
        @JsonProperty("energy-kcal_100g")
        public Integer energyKcal100g;
        @JsonProperty("energy-kcal_serving")
        public Double energyKcalServing;
        @JsonProperty("energy-kcal_unit")
        public String energyKcalUnit;
        @JsonProperty("energy-kcal_value")
        public Integer energyKcalValue;
        @JsonProperty("energy-kj")
        public Integer energyKj;
        @JsonProperty("energy-kj_100g")
        public Integer energyKj100g;
        @JsonProperty("energy-kj_serving")
        public Integer energyKjServing;
        @JsonProperty("energy-kj_unit")
        public String energyKjUnit;
        @JsonProperty("energy-kj_value")
        public Integer energyKjValue;
        public Integer energy_100g;
        public Integer energy_serving;
        public String energy_unit;
        public Integer energy_value;
        public Double fat;
        public Double fat_100g;
        public Double fat_serving;
        public String fat_unit;
        public Double fat_value;
        @JsonProperty("fruits-vegetables-nuts-estimate-from-ingredients_100g")
        public Integer fruitsVegetablesNutsEstimateFromIngredients100g;
        @JsonProperty("fruits-vegetables-nuts-estimate-from-ingredients_serving")
        public Integer fruitsVegetablesNutsEstimateFromIngredientsServing;
        @JsonProperty("nova-group")
        public Integer novaGroup;
        @JsonProperty("nova-group_100g")
        public Integer novaGroup100g;
        @JsonProperty("nova-group_serving")
        public Integer novaGroupServing;
        @JsonProperty("nutrition-score-fr")
        public Integer nutritionScoreFr;
        @JsonProperty("nutrition-score-fr_100g")
        public Integer nutritionScoreFr100g;
        public Double proteins;
        public Double proteins_100g;
        public Double proteins_serving;
        public String proteins_unit;
        public Double proteins_value;
        public Double salt;
        public Double salt_100g;
        public Double salt_serving;
        public String salt_unit;
        public Double salt_value;
        @JsonProperty("saturated-fat")
        public Double saturatedFat;
        @JsonProperty("saturated-fat_100g")
        public Double saturatedFat100g;
        @JsonProperty("saturated-fat_serving")
        public Double saturatedFatServing;
        @JsonProperty("saturated-fat_unit")
        public String saturatedFatUnit;
        @JsonProperty("saturated-fat_value")
        public Double saturatedFatValue;
        public Double sodium;
        public Double sodium_100g;
        public Double sodium_serving;
        public String sodium_unit;
        public Double sodium_value;
        public Double sugars;
        public Double sugars_100g;
        public Double sugars_serving;
        public String sugars_unit;
        public Double sugars_value;

        public Nutriments(Double carbohydrates, Double carbohydrates_100g, Double carbohydrates_serving, String carbohydrates_unit, Double carbohydrates_value, Integer carbonFootprintFromKnownIngredientsProduct, Double carbonFootprintFromKnownIngredientsServing, Integer energy, Integer energyKcal, Integer energyKcal100g, Double energyKcalServing, String energyKcalUnit, Integer energyKcalValue, Integer energyKj, Integer energyKj100g, Integer energyKjServing, String energyKjUnit, Integer energyKjValue, Integer energy_100g, Integer energy_serving, String energy_unit, Integer energy_value, Double fat, Double fat_100g, Double fat_serving, String fat_unit, Double fat_value, Integer fruitsVegetablesNutsEstimateFromIngredients100g, Integer fruitsVegetablesNutsEstimateFromIngredientsServing, Integer novaGroup, Integer novaGroup100g, Integer novaGroupServing, Integer nutritionScoreFr, Integer nutritionScoreFr100g, Double proteins, Double proteins_100g, Double proteins_serving, String proteins_unit, Double proteins_value, Double salt, Double salt_100g, Double salt_serving, String salt_unit, Double salt_value, Double saturatedFat, Double saturatedFat100g, Double saturatedFatServing, String saturatedFatUnit, Double saturatedFatValue, Double sodium, Double sodium_100g, Double sodium_serving, String sodium_unit, Double sodium_value, Double sugars, Double sugars_100g, Double sugars_serving, String sugars_unit, Double sugars_value) {
            this.carbohydrates = carbohydrates;
            this.carbohydrates_100g = carbohydrates_100g;
            this.carbohydrates_serving = carbohydrates_serving;
            this.carbohydrates_unit = carbohydrates_unit;
            this.carbohydrates_value = carbohydrates_value;
            this.carbonFootprintFromKnownIngredientsProduct = carbonFootprintFromKnownIngredientsProduct;
            this.carbonFootprintFromKnownIngredientsServing = carbonFootprintFromKnownIngredientsServing;
            this.energy = energy;
            this.energyKcal = energyKcal;
            this.energyKcal100g = energyKcal100g;
            this.energyKcalServing = energyKcalServing;
            this.energyKcalUnit = energyKcalUnit;
            this.energyKcalValue = energyKcalValue;
            this.energyKj = energyKj;
            this.energyKj100g = energyKj100g;
            this.energyKjServing = energyKjServing;
            this.energyKjUnit = energyKjUnit;
            this.energyKjValue = energyKjValue;
            this.energy_100g = energy_100g;
            this.energy_serving = energy_serving;
            this.energy_unit = energy_unit;
            this.energy_value = energy_value;
            this.fat = fat;
            this.fat_100g = fat_100g;
            this.fat_serving = fat_serving;
            this.fat_unit = fat_unit;
            this.fat_value = fat_value;
            this.fruitsVegetablesNutsEstimateFromIngredients100g = fruitsVegetablesNutsEstimateFromIngredients100g;
            this.fruitsVegetablesNutsEstimateFromIngredientsServing = fruitsVegetablesNutsEstimateFromIngredientsServing;
            this.novaGroup = novaGroup;
            this.novaGroup100g = novaGroup100g;
            this.novaGroupServing = novaGroupServing;
            this.nutritionScoreFr = nutritionScoreFr;
            this.nutritionScoreFr100g = nutritionScoreFr100g;
            this.proteins = proteins;
            this.proteins_100g = proteins_100g;
            this.proteins_serving = proteins_serving;
            this.proteins_unit = proteins_unit;
            this.proteins_value = proteins_value;
            this.salt = salt;
            this.salt_100g = salt_100g;
            this.salt_serving = salt_serving;
            this.salt_unit = salt_unit;
            this.salt_value = salt_value;
            this.saturatedFat = saturatedFat;
            this.saturatedFat100g = saturatedFat100g;
            this.saturatedFatServing = saturatedFatServing;
            this.saturatedFatUnit = saturatedFatUnit;
            this.saturatedFatValue = saturatedFatValue;
            this.sodium = sodium;
            this.sodium_100g = sodium_100g;
            this.sodium_serving = sodium_serving;
            this.sodium_unit = sodium_unit;
            this.sodium_value = sodium_value;
            this.sugars = sugars;
            this.sugars_100g = sugars_100g;
            this.sugars_serving = sugars_serving;
            this.sugars_unit = sugars_unit;
            this.sugars_value = sugars_value;
        }

        public Double getCarbohydrates() {
            return carbohydrates;
        }

        public void setCarbohydrates(Double carbohydrates) {
            this.carbohydrates = carbohydrates;
        }

        public Double getCarbohydrates_100g() {
            return carbohydrates_100g;
        }

        public void setCarbohydrates_100g(Double carbohydrates_100g) {
            this.carbohydrates_100g = carbohydrates_100g;
        }

        public Double getCarbohydrates_serving() {
            return carbohydrates_serving;
        }

        public void setCarbohydrates_serving(Double carbohydrates_serving) {
            this.carbohydrates_serving = carbohydrates_serving;
        }

        public String getCarbohydrates_unit() {
            return carbohydrates_unit;
        }

        public void setCarbohydrates_unit(String carbohydrates_unit) {
            this.carbohydrates_unit = carbohydrates_unit;
        }

        public Double getCarbohydrates_value() {
            return carbohydrates_value;
        }

        public void setCarbohydrates_value(Double carbohydrates_value) {
            this.carbohydrates_value = carbohydrates_value;
        }

        public Integer getCarbonFootprintFromKnownIngredientsProduct() {
            return carbonFootprintFromKnownIngredientsProduct;
        }

        public void setCarbonFootprintFromKnownIngredientsProduct(Integer carbonFootprintFromKnownIngredientsProduct) {
            this.carbonFootprintFromKnownIngredientsProduct = carbonFootprintFromKnownIngredientsProduct;
        }

        public Double getCarbonFootprintFromKnownIngredientsServing() {
            return carbonFootprintFromKnownIngredientsServing;
        }

        public void setCarbonFootprintFromKnownIngredientsServing(Double carbonFootprintFromKnownIngredientsServing) {
            this.carbonFootprintFromKnownIngredientsServing = carbonFootprintFromKnownIngredientsServing;
        }

        public Integer getEnergy() {
            return energy;
        }

        public void setEnergy(Integer energy) {
            this.energy = energy;
        }

        public Integer getEnergyKcal() {
            return energyKcal;
        }

        public void setEnergyKcal(Integer energyKcal) {
            this.energyKcal = energyKcal;
        }

        public Integer getEnergyKcal100g() {
            return energyKcal100g;
        }

        public void setEnergyKcal100g(Integer energyKcal100g) {
            this.energyKcal100g = energyKcal100g;
        }

        public Double getEnergyKcalServing() {
            return energyKcalServing;
        }

        public void setEnergyKcalServing(Double energyKcalServing) {
            this.energyKcalServing = energyKcalServing;
        }

        public String getEnergyKcalUnit() {
            return energyKcalUnit;
        }

        public void setEnergyKcalUnit(String energyKcalUnit) {
            this.energyKcalUnit = energyKcalUnit;
        }

        public Integer getEnergyKcalValue() {
            return energyKcalValue;
        }

        public void setEnergyKcalValue(Integer energyKcalValue) {
            this.energyKcalValue = energyKcalValue;
        }

        public Integer getEnergyKj() {
            return energyKj;
        }

        public void setEnergyKj(Integer energyKj) {
            this.energyKj = energyKj;
        }

        public Integer getEnergyKj100g() {
            return energyKj100g;
        }

        public void setEnergyKj100g(Integer energyKj100g) {
            this.energyKj100g = energyKj100g;
        }

        public Integer getEnergyKjServing() {
            return energyKjServing;
        }

        public void setEnergyKjServing(Integer energyKjServing) {
            this.energyKjServing = energyKjServing;
        }

        public String getEnergyKjUnit() {
            return energyKjUnit;
        }

        public void setEnergyKjUnit(String energyKjUnit) {
            this.energyKjUnit = energyKjUnit;
        }

        public Integer getEnergyKjValue() {
            return energyKjValue;
        }

        public void setEnergyKjValue(Integer energyKjValue) {
            this.energyKjValue = energyKjValue;
        }

        public Integer getEnergy_100g() {
            return energy_100g;
        }

        public void setEnergy_100g(Integer energy_100g) {
            this.energy_100g = energy_100g;
        }

        public Integer getEnergy_serving() {
            return energy_serving;
        }

        public void setEnergy_serving(Integer energy_serving) {
            this.energy_serving = energy_serving;
        }

        public String getEnergy_unit() {
            return energy_unit;
        }

        public void setEnergy_unit(String energy_unit) {
            this.energy_unit = energy_unit;
        }

        public Integer getEnergy_value() {
            return energy_value;
        }

        public void setEnergy_value(Integer energy_value) {
            this.energy_value = energy_value;
        }

        public Double getFat() {
            return fat;
        }

        public void setFat(Double fat) {
            this.fat = fat;
        }

        public Double getFat_100g() {
            return fat_100g;
        }

        public void setFat_100g(Double fat_100g) {
            this.fat_100g = fat_100g;
        }

        public Double getFat_serving() {
            return fat_serving;
        }

        public void setFat_serving(Double fat_serving) {
            this.fat_serving = fat_serving;
        }

        public String getFat_unit() {
            return fat_unit;
        }

        public void setFat_unit(String fat_unit) {
            this.fat_unit = fat_unit;
        }

        public Double getFat_value() {
            return fat_value;
        }

        public void setFat_value(Double fat_value) {
            this.fat_value = fat_value;
        }

        public Integer getFruitsVegetablesNutsEstimateFromIngredients100g() {
            return fruitsVegetablesNutsEstimateFromIngredients100g;
        }

        public void setFruitsVegetablesNutsEstimateFromIngredients100g(Integer fruitsVegetablesNutsEstimateFromIngredients100g) {
            this.fruitsVegetablesNutsEstimateFromIngredients100g = fruitsVegetablesNutsEstimateFromIngredients100g;
        }

        public Integer getFruitsVegetablesNutsEstimateFromIngredientsServing() {
            return fruitsVegetablesNutsEstimateFromIngredientsServing;
        }

        public void setFruitsVegetablesNutsEstimateFromIngredientsServing(Integer fruitsVegetablesNutsEstimateFromIngredientsServing) {
            this.fruitsVegetablesNutsEstimateFromIngredientsServing = fruitsVegetablesNutsEstimateFromIngredientsServing;
        }

        public Integer getNovaGroup() {
            return novaGroup;
        }

        public void setNovaGroup(Integer novaGroup) {
            this.novaGroup = novaGroup;
        }

        public Integer getNovaGroup100g() {
            return novaGroup100g;
        }

        public void setNovaGroup100g(Integer novaGroup100g) {
            this.novaGroup100g = novaGroup100g;
        }

        public Integer getNovaGroupServing() {
            return novaGroupServing;
        }

        public void setNovaGroupServing(Integer novaGroupServing) {
            this.novaGroupServing = novaGroupServing;
        }

        public Integer getNutritionScoreFr() {
            return nutritionScoreFr;
        }

        public void setNutritionScoreFr(Integer nutritionScoreFr) {
            this.nutritionScoreFr = nutritionScoreFr;
        }

        public Integer getNutritionScoreFr100g() {
            return nutritionScoreFr100g;
        }

        public void setNutritionScoreFr100g(Integer nutritionScoreFr100g) {
            this.nutritionScoreFr100g = nutritionScoreFr100g;
        }

        public Double getProteins() {
            return proteins;
        }

        public void setProteins(Double proteins) {
            this.proteins = proteins;
        }

        public Double getProteins_100g() {
            return proteins_100g;
        }

        public void setProteins_100g(Double proteins_100g) {
            this.proteins_100g = proteins_100g;
        }

        public Double getProteins_serving() {
            return proteins_serving;
        }

        public void setProteins_serving(Double proteins_serving) {
            this.proteins_serving = proteins_serving;
        }

        public String getProteins_unit() {
            return proteins_unit;
        }

        public void setProteins_unit(String proteins_unit) {
            this.proteins_unit = proteins_unit;
        }

        public Double getProteins_value() {
            return proteins_value;
        }

        public void setProteins_value(Double proteins_value) {
            this.proteins_value = proteins_value;
        }

        public Double getSalt() {
            return salt;
        }

        public void setSalt(Double salt) {
            this.salt = salt;
        }

        public Double getSalt_100g() {
            return salt_100g;
        }

        public void setSalt_100g(Double salt_100g) {
            this.salt_100g = salt_100g;
        }

        public Double getSalt_serving() {
            return salt_serving;
        }

        public void setSalt_serving(Double salt_serving) {
            this.salt_serving = salt_serving;
        }

        public String getSalt_unit() {
            return salt_unit;
        }

        public void setSalt_unit(String salt_unit) {
            this.salt_unit = salt_unit;
        }

        public Double getSalt_value() {
            return salt_value;
        }

        public void setSalt_value(Double salt_value) {
            this.salt_value = salt_value;
        }

        public Double getSaturatedFat() {
            return saturatedFat;
        }

        public void setSaturatedFat(Double saturatedFat) {
            this.saturatedFat = saturatedFat;
        }

        public Double getSaturatedFat100g() {
            return saturatedFat100g;
        }

        public void setSaturatedFat100g(Double saturatedFat100g) {
            this.saturatedFat100g = saturatedFat100g;
        }

        public Double getSaturatedFatServing() {
            return saturatedFatServing;
        }

        public void setSaturatedFatServing(Double saturatedFatServing) {
            this.saturatedFatServing = saturatedFatServing;
        }

        public String getSaturatedFatUnit() {
            return saturatedFatUnit;
        }

        public void setSaturatedFatUnit(String saturatedFatUnit) {
            this.saturatedFatUnit = saturatedFatUnit;
        }

        public Double getSaturatedFatValue() {
            return saturatedFatValue;
        }

        public void setSaturatedFatValue(Double saturatedFatValue) {
            this.saturatedFatValue = saturatedFatValue;
        }

        public Double getSodium() {
            return sodium;
        }

        public void setSodium(Double sodium) {
            this.sodium = sodium;
        }

        public Double getSodium_100g() {
            return sodium_100g;
        }

        public void setSodium_100g(Double sodium_100g) {
            this.sodium_100g = sodium_100g;
        }

        public Double getSodium_serving() {
            return sodium_serving;
        }

        public void setSodium_serving(Double sodium_serving) {
            this.sodium_serving = sodium_serving;
        }

        public String getSodium_unit() {
            return sodium_unit;
        }

        public void setSodium_unit(String sodium_unit) {
            this.sodium_unit = sodium_unit;
        }

        public Double getSodium_value() {
            return sodium_value;
        }

        public void setSodium_value(Double sodium_value) {
            this.sodium_value = sodium_value;
        }

        public Double getSugars() {
            return sugars;
        }

        public void setSugars(Double sugars) {
            this.sugars = sugars;
        }

        public Double getSugars_100g() {
            return sugars_100g;
        }

        public void setSugars_100g(Double sugars_100g) {
            this.sugars_100g = sugars_100g;
        }

        public Double getSugars_serving() {
            return sugars_serving;
        }

        public void setSugars_serving(Double sugars_serving) {
            this.sugars_serving = sugars_serving;
        }

        public String getSugars_unit() {
            return sugars_unit;
        }

        public void setSugars_unit(String sugars_unit) {
            this.sugars_unit = sugars_unit;
        }

        public Double getSugars_value() {
            return sugars_value;
        }

        public void setSugars_value(Double sugars_value) {
            this.sugars_value = sugars_value;
        }
    }

    public class NutrientLevels{
        public String fat;
        public String salt;
        @JsonProperty("saturated-fat")
        public String saturatedFat;
        public String sugars;

        public NutrientLevels(String fat, String salt, String saturatedFat, String sugars) {
            this.fat = fat;
            this.salt = salt;
            this.saturatedFat = saturatedFat;
            this.sugars = sugars;
        }

        public String getFat() {
            return fat;
        }

        public void setFat(String fat) {
            this.fat = fat;
        }

        public String getSalt() {
            return salt;
        }

        public void setSalt(String salt) {
            this.salt = salt;
        }

        public String getSaturatedFat() {
            return saturatedFat;
        }

        public void setSaturatedFat(String saturatedFat) {
            this.saturatedFat = saturatedFat;
        }

        public String getSugars() {
            return sugars;
        }

        public void setSugars(String sugars) {
            this.sugars = sugars;
        }
    }
}



