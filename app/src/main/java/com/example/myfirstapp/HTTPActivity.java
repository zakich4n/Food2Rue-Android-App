package com.example.myfirstapp;

import android.app.Dialog;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.jetbrains.annotations.NotNull;

import java.io.IOException;

import okhttp3.Call;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Callback;
import okhttp3.Response;

public class HTTPActivity extends AppCompatActivity {
    //public static String data_received = "";
    public static String URL = "https://world.openfoodfacts.org/api/v2/product/04963406";
    public String data = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.http_activity);
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
                                    setText(result);
                                }
                            } catch (Exception e) {
                                Log.e(TAG, "Exception = " + e);
                            }
                        }
                    }
                });
                showDialog();
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


    public void showDialog() {
        Dialog dialog= new Dialog(this);
        dialog.setContentView(R.layout.layout_custom_dialog);
        dialog.show();
    }

    private void setText(final String value){
        runOnUiThread(new Runnable() {
            @Override
            public void run() {
                setContentView(R.layout.layout_custom_dialog);
                TextView my_data = (TextView) findViewById(R.id.txtDesc);
                my_data.setText(value);
            }
        });
    }
}