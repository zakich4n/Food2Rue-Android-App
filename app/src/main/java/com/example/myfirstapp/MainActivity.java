package com.example.myfirstapp;


import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.media.AudioManager;
import android.media.ToneGenerator;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.util.SparseArray;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.myfirstapp.R;
import com.google.android.gms.vision.CameraSource;
import com.google.android.gms.vision.Detector;
import com.google.android.gms.vision.barcode.Barcode;
import com.google.android.gms.vision.barcode.BarcodeDetector;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        Button btn_go_to_barcode = (Button) findViewById(R.id.btn_to_barcode);
        btn_go_to_barcode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                go_to_barcode();
            }
        });

        Button btn_go_to_game = (Button) findViewById(R.id.btn_play);
        btn_go_to_game.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                go_to_game();
            }
        });

        Button btn_go_to_scoreboard = (Button) findViewById(R.id.btn_scoreboard);
        btn_go_to_scoreboard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                go_to_scoreboard();
            }
        });
    }

    public void go_to_barcode(){
        Intent intent_to_barcode = new Intent(this, BarcodeActivity.class);
        startActivity(intent_to_barcode);
    }

    public void go_to_game(){
        Intent intent_to_game = new Intent(this, GameActivity.class);
        startActivity(intent_to_game);
    }

    public void go_to_scoreboard(){
        Intent intent_to_scoreboard = new Intent (this, ScoreBoardActivity.class);
        startActivity(intent_to_scoreboard);
    }



}


