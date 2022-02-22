package com.example.myfirstapp;

import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;

public class MainActivity extends AppCompatActivity {
    //public static String data_received = "";
    public static String URL = "https://world.openfoodfacts.org/api/v2/product/04963406";
    public String data = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button_connection = (Button) findViewById(R.id.button_connected);

        button_connection.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }

    public class DownloadAsyncTask extends AsyncTask<String,Integer,String> {

        @Override
        protected String doInBackground(String... strings) {
            try {
                URL url = new URL(strings[0]);
                HttpsURLConnection connection = null;
                connection = (HttpsURLConnection) url.openConnection();
                connection.setReadTimeout(15000);
                connection.setConnectTimeout(15000);
                connection.setDoInput(true);
                connection.setRequestMethod("GET");
                connection.connect();
                InputStream stream = connection.getInputStream();
                BufferedReader reader = new BufferedReader(new InputStreamReader(stream));
                StringBuilder result = new StringBuilder();
                String line = "";
                int counter = 0;
                while ((line = reader.readLine()) != null) {
                    result.append(line);
                    counter++;
                    publishProgress(counter / 10);

                }
                return result.toString();
            }
            catch (IOException e){
                return e.getMessage();
            }


        }
        @Override
        protected void onPreExecute(){
            textView_progress.setVisibility(View.VISIBLE);
        }

        @Override
        protected void onPostExecute(String s){
            Singleton.log4me(s, "onPostExecute");
            Singleton.getInstance().parseJSON(s);
            textView_progress.setVisibility(View.INVISIBLE);
            recyclerView.getAdapter().notifyDataSetChanged();
        }

        @Override
        protected void onProgressUpdate(Integer... values){
            textView_progress.setText("Downloading : " + values[0]*10+"%");
        }


    }

}