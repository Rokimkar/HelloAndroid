package com.example.snchit.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class HelloWorldActivity extends AppCompatActivity {

    String msg = "Android : ";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hello_world);
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(msg, "App Restarted");
    }

    @Override
    protected  void  onStart(){
        super.onStart();
        Log.d(msg, "App Started");
    }

    @Override
    protected  void  onPause(){
        super.onPause();
        Log.d(msg, "App Paused");
    }

    @Override
    protected  void onDestroy(){
        super.onDestroy();
        Log.d(msg, "App Destroyed");
    }

    @Override
    protected  void onStop(){
        super.onStop();
        Log.d(msg, "App Stopped");
    }
}
