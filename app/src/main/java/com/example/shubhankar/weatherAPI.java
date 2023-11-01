package com.example.shubhankar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class weatherAPI extends AppCompatActivity {

    EditText ed1;
    Button bt1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weather_api);

        ed1 = findViewById(R.id.country);
        bt1 = findViewById(R.id.search);


        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = ed1.getText().toString();
                Intent i =new Intent(getApplicationContext(), whether.class);
                i.putExtra(" ",name);
                startActivity(i);
            }
        });
    }

}