package com.example.myfirstapp;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class ArticleFormActivity extends AppCompatActivity {

    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getSupportActionBar().hide();

        setContentView(R.layout.article_form2);
    }

}
