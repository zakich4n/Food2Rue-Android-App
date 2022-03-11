package com.example.myfirstapp;

public class Score {

    public int note;
    public String date;
    public int position;

    public Score(){}

    public String toString(){
        return "Une note de "+note+" à la date "+date+" à la position "+position;
    }
}

