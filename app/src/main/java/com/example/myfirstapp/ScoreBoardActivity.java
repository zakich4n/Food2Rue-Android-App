package com.example.myfirstapp;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class ScoreBoardActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getSupportActionBar().hide();

        setContentView(R.layout.scoreboard);


        ScoreSingleton.getInstance().addScoreList();

        recyclerView = findViewById(R.id.recyclerview_score);

        recyclerView.setHasFixedSize(false);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new ScoreAdapter());

    }
}
