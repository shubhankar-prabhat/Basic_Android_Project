package com.example.shubhankar;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class login extends AppCompatActivity {

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        TextView signup= findViewById(R.id.newuser);
            signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(),signup.class);
                startActivity(intent);
            }
        });

        Button login= findViewById(R.id.securelogin);
        EditText username = findViewById(R.id.editTextEmailAddress);
        EditText password = findViewById(R.id.editTextPassword);
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (username.getText().toString().equals("admin") && password.getText().toString().equals("1234")) {
                    Toast.makeText(getApplicationContext(), "LOGIN SUCCESSFUL! ", Toast.LENGTH_LONG).show();

                    Intent intent = new Intent(getApplicationContext(),recyclerview.class);
                    startActivity(intent);
                } else {
                    Toast.makeText(getApplicationContext(), "Login Failed!", Toast.LENGTH_SHORT).show();
                }


            }
        });


    }
}