package com.example.myfirstapp;

import android.util.Log;

import java.util.ArrayList;

public class ScoreSingleton {

    private static final ScoreSingleton instance = new ScoreSingleton();

    public ArrayList<Score> score_list;

    private ScoreSingleton(){
        score_list = new ArrayList<>();
        Log.d("Debug", "Singleton instancié");
    }


    public static final ScoreSingleton getInstance() { return instance; }

    public static void log4Me(String message, String nomFonction){
        Log.d("Debug", nomFonction+" "+message);
    }


    public void addScoreList(){

        for (int i =1; i<11 ; i++){
            Score scoretmp = new Score();
            scoretmp.note = 12;
            scoretmp.date = "22/02/2222";
            scoretmp.position = i;
            score_list.add(scoretmp);
        }
        ScoreSingleton.log4Me(score_list.toString(), "addScoreList");

    }

}