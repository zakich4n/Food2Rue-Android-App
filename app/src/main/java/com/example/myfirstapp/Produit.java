package com.example.myfirstapp;

import java.util.ArrayList;

public class Produit {
    protected String generic_name; //the short generic name of the product
    protected ArrayList<String> product_name; //an array with the names of the product in different languages
    protected String id; //the id of the product
    protected ArrayList<String> ingredients ; //An array list of an array list because the json classify the ingredients first
}
/* countries
food_groups_tags
	0:
	1:
images
generic_name
id
ingredients
ingredients_text
labels
nutrient_levels:
	fat:
	salt:
	saturated-fat:
	sugars:
nutriments:
	(toutes les lignes sont trop cool)
packagings:
product_name
stores
serving_quantity
serving_size
selected_images
quantity
traces
*/
