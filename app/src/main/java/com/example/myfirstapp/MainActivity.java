package com.example.myfirstapp;

import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.jetbrains.annotations.NotNull;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import okhttp3.Call;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Callback;
import okhttp3.Response;

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
                OkHttpClient client = new OkHttpClient();
                Request request=new Request.Builder()
                        .get()
                        .url(URL)
                        .build();
                client.newCall(request).enqueue(new Callback() {
                    private final String TAG = null;

                    @Override
                    public void onFailure(@NotNull Call call, @NotNull IOException e) {

                    }

                    @Override
                    public void onResponse(@NotNull Call call, @NotNull Response response) throws IOException {
                        if (response.isSuccessful()) {
                            try {
                                final String result = response.body().string();
                                if (!TextUtils.isEmpty(result)) {
                                    //JSONObject obj = new JSONObject(result);
                                    //String jsonAsString = obj.toString();
                                    TextView textview1 = (TextView) findViewById(R.id.txtDesc);
                                    textview1.setText(result);
                                    setContentView(textview1);
                                }
                            } catch (Exception e) {
                                Log.e(TAG, "Exception = " + e);
                            }
                        }
                    }
                });
            }
        });
    }

    public class DownloadAsyncTask extends AsyncTask<String,Integer,String> {

        @Override
        protected String doInBackground(String... strings) {
            return null;
        }

        @Override
        protected void onPreExecute(){

        }

        @Override
        protected void onPostExecute(String s){

        }

        @Override
        protected void onProgressUpdate(Integer... values){

        }


    }

}