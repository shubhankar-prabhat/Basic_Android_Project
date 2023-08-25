package com.example.shubhankar;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btn,btn1,btn2,btn3;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("lifecycle", "onCreate: Activity created");
        Toast.makeText(getApplicationContext(), "CREATED BY SHUBHANKAR", Toast.LENGTH_LONG).show();

        btn = findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),layout.class);
                startActivity(intent);
            }
        });

        btn1= findViewById(R.id.login);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),login.class);
                startActivity(intent);
            }
        });

        btn2 = findViewById(R.id.fragmentButton);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),fragmentLifeCycle.class);
                startActivity(intent);
            }
        });

        btn3 = findViewById(R.id.diffview);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), views.class);
                startActivity(intent);
            }
        });
    }

    public void button(){
        Intent intent = new Intent(this,layout.class);
        startActivity(intent);
    }
    public void fragmentButton(){
        Intent intent = new Intent(this,fragmentLifeCycle.class);
        startActivity(intent);
    }
    public void login(){
        Intent intent = new Intent(this,login.class);
        startActivity(intent);
    }
    public void views(){
        Intent intent = new Intent(this,views.class);
        startActivity(intent);
    }

}