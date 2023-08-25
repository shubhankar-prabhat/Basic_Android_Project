package com.example.shubhankar;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class fragmentLifeCycle extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fraagment_life_cycle);
        Log.d("lifecycle", "onCreate: Activity created");
        Toast.makeText(getApplicationContext(), "Activity_CREATED", Toast.LENGTH_LONG).show();
    }

    protected void onStart() {
        super.onStart();
        //setContentView(R.layout.activity_main);
        Log.d("lifecycle", "onStart: Activity started");
    }
    protected void onResume() {
        super.onResume();
        Log.d("lifecycle","onResume: Activity resumed");
    }
    protected void onPause() {
        super.onPause();
        Log.d("lifecycle","onPause: Activity Paused");
    }

    protected void onStop() {
        super.onStop();
        Log.d("lifecycle","onStop: Activity stopped");
    }

    protected void onRestart() {
        super.onRestart();
        Log.d("lifecycle","onRestart: Activity restarted");
    }

    protected void onDestroy() {
        super.onDestroy();
        Log.d("lifecycle","onDestroy: Activity destroyed");
    }
}