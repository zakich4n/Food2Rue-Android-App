package com.example.myfirstapp;

import android.webkit.JavascriptInterface;

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
        public double carbohydrates;
        public double carbohydrates_100g;
        public double carbohydrates_serving;
        public String carbohydrates_unit;
        public double carbohydrates_value;
        @JsonProperty("carbon-footprint-from-known-ingredients_product")
        public int carbonFootprintFromKnownIngredientsProduct;
        @JsonProperty("carbon-footprint-from-known-ingredients_serving")
        public double carbonFootprintFromKnownIngredientsServing;
        public int energy;
        @JsonProperty("energy-kcal")
        public int energyKcal;
        @JsonProperty("energy-kcal_100g")
        public int energyKcal100g;
        @JsonProperty("energy-kcal_serving")
        public double energyKcalServing;
        @JsonProperty("energy-kcal_unit")
        public String energyKcalUnit;
        @JsonProperty("energy-kcal_value")
        public int energyKcalValue;
        @JsonProperty("energy-kj")
        public int energyKj;
        @JsonProperty("energy-kj_100g")
        public int energyKj100g;
        @JsonProperty("energy-kj_serving")
        public int energyKjServing;
        @JsonProperty("energy-kj_unit")
        public String energyKjUnit;
        @JsonProperty("energy-kj_value")
        public int energyKjValue;
        public int energy_100g;
        public int energy_serving;
        public String energy_unit;
        public int energy_value;
        public double fat;
        public double fat_100g;
        public double fat_serving;
        public String fat_unit;
        public double fat_value;
        @JsonProperty("fruits-vegetables-nuts-estimate-from-ingredients_100g")
        public int fruitsVegetablesNutsEstimateFromIngredients100g;
        @JsonProperty("fruits-vegetables-nuts-estimate-from-ingredients_serving")
        public int fruitsVegetablesNutsEstimateFromIngredientsServing;
        @JsonProperty("nova-group")
        public int novaGroup;
        @JsonProperty("nova-group_100g")
        public int novaGroup100g;
        @JsonProperty("nova-group_serving")
        public int novaGroupServing;
        @JsonProperty("nutrition-score-fr")
        public int nutritionScoreFr;
        @JsonProperty("nutrition-score-fr_100g")
        public int nutritionScoreFr100g;
        public double proteins;
        public double proteins_100g;
        public double proteins_serving;
        public String proteins_unit;
        public double proteins_value;
        public double salt;
        public double salt_100g;
        public double salt_serving;
        public String salt_unit;
        public double salt_value;
        @JsonProperty("saturated-fat")
        public double saturatedFat;
        @JsonProperty("saturated-fat_100g")
        public double saturatedFat100g;
        @JsonProperty("saturated-fat_serving")
        public double saturatedFatServing;
        @JsonProperty("saturated-fat_unit")
        public String saturatedFatUnit;
        @JsonProperty("saturated-fat_value")
        public double saturatedFatValue;
        public double sodium;
        public double sodium_100g;
        public double sodium_serving;
        public String sodium_unit;
        public double sodium_value;
        public double sugars;
        public double sugars_100g;
        public double sugars_serving;
        public String sugars_unit;
        public double sugars_value;

        public Nutriments(double carbohydrates, double carbohydrates_100g, double carbohydrates_serving, String carbohydrates_unit, double carbohydrates_value, int carbonFootprintFromKnownIngredientsProduct, double carbonFootprintFromKnownIngredientsServing, int energy, int energyKcal, int energyKcal100g, double energyKcalServing, String energyKcalUnit, int energyKcalValue, int energyKj, int energyKj100g, int energyKjServing, String energyKjUnit, int energyKjValue, int energy_100g, int energy_serving, String energy_unit, int energy_value, double fat, double fat_100g, double fat_serving, String fat_unit, double fat_value, int fruitsVegetablesNutsEstimateFromIngredients100g, int fruitsVegetablesNutsEstimateFromIngredientsServing, int novaGroup, int novaGroup100g, int novaGroupServing, int nutritionScoreFr, int nutritionScoreFr100g, double proteins, double proteins_100g, double proteins_serving, String proteins_unit, double proteins_value, double salt, double salt_100g, double salt_serving, String salt_unit, double salt_value, double saturatedFat, double saturatedFat100g, double saturatedFatServing, String saturatedFatUnit, double saturatedFatValue, double sodium, double sodium_100g, double sodium_serving, String sodium_unit, double sodium_value, double sugars, double sugars_100g, double sugars_serving, String sugars_unit, double sugars_value) {
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

        public double getCarbohydrates() {
            return carbohydrates;
        }

        public void setCarbohydrates(double carbohydrates) {
            this.carbohydrates = carbohydrates;
        }

        public double getCarbohydrates_100g() {
            return carbohydrates_100g;
        }

        public void setCarbohydrates_100g(double carbohydrates_100g) {
            this.carbohydrates_100g = carbohydrates_100g;
        }

        public double getCarbohydrates_serving() {
            return carbohydrates_serving;
        }

        public void setCarbohydrates_serving(double carbohydrates_serving) {
            this.carbohydrates_serving = carbohydrates_serving;
        }

        public String getCarbohydrates_unit() {
            return carbohydrates_unit;
        }

        public void setCarbohydrates_unit(String carbohydrates_unit) {
            this.carbohydrates_unit = carbohydrates_unit;
        }

        public double getCarbohydrates_value() {
            return carbohydrates_value;
        }

        public void setCarbohydrates_value(double carbohydrates_value) {
            this.carbohydrates_value = carbohydrates_value;
        }

        public int getCarbonFootprintFromKnownIngredientsProduct() {
            return carbonFootprintFromKnownIngredientsProduct;
        }

        public void setCarbonFootprintFromKnownIngredientsProduct(int carbonFootprintFromKnownIngredientsProduct) {
            this.carbonFootprintFromKnownIngredientsProduct = carbonFootprintFromKnownIngredientsProduct;
        }

        public double getCarbonFootprintFromKnownIngredientsServing() {
            return carbonFootprintFromKnownIngredientsServing;
        }

        public void setCarbonFootprintFromKnownIngredientsServing(double carbonFootprintFromKnownIngredientsServing) {
            this.carbonFootprintFromKnownIngredientsServing = carbonFootprintFromKnownIngredientsServing;
        }

        public int getEnergy() {
            return energy;
        }

        public void setEnergy(int energy) {
            this.energy = energy;
        }

        public int getEnergyKcal() {
            return energyKcal;
        }

        public void setEnergyKcal(int energyKcal) {
            this.energyKcal = energyKcal;
        }

        public int getEnergyKcal100g() {
            return energyKcal100g;
        }

        public void setEnergyKcal100g(int energyKcal100g) {
            this.energyKcal100g = energyKcal100g;
        }

        public double getEnergyKcalServing() {
            return energyKcalServing;
        }

        public void setEnergyKcalServing(double energyKcalServing) {
            this.energyKcalServing = energyKcalServing;
        }

        public String getEnergyKcalUnit() {
            return energyKcalUnit;
        }

        public void setEnergyKcalUnit(String energyKcalUnit) {
            this.energyKcalUnit = energyKcalUnit;
        }

        public int getEnergyKcalValue() {
            return energyKcalValue;
        }

        public void setEnergyKcalValue(int energyKcalValue) {
            this.energyKcalValue = energyKcalValue;
        }

        public int getEnergyKj() {
            return energyKj;
        }

        public void setEnergyKj(int energyKj) {
            this.energyKj = energyKj;
        }

        public int getEnergyKj100g() {
            return energyKj100g;
        }

        public void setEnergyKj100g(int energyKj100g) {
            this.energyKj100g = energyKj100g;
        }

        public int getEnergyKjServing() {
            return energyKjServing;
        }

        public void setEnergyKjServing(int energyKjServing) {
            this.energyKjServing = energyKjServing;
        }

        public String getEnergyKjUnit() {
            return energyKjUnit;
        }

        public void setEnergyKjUnit(String energyKjUnit) {
            this.energyKjUnit = energyKjUnit;
        }

        public int getEnergyKjValue() {
            return energyKjValue;
        }

        public void setEnergyKjValue(int energyKjValue) {
            this.energyKjValue = energyKjValue;
        }

        public int getEnergy_100g() {
            return energy_100g;
        }

        public void setEnergy_100g(int energy_100g) {
            this.energy_100g = energy_100g;
        }

        public int getEnergy_serving() {
            return energy_serving;
        }

        public void setEnergy_serving(int energy_serving) {
            this.energy_serving = energy_serving;
        }

        public String getEnergy_unit() {
            return energy_unit;
        }

        public void setEnergy_unit(String energy_unit) {
            this.energy_unit = energy_unit;
        }

        public int getEnergy_value() {
            return energy_value;
        }

        public void setEnergy_value(int energy_value) {
            this.energy_value = energy_value;
        }

        public double getFat() {
            return fat;
        }

        public void setFat(double fat) {
            this.fat = fat;
        }

        public double getFat_100g() {
            return fat_100g;
        }

        public void setFat_100g(double fat_100g) {
            this.fat_100g = fat_100g;
        }

        public double getFat_serving() {
            return fat_serving;
        }

        public void setFat_serving(double fat_serving) {
            this.fat_serving = fat_serving;
        }

        public String getFat_unit() {
            return fat_unit;
        }

        public void setFat_unit(String fat_unit) {
            this.fat_unit = fat_unit;
        }

        public double getFat_value() {
            return fat_value;
        }

        public void setFat_value(double fat_value) {
            this.fat_value = fat_value;
        }

        public int getFruitsVegetablesNutsEstimateFromIngredients100g() {
            return fruitsVegetablesNutsEstimateFromIngredients100g;
        }

        public void setFruitsVegetablesNutsEstimateFromIngredients100g(int fruitsVegetablesNutsEstimateFromIngredients100g) {
            this.fruitsVegetablesNutsEstimateFromIngredients100g = fruitsVegetablesNutsEstimateFromIngredients100g;
        }

        public int getFruitsVegetablesNutsEstimateFromIngredientsServing() {
            return fruitsVegetablesNutsEstimateFromIngredientsServing;
        }

        public void setFruitsVegetablesNutsEstimateFromIngredientsServing(int fruitsVegetablesNutsEstimateFromIngredientsServing) {
            this.fruitsVegetablesNutsEstimateFromIngredientsServing = fruitsVegetablesNutsEstimateFromIngredientsServing;
        }

        public int getNovaGroup() {
            return novaGroup;
        }

        public void setNovaGroup(int novaGroup) {
            this.novaGroup = novaGroup;
        }

        public int getNovaGroup100g() {
            return novaGroup100g;
        }

        public void setNovaGroup100g(int novaGroup100g) {
            this.novaGroup100g = novaGroup100g;
        }

        public int getNovaGroupServing() {
            return novaGroupServing;
        }

        public void setNovaGroupServing(int novaGroupServing) {
            this.novaGroupServing = novaGroupServing;
        }

        public int getNutritionScoreFr() {
            return nutritionScoreFr;
        }

        public void setNutritionScoreFr(int nutritionScoreFr) {
            this.nutritionScoreFr = nutritionScoreFr;
        }

        public int getNutritionScoreFr100g() {
            return nutritionScoreFr100g;
        }

        public void setNutritionScoreFr100g(int nutritionScoreFr100g) {
            this.nutritionScoreFr100g = nutritionScoreFr100g;
        }

        public double getProteins() {
            return proteins;
        }

        public void setProteins(double proteins) {
            this.proteins = proteins;
        }

        public double getProteins_100g() {
            return proteins_100g;
        }

        public void setProteins_100g(double proteins_100g) {
            this.proteins_100g = proteins_100g;
        }

        public double getProteins_serving() {
            return proteins_serving;
        }

        public void setProteins_serving(double proteins_serving) {
            this.proteins_serving = proteins_serving;
        }

        public String getProteins_unit() {
            return proteins_unit;
        }

        public void setProteins_unit(String proteins_unit) {
            this.proteins_unit = proteins_unit;
        }

        public double getProteins_value() {
            return proteins_value;
        }

        public void setProteins_value(double proteins_value) {
            this.proteins_value = proteins_value;
        }

        public double getSalt() {
            return salt;
        }

        public void setSalt(double salt) {
            this.salt = salt;
        }

        public double getSalt_100g() {
            return salt_100g;
        }

        public void setSalt_100g(double salt_100g) {
            this.salt_100g = salt_100g;
        }

        public double getSalt_serving() {
            return salt_serving;
        }

        public void setSalt_serving(double salt_serving) {
            this.salt_serving = salt_serving;
        }

        public String getSalt_unit() {
            return salt_unit;
        }

        public void setSalt_unit(String salt_unit) {
            this.salt_unit = salt_unit;
        }

        public double getSalt_value() {
            return salt_value;
        }

        public void setSalt_value(double salt_value) {
            this.salt_value = salt_value;
        }

        public double getSaturatedFat() {
            return saturatedFat;
        }

        public void setSaturatedFat(double saturatedFat) {
            this.saturatedFat = saturatedFat;
        }

        public double getSaturatedFat100g() {
            return saturatedFat100g;
        }

        public void setSaturatedFat100g(double saturatedFat100g) {
            this.saturatedFat100g = saturatedFat100g;
        }

        public double getSaturatedFatServing() {
            return saturatedFatServing;
        }

        public void setSaturatedFatServing(double saturatedFatServing) {
            this.saturatedFatServing = saturatedFatServing;
        }

        public String getSaturatedFatUnit() {
            return saturatedFatUnit;
        }

        public void setSaturatedFatUnit(String saturatedFatUnit) {
            this.saturatedFatUnit = saturatedFatUnit;
        }

        public double getSaturatedFatValue() {
            return saturatedFatValue;
        }

        public void setSaturatedFatValue(double saturatedFatValue) {
            this.saturatedFatValue = saturatedFatValue;
        }

        public double getSodium() {
            return sodium;
        }

        public void setSodium(double sodium) {
            this.sodium = sodium;
        }

        public double getSodium_100g() {
            return sodium_100g;
        }

        public void setSodium_100g(double sodium_100g) {
            this.sodium_100g = sodium_100g;
        }

        public double getSodium_serving() {
            return sodium_serving;
        }

        public void setSodium_serving(double sodium_serving) {
            this.sodium_serving = sodium_serving;
        }

        public String getSodium_unit() {
            return sodium_unit;
        }

        public void setSodium_unit(String sodium_unit) {
            this.sodium_unit = sodium_unit;
        }

        public double getSodium_value() {
            return sodium_value;
        }

        public void setSodium_value(double sodium_value) {
            this.sodium_value = sodium_value;
        }

        public double getSugars() {
            return sugars;
        }

        public void setSugars(double sugars) {
            this.sugars = sugars;
        }

        public double getSugars_100g() {
            return sugars_100g;
        }

        public void setSugars_100g(double sugars_100g) {
            this.sugars_100g = sugars_100g;
        }

        public double getSugars_serving() {
            return sugars_serving;
        }

        public void setSugars_serving(double sugars_serving) {
            this.sugars_serving = sugars_serving;
        }

        public String getSugars_unit() {
            return sugars_unit;
        }

        public void setSugars_unit(String sugars_unit) {
            this.sugars_unit = sugars_unit;
        }

        public double getSugars_value() {
            return sugars_value;
        }

        public void setSugars_value(double sugars_value) {
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