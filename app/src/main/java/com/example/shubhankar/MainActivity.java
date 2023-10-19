package com.example.shubhankar;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
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
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), recyclerview.class);
                startActivity(intent);
            }
        });

        Button btn5 = findViewById(R.id.torch);
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Torch.class);
                startActivity(intent);
            }
        });

        Button btn6 = findViewById(R.id.ImageGallery);
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), ImageGallery.class);
                startActivity(intent);
            }
        });

        Button btn7 = findViewById(R.id.textToSpeech);
        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), Speech.class);
                startActivity(intent);
            }
        });

        Button btn8 = findViewById(R.id.gps);
        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), GpsService.class);
                startActivity(intent);
            }
        });

        Button btn9 = findViewById(R.id.filehandling);
        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), views.class);
                startActivity(intent);
            }
        });

        Button btn10 = findViewById(R.id.button8);
        btn10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), views.class);
                startActivity(intent);
            }
        });

        Button btn11 = findViewById(R.id.button9);
        btn11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), views.class);
                startActivity(intent);
            }
        });


    }
}