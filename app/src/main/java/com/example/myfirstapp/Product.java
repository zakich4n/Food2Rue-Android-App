package com.example.myfirstapp;

import java.util.ArrayList;

public class Product {
    protected String generic_name;                  //the short generic name of the product
    protected ArrayList<String> product_name;       //an array with the names of the product in different languages
    protected String barcode;                       //the id|barcode of the product
    protected String product_quantity;              //quantity of one sold unit
    protected ArrayList<String> packagings;         //an array list of the packaging materials
    protected String brands;                        //string value of the products brand
    protected String labels;                        //string value of important labels describing the product

    protected String ingredients_text ;             //string values of the listed ingredients
    protected ArrayList<String> nutriments;         //An array of all the nutriments (energy value per kcal, kJ ect.)
    protected ArrayList<String> nutrients_levels;   //An array of the of nutrients levels for 100
    //contains "fat", "salt", "saturated-fat", "sugars"
    protected String trace;                         //the string list of all traces in the product
    protected ArrayList<String> allergens;          //array list of allergens in the product
    protected String categories;                    //string containing the product's categories
    protected ArrayList<String> selected_images;    //array with different pictures of the product from different countries (front, back, ingredients etc.)

    public Product(                                 //simple constructor
                                                    String _generic_name
    ){
        this.generic_name=_generic_name;
    }

    public Product(                                 //complete constructor
                                                    String _generic_name,
                                                    ArrayList<String> _product_name,
                                                    String _barcode,
                                                    String _product_quantity,
                                                    ArrayList<String> _packagings,
                                                    String _brands,
                                                    String _labels,

                                                    String _ingredients_text,
                                                    ArrayList<String> _nutriments,
                                                    ArrayList<String> _nutrients_levels,
                                                    String _trace,
                                                    ArrayList<String> _allergens,
                                                    String _categories,
                                                    ArrayList<String> _selected_images){
        this.generic_name=_generic_name;
        this.product_name=_product_name;
        this.barcode=_barcode;
        this.product_quantity=_product_quantity;
        this.packagings=_packagings;
        this.brands=_brands;
        this.labels=_labels;
        this.ingredients_text=_ingredients_text;
        this.nutriments=_nutriments;
        this.nutrients_levels=_nutrients_levels;
        this.trace=_trace;
        this.allergens=_allergens;
        this.categories=_categories;
        this.selected_images=_selected_images;
    }

    @Override
    public String toString() {                          //toString method
        return generic_name;
    }
}

