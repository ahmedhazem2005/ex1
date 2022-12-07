package com.example.ex1;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ProgressDialog;
import android.os.AsyncTask;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class MainActivity extends AppCompatActivity {

        String[] ci ={"Baghdsd","Nasiria","Arbil","Basra"};

        @Override
        protected void onCreate(Bundle savedInstanceState)
        {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
              ArrayAdapter adapter = new ArrayAdapter<String>(this,R.layout.list_view,ci);
            ListView listView = (ListView) findViewById(R.id.mobile_list);
            listView.setAdapter(adapter);
        }

        public abstract class MyAsyncTasks extends AsyncTask<String,String,String> {
            @Override
            protected void onPreExecute() {
               super.onPreExecute();
               ProgressDialog progressDialog = new ProgressDialog(MainActivity.this);
                progressDialog.setMessage("processing results");
                progressDialog.setCancelable(false);
                progressDialog.show();
                progressDialog.dismiss();
            }

            @Override
            protected void onPostExecute(String s) {
                super.onPostExecute(s);
            }
        }
}