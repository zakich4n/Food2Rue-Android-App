package com.example.myfirstapp;

import java.util.ArrayList;

public class Articles {
    private String nom;
    private int poids;
    private String categorie;
    private String marque;
    private ArrayList<String> ingredients;
    private ArrayList<String> images;
    private String portion;
    private int calories;
    private int glucides;
    private int lipides;
    private int proteines;
    private String nutriscore;

    public Articles(){

    }

    public String toString(){
        return nom + " " + categorie + " " + "nutriscore";
    }
}
