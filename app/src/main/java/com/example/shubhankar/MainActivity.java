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


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("lifecycle", "onCreate: Activity created");
        Toast.makeText(getApplicationContext(), "CREATED BY SHUBHANKAR", Toast.LENGTH_LONG).show();

        Button btn = findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),layout.class);
                startActivity(intent);
            }
        });

        Button btn1= findViewById(R.id.login);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),login.class);
                startActivity(intent);
            }
        });

        Button btn2 = findViewById(R.id.fragmentButton);
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),fragmentLifeCycle.class);
                startActivity(intent);
            }
        });

        Button btn3 = findViewById(R.id.diffview);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), views.class);
                startActivity(intent);
            }
        });

        Button btn4 = findViewById(R.id.button2);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), views.class);
                startActivity(intent);
            }
        });

        Button btn5 = findViewById(R.id.button3);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), views.class);
                startActivity(intent);
            }
        });

        Button btn6 = findViewById(R.id.button4);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), views.class);
                startActivity(intent);
            }
        });

        Button btn7 = findViewById(R.id.button5);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), views.class);
                startActivity(intent);
            }
        });

        Button btn8 = findViewById(R.id.button6);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), views.class);
                startActivity(intent);
            }
        });

        Button btn9 = findViewById(R.id.button7);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), views.class);
                startActivity(intent);
            }
        });

        Button btn10 = findViewById(R.id.button8);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), views.class);
                startActivity(intent);
            }
        });

        Button btn11 = findViewById(R.id.button9);
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), views.class);
                startActivity(intent);
            }
        });
    }
}